name := "SecureSocial-parent"

scalaVersion := Common.scalaVersion
crossScalaVersions := Common.crossScalaVersions

lazy val core =  project.in( file("module-code") ).enablePlugins(PlayScala)

lazy val scalaDemo = project.in( file("samples/scala/demo") ).enablePlugins(PlayScala).dependsOn(core)

lazy val javaDemo = project.in( file("samples/java/demo") ).enablePlugins(PlayJava).dependsOn(core)

lazy val root = project.in( file(".") ).aggregate(core) .settings(
     aggregate in update := false
   )

inThisBuild(
  Seq(
    organization := "io.github.irevive",
    homepage     := Some(url("https://github.com/iRevive/securesocial")),
    licenses     := List("The Apache Software License, Version 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt")),
    developers   := List(Developer("jaliss", "Jorge Aliss", "", url("https://twitter.com/jaliss")))
  )
)