package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.databind.JsonNode;

import play.data.validation.Constraints.MaxLength;
import play.data.validation.Constraints.Required;
import play.db.ebean.Model;
import controllers.Application;
import java.util.List;



@Entity
public class RegisteredUser extends Model{

	@Id
    public Long id;
    
    @Required
    public String name;
    
    @MaxLength(value = 200)
    public String description;
    
    @Required
    public String pictureUrl;
    
    @Required
    public String twitterId;
    
    @Required
    public Date registrationDate = new Date(System.currentTimeMillis());
    
    public static String fixUrl(String url){
    	url = url.replace("_normal", "");
    	return url;
    }
    
    public static RegisteredUser fromJson(JsonNode twitterJson) {
        RegisteredUser u = new RegisteredUser();
        u.name = twitterJson.findPath("name").asText();
        u.twitterId = twitterJson.findPath("screen_name").asText();
        u.description = twitterJson.findPath("description").asText();
        u.pictureUrl = twitterJson.findPath("profile_image_url").asText();
        u.pictureUrl = fixUrl(u.pictureUrl);
        Application.saveSession(u.twitterId);
        
        return u;        
    }
    
    public static Model.Finder<String,RegisteredUser> find = new 
    		Model.Finder<String,RegisteredUser>(String.class, RegisteredUser.class);


    
    public static RegisteredUser searchByTwitterId(String TwitterId){
    	List<RegisteredUser> listaUsera = RegisteredUser.find.all();
    	for(int i=0;i<listaUsera.size();i++){
    		if(listaUsera.get(i).twitterId.equals(TwitterId))
    			return listaUsera.get(i);
    	}
    	RegisteredUser u = new RegisteredUser();
    	u.twitterId = "";
    	u.name="";
    	return u;
    }
    
    public static RegisteredUser lastUser(){
    	List<RegisteredUser> lista = RegisteredUser.find.orderBy("id desc").setMaxRows(1).findList();
    	return lista.get(0);
    }
        
}
