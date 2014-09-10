
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
object profile extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[RegisteredUser,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user:RegisteredUser):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.23*/("""


<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Malina</title>

    <!-- Bootstrap -->    
    <link href=""""),_display_(Seq[Any](/*13.18*/routes/*13.24*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*13.67*/("""" rel="stylesheet">
	<link href=""""),_display_(Seq[Any](/*14.15*/routes/*14.21*/.Assets.at("stylesheets/style.css"))),format.raw/*14.56*/("""" rel="stylesheet">
	<link href=""""),_display_(Seq[Any](/*15.15*/routes/*15.21*/.Assets.at("stylesheets/font-awesome.min.css"))),format.raw/*15.67*/("""" rel="stylesheet">
	<link href=""""),_display_(Seq[Any](/*16.15*/routes/*16.21*/.Assets.at("stylesheets/login.css"))),format.raw/*16.56*/("""" rel="stylesheet">
	<link href=""""),_display_(Seq[Any](/*17.15*/routes/*17.21*/.Assets.at("stylesheets/shareform.css"))),format.raw/*17.60*/("""" rel="stylesheet">
	

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
				<a href=""""),_display_(Seq[Any](/*40.15*/routes/*40.21*/.Application.indexLog())),format.raw/*40.44*/("""" title="Home" class="navbar-brand logo">
					Home
				</a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li class="active"><a href=""""),_display_(Seq[Any](/*46.35*/routes/*46.41*/.Application.indexLog())),format.raw/*46.64*/("""">Home</a></li>
					<li><a href=""""),_display_(Seq[Any](/*47.20*/routes/*47.26*/.Application.profile())),format.raw/*47.48*/("""">"""),_display_(Seq[Any](/*47.51*/user/*47.55*/.name)),format.raw/*47.60*/("""</a></li>
					<li><a href=""""),_display_(Seq[Any](/*48.20*/routes/*48.26*/.Application.logout())),format.raw/*48.47*/("""">Sign out</a></li>
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
								<li><a href=""""),_display_(Seq[Any](/*60.23*/routes/*60.29*/.Application.logout())),format.raw/*60.50*/("""">Sign out</a></li>
							</ul>
						</a>
					</li>
				</ul>
			</div>
		</div>
	</div>
	
	<br><br>
	
	<div class="col-xs-12 col-sm-6 col-md-6 topprofil">
            <div class="well well-sm">
                <div class="row">
                    <div class="col-sm-6 col-md-4">
                        <img src=""""),_display_(Seq[Any](/*75.36*/user/*75.40*/.pictureUrl)),format.raw/*75.51*/("""" alt="Slika" class="img-rounded img-responsive" />
                    </div>
                    <div class="col-sm-6 col-md-8">
                        <h4>
                            """),_display_(Seq[Any](/*79.30*/user/*79.34*/.name)),format.raw/*79.39*/("""</h4>
                        <small><cite title="San Francisco, USA"><i class="glyphicon glyphicon-map-marker">
                        </i>Podaci</cite></small>
                        <p>
                            <i class="glyphicon glyphicon-envelope"></i>description: """"),_display_(Seq[Any](/*83.88*/user/*83.92*/.description)),format.raw/*83.104*/(""""
                            <br />
                        </p> 
                        <p>
                            TwitterId: """"),_display_(Seq[Any](/*87.42*/user/*87.46*/.twitterId)),format.raw/*87.56*/(""""
                            <br />
                        </p>                         
                    </div>
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
    <script src=""""),_display_(Seq[Any](/*108.19*/routes/*108.25*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*108.67*/(""""></script>
  
  	
  
  </body>

</html>
"""))}
    }
    
    def render(user:RegisteredUser): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((RegisteredUser) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Sep 09 14:48:00 CEST 2014
                    SOURCE: C:/play/activator-1.2.3/Malina/app/views/profile.scala.html
                    HASH: 3c664d55b1364d85055183e07bf396b8230516be
                    MATRIX: 784->1|899->22|1221->308|1236->314|1301->357|1372->392|1387->398|1444->433|1515->468|1530->474|1598->520|1669->555|1684->561|1741->596|1812->631|1827->637|1888->676|2793->1545|2808->1551|2853->1574|3087->1772|3102->1778|3147->1801|3219->1837|3234->1843|3278->1865|3317->1868|3330->1872|3357->1877|3423->1907|3438->1913|3481->1934|3978->2395|3993->2401|4036->2422|4406->2756|4419->2760|4452->2771|4681->2964|4694->2968|4721->2973|5039->3255|5052->3259|5087->3271|5263->3411|5276->3415|5308->3425|6021->4101|6037->4107|6102->4149
                    LINES: 26->1|29->1|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|68->40|68->40|68->40|74->46|74->46|74->46|75->47|75->47|75->47|75->47|75->47|75->47|76->48|76->48|76->48|88->60|88->60|88->60|103->75|103->75|103->75|107->79|107->79|107->79|111->83|111->83|111->83|115->87|115->87|115->87|136->108|136->108|136->108
                    -- GENERATED --
                */
            