addSbtPlugin("com.trueaccord.scalapb" % "sbt-scalapb" % com.trueaccord.scalapb.Version.sbtPluginVersion)

libraryDependencies ++= Seq(
  "com.github.os72" % "protoc-jar" % "3.0.0-b1",

  // Force e2e to use the compiler plugin that we want to test (the one we published using publishLocal
  // in e2e.sh). Without this line, we will test against the default compiler provided by sbt-scalapb.
  "com.trueaccord.scalapb" %% "compilerplugin" % com.trueaccord.scalapb.Version.scalapbVersion
)

