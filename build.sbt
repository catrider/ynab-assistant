ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "ynab-assistant"
  )

libraryDependencies += "com.lihaoyi" %% "requests" % "0.8.0"
libraryDependencies += "org.assertj" % "assertj-core" % "3.24.2" % Test
libraryDependencies += "org.junit.jupiter" % "junit-jupiter-api" % "5.9.2" % Test
libraryDependencies += "org.junit.jupiter" % "junit-jupiter-engine" % "5.9.2" % Test
libraryDependencies ++= Seq(
  "net.aichler" % "jupiter-interface" % JupiterKeys.jupiterVersion.value % Test
)
