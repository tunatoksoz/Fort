import sbt._
import Keys._
import scala.xml._

object Fort extends Build {
  lazy val fortSettings = Defaults.defaultSettings ++ Seq(
    organization := "com.fortproject",
    crossScalaVersions := Seq("2.10.3"),
    scalaVersion <<= (crossScalaVersions) { versions => versions.head },
    scalacOptions ++= Seq(
      "-unchecked", "-deprecation", "-Yinline-warnings", "-Xcheckinit", "-encoding", "utf8",
      "-feature", "-language:higherKinds", "-language:postfixOps", "-language:implicitConversions",
      "-language:reflectiveCalls", "-language:existentials", "-Yrangepos"
    ),
    javacOptions ++= Seq("-target", "1.6", "-source", "1.6", "-Xlint:deprecation"),
    libraryDependencies <++= scalaVersion(sv=>Seq(
      "org.scala-lang" % "scala-library" % sv,
      "org.scala-lang" % "scala-reflect" % sv,
      "org.scala-lang" % "scala-compiler" % sv,
      "org.specs2" %% "specs2" % "2.3.1" % "test")),
    resolvers ++= Seq(Opts.resolver.sonatypeSnapshots, Opts.resolver.sonatypeReleases)
  )

  lazy val fortProject = Project(
    id = "fortproject",
    base = file("."),
    settings = fortSettings ++ Seq(
      description := "An inversion of control container for Scala."
    ),
    aggregate = Seq(core)
  )

  lazy val core = Project(
    id = "core",
    base = file("core"),
    settings = fortSettings
  )

  /*
  lazy val TypeSetting = packageOptions <+= (name, version, organization) map {
    (title, version, vendor) =>
      Package.(
        "Created-By" -> "Simple Build Tool",
        "Built-By" -> System.getProperty("user.name"),
        "Build-Jdk" -> System.getProperty("java.version"),
        "Specification-Title" -> title,
        "Specification-Version" -> version,
        "Specification-Vendor" -> vendor,
        "Implementation-Title" -> title,
        "Implementation-Version" -> version,
        "Implementation-Vendor-Id" -> vendor,
        "Implementation-Vendor" -> vendor
      )
  }*/
}
