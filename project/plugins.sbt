// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository
resolvers += Resolver.typesafeRepo("releases")

// Use the Play sbt plugin for Play projects
addSbtPlugin("org.playframework" % "sbt-plugin" % System.getProperty("play.version", "3.0.0"))

// PGP signing

addSbtPlugin("com.github.sbt" % "sbt-ci-release" % "1.5.11")

addDependencyTreePlugin
