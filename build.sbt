import Dependencies._

ThisBuild / scalaVersion     := "2.13.1"
ThisBuild / version          := "0.0.1"

lazy val scratch = (project in file("."))
  .settings(
    name := "scratch",
    libraryDependencies ++= Seq(
      zio
    )
  )
