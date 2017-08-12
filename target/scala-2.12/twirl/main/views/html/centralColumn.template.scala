
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

object centralColumn extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<div id="kolumna_s" ><h1><div id="budowa"><img src="""),_display_(/*1.53*/routes/*1.59*/.Assets.versioned("images/budowa.gif")),format.raw/*1.97*/(""">
</div></h1>
  <h1>jakiś tekst</h1>
  <h2>którego źródłem...</h2>
  <p>... w niedalekiej przyszłości...
    ...będzie CMS"Drupal"
    A na język ludzki:
    Będzie można łatwo dodoawać teksty zdjęcia i inne materiały na stronę
  </p>
  <h1>A na rzaie są wiersze :)
    Kazimierz Przerwa – Tetmajer</h1>
  <h2>Kot</h2>
  <p>Pójdź w me ramiona, kocie mój prześliczny,
    Schowaj pazurki swe bez żalu,
    Niech przejrzę się w twych oczach fosforycznych,
    Stopie agatu i metalu.
    Gdy moje palce czule głaszczą, stroszą
    Futerko twoje, grzbiet sprężysty,
    I moja dłoń upaja się rozkoszą
    Czując, jak biją z ciebie iskry,
    Widzę w myślach swą żonę. Jej spojrzenie,
    Jak twoje, wdzięczne me stworzenie,
    Głębokie, zimne, przeszywa jak strzała,
    I od stóp aż po czubek głowy
    Przedziwna woń, zapach piżmowy,
    Snuje się wkrąg smagłego ciała. </p>
  <h1>Kazimierz Przerwa – Tetmajer</h1>
  <h2>Czarna róża</h2>
  <p>Serce me spało, a moja myśl
    toneła gdzieś w lazurze,
    nagle ujrzałem przy sobie tuż
    skromniutką, czarną różę.

    Wspaniałą krasą jej kwiat i liść
    bynajmniej się nie płoni,
    a przecież dziwny jakiś czar
    przykuwa wzrok mój do niej.

    Czarna różyczko! zerwę cię,
    na piersi przypnę sennej –
    serce się budzi – cóż to ma dłoń
    chwyta za kwiat kamienny!

    Odchodzę smutny – w tej chwili znów
    z kamienia kwiat wykwita;
    wracam – i znowu moja dłoń
    za zimny kamień chwyta.</p>
</div>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Aug 12 18:25:51 CEST 2017
                  SOURCE: /home/yries/Java_Projects/mj_web_page/app/views/centralColumn.scala.html
                  HASH: ebfe85e67e27160ac8afab94b35a5cbaa1a1f678
                  MATRIX: 1038->0|1116->52|1130->58|1188->96
                  LINES: 33->1|33->1|33->1|33->1
                  -- GENERATED --
              */
          