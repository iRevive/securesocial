import play.sbt.PlayImport.PlayKeys._

name := "SecureSocial-parent"

scalaVersion := Common.scalaVersion
crossScalaVersions := Common.crossScalaVersions

lazy val core =  project.in( file("module-code") ).enablePlugins(PlayScala)
  .settings(
    name := "securesocial",
    scalaVersion := Common.scalaVersion,
    crossScalaVersions := Common.crossScalaVersions,

    libraryDependencies ++= Seq(
      ws,
      filters,
      specs2 % "test",
      cacheApi,
      "org.apache.commons" % "commons-lang3" % "3.11",
      "com.typesafe.play" %% "play-mailer-guice" % "8.0.1", // this could be play-mailer but wouldn't have the guice module
      "io.methvin.play" %% "autoconfig-macros" % "0.2.0" % "provided",
      "org.mindrot" % "jbcrypt" % "0.4"
    ),

    resolvers ++= Seq(
      Resolver.typesafeRepo("releases")
    ),

    startYear := Some(2012),

    description := "An authentication module for Play Framework applications supporting OAuth, OAuth2, OpenID, Username/Password and custom authentication schemes.",
    licenses := Seq("The Apache Software License, Version 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt")),
    scalacOptions := Seq("-encoding", "UTF-8", "-Xlint", "-deprecation", "-unchecked", "-feature", "-Xmax-classfile-name","78"),
    javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-encoding", "UTF-8",  "-Xlint:-options", "-Xlint:unchecked", "-Xlint:deprecation" )
  )
/*
lazy val scalaDemo = project.in( file("samples/scala/demo") ).enablePlugins(PlayScala).dependsOn(core)

lazy val javaDemo = project.in( file("samples/java/demo") ).enablePlugins(PlayJava).dependsOn(core)*/

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