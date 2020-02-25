name := "scala_example"

version := "0.1"

scalaVersion := "2.13.0"

// https://mvnrepository.com/artifact/org.slf4j/slf4j-api
libraryDependencies += "org.slf4j" % "slf4j-api" % "1.7.30"



// https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.6.0-M6"

libraryDependencies += "com.typesafe.akka" %% "akka-persistence" % "2.6.0-M6"

// https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind
libraryDependencies += "com.fasterxml.jackson.core" % "jackson-databind" % "2.9.8"


// https://mvnrepository.com/artifact/com.typesafe.akka/akka-testkit
libraryDependencies += "com.typesafe.akka" %% "akka-testkit" % "2.6.0-M6" % Test

// https://mvnrepository.com/artifact/org.scalatest/sca
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test

// https://mvnrepository.com/artifact/org.mockito/mockito-core
libraryDependencies += "org.mockito" % "mockito-core" % "3.1.0" % Test




