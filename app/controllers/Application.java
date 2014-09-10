package controllers;

import models.RegisteredUser;
import play.mvc.Controller;
import play.mvc.Result;
import play.data.*;
import play.*;
import play.mvc.*;
import external.services.OAuthService;
import external.services.TwitterOAuthService;
import play.libs.F.Callback;
import play.libs.F.Function;
import play.libs.F.Promise;
import play.libs.F.Tuple;
import play.libs.OAuth.RequestToken;
import views.html.*;
import java.util.Date;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.List;

import models.Post;

public class Application extends Controller {
	
	private static String sesija = "";
	
	public static void saveSession(String tid){
		sesija=tid;
		session("twitterId", tid);
        flash("twitterId",tid);
		
	}
	
	public static boolean isLogged(){
		if (session("twitterId")!=null)return true;
		else return false;
	}
	
	private static final OAuthService service = new TwitterOAuthService(
			Play.application().configuration().getString("twitter.consumer.key"),
			Play.application().configuration().getString("twitter.consumer.secret")
			);
    
    public static Result index() {
    	if(isLogged())return redirect(routes.Application.indexLog());
        return ok(views.html.index.render("Malina"));
    }
    
    public static Result login() {
    	if(isLogged())return redirect(routes.Application.indexLog());
    	return ok(views.html.login.render("Malina"));
    }
    
    public static Result register(){
    	if(isLogged())
    	return redirect(routes.Application.indexLog());
    	else{
    	String callbackUrl = routes.Application.registerCallback().absoluteURL(request());
    	Tuple<String, RequestToken> t = service.retrieveRequestToken(callbackUrl);
    	flash("request_token", t._2.token);
    	flash("request_secret", t._2.secret);
    	return redirect(t._1);}
    	}
    
    public static Result registerCallback(){
    	//if(session("twitterId")!=null)
    	//Application.saveSession(session("twitterId"));
    	RequestToken token = new RequestToken(flash("request_token"), flash("request_secret"));
    	String authVerifier = request().getQueryString("oauth_verifier");  	
        Promise<JsonNode> userProfile = service.registeredUserProfile(token, authVerifier);
    	userProfile.onRedeem(new Callback<JsonNode>(){

            @Override
            public void invoke(JsonNode twitterJson) throws Throwable {
                RegisteredUser user = RegisteredUser.fromJson(twitterJson);
                RegisteredUser reguser = RegisteredUser.searchByTwitterId(user.twitterId);
                sesija= user.twitterId;
                if(!user.twitterId.equals(reguser.twitterId) && !reguser.twitterId.equals(""))
                user.save();
                Application.saveSession(user.twitterId); 
            }
                        
        });
    	RegisteredUser zadnji = RegisteredUser.lastUser();
    	Application.saveSession(zadnji.twitterId);
    	return redirect(routes.Application.indexLog());
    	
    }
    
    @Security.Authenticated(Secured.class)
    public static Result indexLog(){ 
    	return ok(views.html.indexLog.render(sesija,Post.listaPostova()));
    }
    
    @Security.Authenticated(Secured.class)
    public static Result logout() {
    	sesija="";
        session().clear();
        flash("success", "You've been logged out");
        flash("twitterId","");
        return redirect(
            routes.Application.login()
        );
    }
    
    public static Result javascriptRoutes() {
        response().setContentType("text/javascript");
        return ok(
          Routes.javascriptRouter("jsRoutes",
            // Routes
            controllers.routes.javascript.Application.indexLog(),
            controllers.routes.javascript.Application.logout()
          )
        );
      }
    @Security.Authenticated(Secured.class)
    public static Result profile(){
    	Application.saveSession(sesija);
    	RegisteredUser reguser = RegisteredUser.searchByTwitterId(sesija);
    	return ok(views.html.profile.render(reguser));
    }
    
    @Security.Authenticated(Secured.class)
    public static Result newPost(){
    	DynamicForm requestData = Form.form().bindFromRequest();
    	String link = requestData.get("link");
    	String code = link.substring(link.lastIndexOf('=')+1);
    	Post post = new Post();
    	post.url = "https://www.youtube.com/embed/"+code;
    	post.postDate = new Date(System.currentTimeMillis());
    	post.save();
    	return redirect(routes.Application.indexLog());
    }
}
