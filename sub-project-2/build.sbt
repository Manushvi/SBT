name := "sub-project-2"

version := "1.6.1"

scalaVersion := "2.12.11"

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.6.16"

mainClass in (Compile, run) := Some("Main")