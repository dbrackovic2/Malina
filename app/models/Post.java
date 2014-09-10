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
public class Post extends Model{
	
	@Id
    public Long id;
    
    @Required
    public String url;
    
    public static Model.Finder<String,Post> find = new 
    		Model.Finder<String,Post>(String.class, Post.class);
    
    @Required
    public Date postDate = new Date(System.currentTimeMillis());
    
    public static List<Post> listaPostova(){
    	return Post.find.orderBy("postDate desc").findList();
    }
    

}
