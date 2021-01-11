

object Common {
  def playVersion = System.getProperty("play.version", "2.8.7")
  def scalaVersion = System.getProperty("scala.version", "2.12.12")
  def crossScalaVersions = Seq(scalaVersion, "2.13.4")
}
