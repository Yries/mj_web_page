
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

object l_menu extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<header id="kolumna1" class="cien_blue" ><h3>Menu</h3>
  <ul>
    <li>"""),_display_(/*3.10*/mainlink()),format.raw/*3.20*/("""</a></li>
  </ul>
  <h3>Materiały podręczne</h3>
  <ul>
    <li><a href="http://niebezpiecznik.pl" target="_blank">Niebezpiecznik</a></li>
    <li><a href="http://www.dobreprogramy.pl" target="_blank">Dobreprogramy.pl</a></li>
    <li><a href="http://www.w3schools.com/" target="_blank">W3school</a></li>
    <li><a href="http://sourceforge.net/projects/notepad-plus/" target="_blank">Notepad ++</a></li>
    <li><a href="http://gimp.org" target="_blank">Gimp</a></li>
    <li><a href="http://colorschemedesigner.com/csd-3.5/" target="_blank">Kolory</a></li>
    <li><a href="http://thewebrocks.com/demos/3D-css-tester/" target="_blank">3D w kodzie HTML5</a></li>
    <li><a href="http://thewebrocks.com/demos/3D-css-tester/" target="_blank">Linux.pl</a></li>

  </ul>

</header>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Aug 12 18:23:48 CEST 2017
                  SOURCE: /home/yries/Java_Projects/mj_web_page/app/views/l_menu.scala.html
                  HASH: 8455d8b990eec91e1395195908697f36a14a46b9
                  MATRIX: 1031->0|1128->71|1158->81
                  LINES: 33->1|35->3|35->3
                  -- GENERATED --
              */
          