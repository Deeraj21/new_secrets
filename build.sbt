name := "vulnerable-scala-project"

version := "1.0"

scalaVersion := "2.13.3"

libraryDependencies ++= Seq(
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.9.10.1", // CVE-2020-25649
  "org.scala-lang.modules" %% "scala-async" % "0.9.7" // Known unmaintained version
)
