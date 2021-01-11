// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository
resolvers += Resolver.typesafeRepo("releases")

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % System.getProperty("play.version", "2.8.7"))

// Add Scalariform
addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.8.2")

// PGP signing

addSbtPlugin("com.geirsson" % "sbt-ci-release" % "1.5.2")