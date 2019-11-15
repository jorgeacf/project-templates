
name := "Basic SBT Scala Project"

version := "1.0"

scalaVersion := "2.12.10"

libraryDependencies ++= Seq(
  "org.apache.logging.log4j" % "log4j-core" % "2.12.1",
  "org.scalatest" % "scalatest_2.12" % "3.0.1" % "test"
)
