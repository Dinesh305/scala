package common

import org.apache.spark.sql.SparkSession
import org.slf4j.LoggerFactory

object SparkCommon {
  private val logger = LoggerFactory.getLogger(getClass.getName)

  def createSparkSession(): Option[SparkSession] = {

      val spark = SparkSession
        .builder
        .appName("HelloSpark")
        .config("spark.master", "local")
        .getOrCreate()

      println("Created Spark Session")

      Some(spark)

  }
}
