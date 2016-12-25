
name := "Basic SBT ScalaTest Project"

version := "1.0"

scalaVersion := "2.10.6"

libraryDependencies ++= Seq(
  "log4j" % "log4j" % "1.2.17",
  "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test"
)

assemblyJarName in assembly := "scala-sbt-1.0.jar"
