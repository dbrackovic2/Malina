
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
object indexLog extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,List[Post],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user: String)(postovi: List[Post]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.37*/("""


<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Malina</title>

    <!-- Bootstrap     
    <link href="/assets/stylesheets/font-awesome.min.css" rel="stylesheet">
    <link href="/assets/stylesheets/bootstrap.min.css" rel="stylesheet">
	<link href="/assets/stylesheets/login.css" rel="stylesheet">
	<link href="/assets/stylesheets/style.css" rel="stylesheet">
	<link href="/assets/stylesheets/shareform.css" rel="stylesheet">-->
	<link href=""""),_display_(Seq[Any](/*18.15*/routes/*18.21*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*18.64*/("""" rel="stylesheet">
	<link href=""""),_display_(Seq[Any](/*19.15*/routes/*19.21*/.Assets.at("stylesheets/style.css"))),format.raw/*19.56*/("""" rel="stylesheet">
	<link href=""""),_display_(Seq[Any](/*20.15*/routes/*20.21*/.Assets.at("stylesheets/font-awesome.min.css"))),format.raw/*20.67*/("""" rel="stylesheet">
	<link href=""""),_display_(Seq[Any](/*21.15*/routes/*21.21*/.Assets.at("stylesheets/login.css"))),format.raw/*21.56*/("""" rel="stylesheet">
	<link href=""""),_display_(Seq[Any](/*22.15*/routes/*22.21*/.Assets.at("stylesheets/shareform.css"))),format.raw/*22.60*/("""" rel="stylesheet">
	

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
				<a href=""""),_display_(Seq[Any](/*43.15*/routes/*43.21*/.Application.index())),format.raw/*43.41*/("""" title="Home" class="navbar-brand logo">
					Home
				</a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li class="active"><a href=""""),_display_(Seq[Any](/*49.35*/routes/*49.41*/.Application.index())),format.raw/*49.61*/("""">Home</a></li>
					<li><a href=""""),_display_(Seq[Any](/*50.20*/routes/*50.26*/.Application.profile())),format.raw/*50.48*/("""">"""),_display_(Seq[Any](/*50.51*/user)),format.raw/*50.55*/("""</a></li>
					<li><a href=""""),_display_(Seq[Any](/*51.20*/routes/*51.26*/.Application.logout())),format.raw/*51.47*/("""">Sign out</a></li>
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
								<li><a href=""""),_display_(Seq[Any](/*63.23*/routes/*63.29*/.Application.logout())),format.raw/*63.50*/("""">Sign out</a></li>
							</ul>
						</a>
					</li>
				</ul>
			</div>
		</div>
	</div>
	
	<br><br>
	
	<div class="container">
		<div class="row">
			<div class="col-md-6 col-md-offset-3">
		        <hgroup>
		          <h2>Post new music</h2>
		        </hgroup>
		    	 <div class="well">
		             <form method="POST" action=""""),_display_(Seq[Any](/*81.45*/routes/*81.51*/.Application.newPost())),format.raw/*81.73*/("""">
		              <div class="input-group">
		                 <input class="btn btn-lg" name="link" id="link" type="link" placeholder="Paste YOUTUBE URL here" required>
		                 <a href><button class="btn btn-info btn-lg" type="submit" onclick="">Share</button>
		              </div>
		             </form>
		    	 </div>
			</div>
			<div class="col-md-6 col-md-offset-3">
			
			"""),_display_(Seq[Any](/*91.5*/for(p <- postovi) yield /*91.22*/{_display_(Seq[Any](format.raw/*91.23*/("""
				<iframe width="420" height="315" src="""),_display_(Seq[Any](/*92.43*/p/*92.44*/.url)),format.raw/*92.48*/(""" frameborder="0" allowfullscreen></iframe>
			""")))})),format.raw/*93.5*/("""
			</div>
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
    <script src=""""),_display_(Seq[Any](/*111.19*/routes/*111.25*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*111.67*/(""""></script>
  
  </body>

</html>
"""))}
    }
    
    def render(user:String,postovi:List[Post]): play.api.templates.HtmlFormat.Appendable = apply(user)(postovi)
    
    def f:((String) => (List[Post]) => play.api.templates.HtmlFormat.Appendable) = (user) => (postovi) => apply(user)(postovi)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Sep 09 15:17:21 CEST 2014
                    SOURCE: C:/play/activator-1.2.3/Malina/app/views/indexLog.scala.html
                    HASH: 8d72e54d18da8fe509c1ee625a0cd37434cd49f1
                    MATRIX: 788->1|917->36|1580->663|1595->669|1660->712|1731->747|1746->753|1803->788|1874->823|1889->829|1957->875|2028->910|2043->916|2100->951|2171->986|2186->992|2247->1031|3143->1891|3158->1897|3200->1917|3434->2115|3449->2121|3491->2141|3563->2177|3578->2183|3622->2205|3661->2208|3687->2212|3753->2242|3768->2248|3811->2269|4308->2730|4323->2736|4366->2757|4759->3114|4774->3120|4818->3142|5258->3547|5291->3564|5330->3565|5410->3609|5420->3610|5446->3614|5525->3662|6088->4188|6104->4194|6169->4236
                    LINES: 26->1|29->1|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|71->43|71->43|71->43|77->49|77->49|77->49|78->50|78->50|78->50|78->50|78->50|79->51|79->51|79->51|91->63|91->63|91->63|109->81|109->81|109->81|119->91|119->91|119->91|120->92|120->92|120->92|121->93|139->111|139->111|139->111
                    -- GENERATED --
                */
            