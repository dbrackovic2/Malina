
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
        _display_ {

Seq[Any](format.raw/*1.17*/("""

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>"""),_display_(Seq[Any](/*9.13*/title)),format.raw/*9.18*/("""</title>

    <!-- Bootstrap -->
	<link href="/assets/stylesheets/bootstrap.min.css" rel="stylesheet">
	<link href="/assets/stylesheets/style.css" rel="stylesheet">

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
				<a href="/" title="Home" class="navbar-brand logo">
					Home
				</a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li class="active"><a href="/">Home</a></li>
					<li><a href="/login">Sign in</a></li>
					<li><a href="#">Sign up</a></li>
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">
							Options<b class="caret"></b>
						</a>
							<ul class="dropdown-menu">
								<li><a href="#">About me</a></li>
								<li><a href="#">Help</a></li>
								<li class="divider"></li>
								<li><a href="#">Settings</a></li>
								<li><a href="#">Muzika</a></li>
								<li class="divider"></li>
								<li><a href="#">Sign up</a></li>
							</ul>
						</a>
					</li>
				</ul>
			</div>
		</div>
	</div>
	
	<div class="container">
		<div class="jumbotron">
			<img src="/assets/images/untitled.png" class="img-responsive" alt="Responsive">
		</div>
	</div>
	<!-- footer-->
	<div class="navbar navbar-inverse navbar-fixed-bottom" role="navigation">
		<div class="container">
			<div class="navbar-text pull-left">
			<p>©Malina 2014</p>
		</div>
	</div>


    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="/assets/javascripts/bootstrap.min.js"></script>
    <script src="/assets/javascripts/loginscript.js"></script>
  
  	<div id="fb-root"></div>
  
    <fb:login-button scope="public_profile,email" onlogin="checkLoginState();">
    </fb:login-button>
  <div id="status">
  </div>
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
                    DATE: Wed Aug 27 00:14:37 CEST 2014
                    SOURCE: C:/play/activator-1.2.3/Malina/app/views/login.scala.html
                    HASH: 827d0063de5efa1d4cb98edbde80ab00dc44503c
                    MATRIX: 774->1|883->16|1132->230|1158->235
                    LINES: 26->1|29->1|37->9|37->9
                    -- GENERATED --
                */
            