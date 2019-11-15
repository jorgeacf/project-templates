
name := "Basic SBT Scala Project"

version := "1.0"

scalaVersion := "2.12.10"

libraryDependencies ++= Seq(
  "log4j" % "log4j" % "1.2.17",
  "org.scalatest" % "scalatest_2.12" % "3.0.1" % "test"
)
