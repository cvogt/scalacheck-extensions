import sbt._
import Keys._
import xerial.sbt.Sonatype._
import SonatypeKeys._

object MyBuild extends Build{
  val repoKind = SettingKey[String]("repo-kind", "Maven repository kind (\"snapshots\" or \"releases\")")
  val projectName = "scalacheck-extensions"
  lazy val aRootProject = Project(id = projectName, base = file("."),
    settings = sonatypeSettings ++ Seq(
      name := projectName,
      version := "0.2",
      scalaVersion := "2.11.5",
      description := "Extensions for Scalacheck",
      libraryDependencies ++= Seq(
        "org.scalacheck" %% "scalacheck" % "1.12.2",
        "org.scalatest" %% "scalatest" % "2.2.4" % "test"
      ),
      resolvers += Resolver.sonatypeRepo("snapshot"),
      libraryDependencies <+= scalaVersion(
        "org.scala-lang" % "scala-reflect" % _ % "optional"
      ),
      scalacOptions ++= Seq(
        "-feature", "-deprecation", "-unchecked",
        "-language:experimental.macros"
      ),
      //scalacOptions ++= Seq("-Xprint:patmat", "-Xshow-phases"),
      testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-oFD"),
      parallelExecution := false, // <- until TMap thread-safety issues are resolved
      organizationName := "Jan Christopher Vogt",
      organization := "org.cvogt",
      scalacOptions in (Compile, doc) <++= (version,sourceDirectory in Compile,name).map((v,src,n) => Seq(
        "-doc-title", n,
        "-doc-version", v,
        "-doc-footer", projectName+" is developed by Jan Christopher Vogt.",
        "-sourcepath", src.getPath, // needed for scaladoc to strip the location of the linked source path
        "-doc-source-url", "https://github.com/cvogt/"+projectName+"/blob/"+v+"/src/main€{FILE_PATH}.scala",
        "-implicits",
        "-diagrams", // requires graphviz
        "-groups"
      )),
      publishMavenStyle := true,
      publishArtifact in Test := false,
      pomIncludeRepository := { _ => false },
      makePomConfiguration ~= { _.copy(configurations = Some(Seq(Compile, Runtime, Optional))) },
      licenses += ("Two-clause BSD-style license", url("http://github.com/cvogt/"+projectName+"/blob/master/LICENSE.txt")),
      homepage := Some(url("http://github.com/cvogt/"+projectName)),
      startYear := Some(2015),
      pomExtra :=
        <developers>
          <developer>
            <id>cvogt</id>
            <name>Jan Christopher Vogt</name>
            <timezone>-5</timezone>
            <url>https://github.com/cvogt/</url>
          </developer>
        </developers>
          <scm>
            <url>git@github.com:cvogt/{projectName}.git</url>
            <connection>scm:git:git@github.com:cvogt/{projectName}.git</connection>
          </scm>
    )
  )
}
