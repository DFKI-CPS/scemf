organization := "de.dfki.cps"
name := "scemf"
scalaVersion := "2.11.8"
version := "0.1.0"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayOrganization := Some("dfki-cps")

scalacOptions := Seq("-deprecation")

crossScalaVersions := Seq("2.11.8","2.12.1")

libraryDependencies += "de.dfki.cps" % "specific-dependencies" % "4.6.3"
libraryDependencies += "com.typesafe" % "config" % "1.2.1"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

unmanagedSourceDirectories in Compile += baseDirectory.value / "emf" / "src"