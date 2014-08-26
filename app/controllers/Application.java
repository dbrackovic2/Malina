package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {
    
    public static Result index() {
        return ok(views.html.index.render("Malina"));
    }
    
    public static Result login() {
    	return ok(views.html.login.render("login"));
    }
    
}
