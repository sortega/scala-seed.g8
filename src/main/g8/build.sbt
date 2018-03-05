lazy val versions = new {
  val cats = "1.0.0-RC1"
  val mouse = "0.12"
  val scalatest = "3.0.3"
}

lazy val root = (project in file(".")).settings(
  inThisBuild(
    List(
      organization := "$organization$",
      scalaVersion := "2.12.4",
      version      := "0.1.0-SNAPSHOT",
      scalacOptions ++= Seq(
        "-deprecation",
        "-unchecked",
        "-explaintypes",
        "-feature",
        "-unchecked",
        "-Ywarn-dead-code",
        "-Ypartial-unification",
        "-Ywarn-unused:imports",
        "-Ywarn-unused:locals",
        "-Xfatal-warnings"
      ),
      scalacOptions in (Compile, console) --= Seq("-Ywarn-unused:imports", "-Xfatal-warnings"),
      scalastyleConfig := file("project/scalastyle.xml")
    )),
  name := "$name$",
  libraryDependencies ++= Seq(
    "org.typelevel" %% "cats-core" % versions.cats,
    "org.typelevel" %% "mouse" % versions.mouse,
    "org.scalatest" %% "scalatest" % versions.scalatest % Test
  )
)

scalafmtOnCompile in ThisBuild := true
