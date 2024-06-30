

object Common {
  def playVersion = System.getProperty("play.version", "3.0.4")
  def scalaVersion = System.getProperty("scala.version", "2.13.14")
  def crossScalaVersions = Seq(scalaVersion, "2.13.14").distinct
}
