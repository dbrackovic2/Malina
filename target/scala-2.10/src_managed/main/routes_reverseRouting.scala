// @SOURCE:C:/play/activator-1.2.3/Malina/conf/routes
// @HASH:3f89b85a6c1883b625767267e48fc8faa2f7ac8b
// @DATE:Wed Sep 03 18:01:57 CEST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
package controllers {

// @LINE:20
class ReverseWebJarAssets {
    

// @LINE:20
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "webjars/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:19
class ReverseAssets {
    

// @LINE:19
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:22
// @LINE:16
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
class ReverseApplication {
    

// @LINE:7
def registerCallback(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "register_callback")
}
                                                

// @LINE:13
def profile(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "profile/")
}
                                                

// @LINE:10
def indexLog(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "indexLog")
}
                                                

// @LINE:11
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:6
def register(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "register")
}
                                                

// @LINE:22
def newPost(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "newPost")
}
                                                

// @LINE:5
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:16
def javascriptRoutes(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/javascripts/routes")
}
                                                

// @LINE:8
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          
}
                  


// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
package controllers.javascript {

// @LINE:20
class ReverseWebJarAssets {
    

// @LINE:20
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WebJarAssets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:19
class ReverseAssets {
    

// @LINE:19
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:22
// @LINE:16
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
class ReverseApplication {
    

// @LINE:7
def registerCallback : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.registerCallback",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register_callback"})
      }
   """
)
                        

// @LINE:13
def profile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.profile",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile/"})
      }
   """
)
                        

// @LINE:10
def indexLog : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.indexLog",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "indexLog"})
      }
   """
)
                        

// @LINE:11
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:6
def register : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.register",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
      }
   """
)
                        

// @LINE:22
def newPost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.newPost",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "newPost"})
      }
   """
)
                        

// @LINE:5
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:16
def javascriptRoutes : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.javascriptRoutes",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/javascripts/routes"})
      }
   """
)
                        

// @LINE:8
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
package controllers.ref {


// @LINE:20
class ReverseWebJarAssets {
    

// @LINE:20
def at(file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WebJarAssets.at(file), HandlerDef(this, "controllers.WebJarAssets", "at", Seq(classOf[String]), "GET", """""", _prefix + """webjars/$file<.+>""")
)
                      
    
}
                          

// @LINE:19
class ReverseAssets {
    

// @LINE:19
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:22
// @LINE:16
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
class ReverseApplication {
    

// @LINE:7
def registerCallback(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.registerCallback(), HandlerDef(this, "controllers.Application", "registerCallback", Seq(), "GET", """""", _prefix + """register_callback""")
)
                      

// @LINE:13
def profile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.profile(), HandlerDef(this, "controllers.Application", "profile", Seq(), "GET", """""", _prefix + """profile/""")
)
                      

// @LINE:10
def indexLog(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.indexLog(), HandlerDef(this, "controllers.Application", "indexLog", Seq(), "GET", """""", _prefix + """indexLog""")
)
                      

// @LINE:11
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:6
def register(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.register(), HandlerDef(this, "controllers.Application", "register", Seq(), "GET", """""", _prefix + """register""")
)
                      

// @LINE:22
def newPost(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.newPost(), HandlerDef(this, "controllers.Application", "newPost", Seq(), "POST", """""", _prefix + """newPost""")
)
                      

// @LINE:5
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """""", _prefix + """""")
)
                      

// @LINE:16
def javascriptRoutes(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.javascriptRoutes(), HandlerDef(this, "controllers.Application", "javascriptRoutes", Seq(), "GET", """ Javascript routing""", _prefix + """assets/javascripts/routes""")
)
                      

// @LINE:8
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      
    
}
                          
}
        
    