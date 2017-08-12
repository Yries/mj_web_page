
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/yries/Java_Projects/mj_web_page/conf/routes
// @DATE:Sat Aug 12 17:31:31 CEST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
