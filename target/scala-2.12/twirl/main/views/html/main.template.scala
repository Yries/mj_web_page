
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.17*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/routes/*15.65*/.Assets.versioned("images/favicon.png")),format.raw/*15.104*/("""">
        <meta name="author" content="yries" />
        <meta name="language" content="pl"/>
        <meta charset="UTF-8"/>
    </head>
    <body>
        """),format.raw/*22.32*/("""
        """),_display_(/*23.10*/header()),format.raw/*23.18*/("""
        """),_display_(/*24.10*/l_menu()),format.raw/*24.18*/("""
        """),_display_(/*25.10*/r_menu()),format.raw/*25.18*/("""
        """),_display_(/*26.10*/centralColumn()),format.raw/*26.25*/("""
        """),_display_(/*27.10*/footer()),format.raw/*27.18*/("""
        """),format.raw/*28.9*/("""<script src=""""),_display_(/*28.23*/routes/*28.29*/.Assets.versioned("javascripts/main.js")),format.raw/*28.69*/("""" type="text/javascript"></script>
    </body>
</html>"""))
      }
    }
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Aug 12 22:21:31 CEST 2017
                  SOURCE: /home/yries/Java_Projects/mj_web_page/app/views/main.scala.html
                  HASH: edee118ac1cd62f566635f9de4a09a4680e3345f
                  MATRIX: 1201->260|1311->275|1339->277|1419->382|1455->391|1490->399|1516->404|1605->466|1620->472|1683->513|1771->574|1786->580|1847->619|2033->867|2070->877|2099->885|2136->895|2165->903|2202->913|2231->921|2268->931|2304->946|2341->956|2370->964|2406->973|2447->987|2462->993|2523->1033
                  LINES: 33->7|38->7|40->9|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|52->22|53->23|53->23|54->24|54->24|55->25|55->25|56->26|56->26|57->27|57->27|58->28|58->28|58->28|58->28
                  -- GENERATED --
              */
          