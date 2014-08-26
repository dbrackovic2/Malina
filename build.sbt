import play.Project._

name := """Malina"""

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaEbean,
  "mysql" % "mysql-connector-java" % "5.1.26",
  "org.webjars" %% "webjars-play" % "2.2.2", 
  "org.webjars" % "bootstrap" % "2.3.1",
  "com.restfb"    % "restfb" % "1.6.12")

playJavaSettings
