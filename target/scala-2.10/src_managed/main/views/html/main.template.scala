
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>"""),_display_(Seq[Any](/*9.13*/title)),format.raw/*9.18*/("""</title>

    <!-- Bootstrap -->	
	<link href=""""),_display_(Seq[Any](/*12.15*/routes/*12.21*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*12.64*/("""" rel="stylesheet">
	<link href=""""),_display_(Seq[Any](/*13.15*/routes/*13.21*/.Assets.at("stylesheets/style.css"))),format.raw/*13.56*/("""" rel="stylesheet">

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
				<a href=""""),_display_(Seq[Any](/*32.15*/routes/*32.21*/.Application.index())),format.raw/*32.41*/("""" title="Home" class="navbar-brand logo">
					Home
				</a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li class="active"><a href=""""),_display_(Seq[Any](/*38.35*/routes/*38.41*/.Application.index())),format.raw/*38.61*/("""">Home</a></li>
					<li><a href=""""),_display_(Seq[Any](/*39.20*/routes/*39.26*/.Application.login())),format.raw/*39.46*/("""">Sign in</a></li>
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
								<li><a href=""""),_display_(Seq[Any](/*51.23*/routes/*51.29*/.Application.login())),format.raw/*51.49*/("""">Sign in</a></li>
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
    <script src=""""),_display_(Seq[Any](/*76.19*/routes/*76.25*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*76.67*/(""""></script>
  </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Sep 09 14:26:31 CEST 2014
                    SOURCE: C:/play/activator-1.2.3/Malina/app/views/main.scala.html
                    HASH: 9b34caddb147a85b1661a6c848af49d70ce1f54a
                    MATRIX: 778->1|902->31|1151->245|1177->250|1261->298|1276->304|1341->347|1411->381|1426->387|1483->422|2352->1255|2367->1261|2409->1281|2637->1473|2652->1479|2694->1499|2765->1534|2780->1540|2822->1560|3306->2008|3321->2014|3363->2034|4108->2743|4123->2749|4187->2791
                    LINES: 26->1|29->1|37->9|37->9|40->12|40->12|40->12|41->13|41->13|41->13|60->32|60->32|60->32|66->38|66->38|66->38|67->39|67->39|67->39|79->51|79->51|79->51|104->76|104->76|104->76
                    -- GENERATED --
                */
            