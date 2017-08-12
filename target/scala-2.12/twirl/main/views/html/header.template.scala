
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

object header extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<header class="top cien_white">"""),_display_(/*1.33*/mainlink()),format.raw/*1.43*/("""<img class="logo" src="""),_display_(/*1.66*/routes/*1.72*/.Assets.versioned("images/logo.gif")),format.raw/*1.108*/("""></img></a></header>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Aug 12 22:35:44 CEST 2017
                  SOURCE: /home/yries/Java_Projects/mj_web_page/app/views/header.scala.html
                  HASH: 4bdd1258047074bf37588eecf11ba87e7afb5aaf
                  MATRIX: 1031->0|1089->32|1119->42|1168->65|1182->71|1239->107
                  LINES: 33->1|33->1|33->1|33->1|33->1|33->1
                  -- GENERATED --
              */
          