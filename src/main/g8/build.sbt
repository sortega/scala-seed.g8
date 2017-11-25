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
      scalacOptions ++= Seq("-Ypartial-unification",
                            "-source",
                            "1.8",
                            "-target",
                            "1.8",
                            "-Xmx2G",
                            "-deprecation",
                            "-unchecked")
    )),
  name := "$name$",
  libraryDependencies ++= Seq(
    "org.typelevel" %% "cats-core" % versions.cats,
    "org.typelevel" %% "mouse" % versions.mouse,
    "org.scalatest" %% "scalatest" % versions.scalatest % Test
  )
)
