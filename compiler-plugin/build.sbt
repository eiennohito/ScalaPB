libraryDependencies ++= Seq(
  "com.google.protobuf" % "protobuf-java" % "3.0.0-beta-2",
  "org.scala-lang" % "scala-reflect" % scalaVersion.value
)

publishTo := {
  val nexus = "http://10.228.147.22:9500/nexus/content/repositories/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "snapshots")
  else
    Some("releases"  at nexus + "releases")
}
