// @SOURCE:C:/play/activator-1.2.3/Malina/conf/routes
// @HASH:3f89b85a6c1883b625767267e48fc8faa2f7ac8b
// @DATE:Wed Sep 03 18:01:57 CEST 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:5
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:6
private[this] lazy val controllers_Application_register1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("register"))))
        

// @LINE:7
private[this] lazy val controllers_Application_registerCallback2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("register_callback"))))
        

// @LINE:8
private[this] lazy val controllers_Application_login3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:10
private[this] lazy val controllers_Application_indexLog4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("indexLog"))))
        

// @LINE:11
private[this] lazy val controllers_Application_logout5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:13
private[this] lazy val controllers_Application_profile6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("profile/"))))
        

// @LINE:16
private[this] lazy val controllers_Application_javascriptRoutes7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/javascripts/routes"))))
        

// @LINE:19
private[this] lazy val controllers_Assets_at8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:20
private[this] lazy val controllers_WebJarAssets_at9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("webjars/"),DynamicPart("file", """.+""",false))))
        

// @LINE:22
private[this] lazy val controllers_Application_newPost10 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("newPost"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register""","""controllers.Application.register()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register_callback""","""controllers.Application.registerCallback()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """indexLog""","""controllers.Application.indexLog()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profile/""","""controllers.Application.profile()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/javascripts/routes""","""controllers.Application.javascriptRoutes()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """webjars/$file<.+>""","""controllers.WebJarAssets.at(file:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """newPost""","""controllers.Application.newPost()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:5
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:6
case controllers_Application_register1(params) => {
   call { 
        invokeHandler(controllers.Application.register(), HandlerDef(this, "controllers.Application", "register", Nil,"GET", """""", Routes.prefix + """register"""))
   }
}
        

// @LINE:7
case controllers_Application_registerCallback2(params) => {
   call { 
        invokeHandler(controllers.Application.registerCallback(), HandlerDef(this, "controllers.Application", "registerCallback", Nil,"GET", """""", Routes.prefix + """register_callback"""))
   }
}
        

// @LINE:8
case controllers_Application_login3(params) => {
   call { 
        invokeHandler(controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil,"GET", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:10
case controllers_Application_indexLog4(params) => {
   call { 
        invokeHandler(controllers.Application.indexLog(), HandlerDef(this, "controllers.Application", "indexLog", Nil,"GET", """""", Routes.prefix + """indexLog"""))
   }
}
        

// @LINE:11
case controllers_Application_logout5(params) => {
   call { 
        invokeHandler(controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:13
case controllers_Application_profile6(params) => {
   call { 
        invokeHandler(controllers.Application.profile(), HandlerDef(this, "controllers.Application", "profile", Nil,"GET", """""", Routes.prefix + """profile/"""))
   }
}
        

// @LINE:16
case controllers_Application_javascriptRoutes7(params) => {
   call { 
        invokeHandler(controllers.Application.javascriptRoutes(), HandlerDef(this, "controllers.Application", "javascriptRoutes", Nil,"GET", """ Javascript routing""", Routes.prefix + """assets/javascripts/routes"""))
   }
}
        

// @LINE:19
case controllers_Assets_at8(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:20
case controllers_WebJarAssets_at9(params) => {
   call(params.fromPath[String]("file", None)) { (file) =>
        invokeHandler(controllers.WebJarAssets.at(file), HandlerDef(this, "controllers.WebJarAssets", "at", Seq(classOf[String]),"GET", """""", Routes.prefix + """webjars/$file<.+>"""))
   }
}
        

// @LINE:22
case controllers_Application_newPost10(params) => {
   call { 
        invokeHandler(controllers.Application.newPost(), HandlerDef(this, "controllers.Application", "newPost", Nil,"POST", """""", Routes.prefix + """newPost"""))
   }
}
        
}

}
     