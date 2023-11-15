

object Common {
  def playVersion = System.getProperty("play.version", "3.0.0")
  def scalaVersion = System.getProperty("scala.version", "2.13.12")
  def crossScalaVersions = Seq(scalaVersion, "2.13.12").distinct
}
