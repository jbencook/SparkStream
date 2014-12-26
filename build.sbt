name := "sparkStream"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies += "org.apache.spark" % "spark-core_2.10" % "1.2.0" % "provided"

libraryDependencies += "org.apache.spark" % "spark-streaming_2.10" % "1.2.0" % "provided"

libraryDependencies += "org.apache.spark" % "spark-streaming-twitter_2.10" % "1.2.0"