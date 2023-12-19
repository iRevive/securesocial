// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository
resolvers += Resolver.typesafeRepo("releases")

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % System.getProperty("play.version", "2.9.0"))

// Add Scalariform
addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.8.2")

// PGP signing

addSbtPlugin("com.github.sbt" % "sbt-ci-release" % "1.5.11")

addDependencyTreePlugin

// can be removed when Play release 2.8.20
ThisBuild / libraryDependencySchemes ++= Seq(
  "org.scala-lang.modules" %% "scala-xml"                % VersionScheme.Always,
  "org.scala-lang.modules" %% "scala-parser-combinators" % VersionScheme.Always
)
