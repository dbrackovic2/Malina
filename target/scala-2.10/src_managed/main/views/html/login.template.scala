
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import controllers.routes.javascript._


Seq[Any](format.raw/*1.17*/("""

"""),format.raw/*4.1*/("""
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>"""),_display_(Seq[Any](/*11.13*/title)),format.raw/*11.18*/("""</title>

    <!-- Bootstrap -->    
    <link href=""""),_display_(Seq[Any](/*14.18*/routes/*14.24*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*14.67*/("""" rel="stylesheet">
	<link href=""""),_display_(Seq[Any](/*15.15*/routes/*15.21*/.Assets.at("stylesheets/style.css"))),format.raw/*15.56*/("""" rel="stylesheet">
	<link href=""""),_display_(Seq[Any](/*16.15*/routes/*16.21*/.Assets.at("stylesheets/font-awesome.min.css"))),format.raw/*16.67*/("""" rel="stylesheet">
	<link href=""""),_display_(Seq[Any](/*17.15*/routes/*17.21*/.Assets.at("stylesheets/login.css"))),format.raw/*17.56*/("""" rel="stylesheet">
	
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head> 

  <body>
 
   
  	<div class="navbar navbar-default navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a href=""""),_display_(Seq[Any](/*39.15*/routes/*39.21*/.Application.index())),format.raw/*39.41*/("""" title="Home" class="navbar-brand logo">
					Home
				</a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li class="active"><a href=""""),_display_(Seq[Any](/*45.35*/routes/*45.41*/.Application.index())),format.raw/*45.61*/("""">Home</a></li>
					<li><a href=""""),_display_(Seq[Any](/*46.20*/routes/*46.26*/.Application.login())),format.raw/*46.46*/("""">Sign in</a></li>
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">
							Options<b class="caret"></b>
						</a>
							<ul class="dropdown-menu">
								<li><a href="#">About Malina</a></li>
								<li><a href="#">Help</a></li>
								<li class="divider"></li>
								<li><a href="#">Settings</a></li>
								<li><a href="#">Music</a></li>
								<li class="divider"></li>
								<li><a href=""""),_display_(Seq[Any](/*58.23*/routes/*58.29*/.Application.login())),format.raw/*58.49*/("""">Sign in</a></li>
							</ul>
						</a>
					</li>
				</ul>
			</div>
		</div>
	</div>
	
	<br><br>
	
	<div class="container">
      <div class="jumbotron">
	      	<h1>Login</h1>
	      	<p>You can log into Malina with your twitter account!</p>
	      	<p>You don't have twitter account?</p>
	      	<p>Get one</p>    	
	      	<a href="https://twitter.com" class="btn btn-lg btn-primary" target="blank" role="button">HERE</a>
	        <br><br>
	      	<p>Already have an twitter account?</p>
			<a href=""""),_display_(Seq[Any](/*78.14*/routes/*78.20*/.Application.register())),format.raw/*78.43*/("""" class="btn btn-lg btn-info" >
            Login with Twitter
            </a>
      </div>      
	</div>
	<!-- footer-->
	<div class="navbar navbar-inverse navbar-fixed-bottom" role="navigation">
		<div class="container">
			<div class="navbar-text pull-left">
				<p>©Malina 2014</p>
			</div>
		</div>
	</div>
	

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="/assets/javascripts/bootstrap.min.js"></script>
  
  	
  
  </body>

</html>
"""))}
    }
    
    def render(title:String): play.api.templates.HtmlFormat.Appendable = apply(title)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (title) => apply(title)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Sep 09 14:26:31 CEST 2014
                    SOURCE: C:/play/activator-1.2.3/Malina/app/views/login.scala.html
                    HASH: edb26e4e6be01b20ef4c1f0411ec21a8af735014
                    MATRIX: 774->1|922->16|950->58|1199->271|1226->276|1316->330|1331->336|1396->379|1466->413|1481->419|1538->454|1608->488|1623->494|1691->540|1761->574|1776->580|1833->615|2713->1459|2728->1465|2770->1485|2998->1677|3013->1683|3055->1703|3126->1738|3141->1744|3183->1764|3667->2212|3682->2218|3724->2238|4270->2748|4285->2754|4330->2777
                    LINES: 26->1|30->1|32->4|39->11|39->11|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|67->39|67->39|67->39|73->45|73->45|73->45|74->46|74->46|74->46|86->58|86->58|86->58|106->78|106->78|106->78
                    -- GENERATED --
                */
            