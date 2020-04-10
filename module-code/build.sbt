import play.sbt.PlayImport.PlayKeys._

name := "securesocial"

scalaVersion := Common.scalaVersion
crossScalaVersions := Common.crossScalaVersions

libraryDependencies ++= Seq(
  ws,
  filters,
  specs2 % "test",
  cacheApi,
  "com.typesafe.play" %% "play-mailer-guice" % "6.0.1", // this could be play-mailer but wouldn't have the guice module
  "io.methvin.play" %% "autoconfig-macros" % "0.2.0" % "provided",
  "org.mindrot" % "jbcrypt" % "0.3m"
)

resolvers ++= Seq(
  Resolver.typesafeRepo("releases")
)

startYear := Some(2012)

description := "An authentication module for Play Framework applications supporting OAuth, OAuth2, OpenID, Username/Password and custom authentication schemes."

licenses := Seq("The Apache Software License, Version 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))

scalacOptions := Seq("-encoding", "UTF-8", "-Xlint", "-deprecation", "-unchecked", "-feature", "-Xmax-classfile-name","78")

javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-encoding", "UTF-8",  "-Xlint:-options", "-Xlint:unchecked", "-Xlint:deprecation" )

// packagedArtifacts += ((artifact in playPackageAssets).value -> playPackageAssets.value)

