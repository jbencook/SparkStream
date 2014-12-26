# Spark Streaming Test Projects

A few very minimal examples of Spark streaming. To build a "fat jar":

    sbt assembly

Then run the app with:

    $SPARK_HOME/bin/spark-submit --class <ClassName> --master <Spark Master> ./target/scala-2.10/sparkStream-assembly-1.0.jar