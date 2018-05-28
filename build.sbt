name := "scala-starter"

version := "0.1"

scalaVersion := "2.12.6"

// plugins
enablePlugins(ScalaJSPlugin)

// use main module for scala-js
scalaJSUseMainModuleInitializer := true

// dependencies
libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.6"