package common

import org.apache.spark.sql.{DataFrame, SparkSession}
import org.slf4j.LoggerFactory
import java.util.Properties

object PostgresCommon {

  private val logger = LoggerFactory.getLogger(getClass.getName)

  def getPostgresCommonProps() : Properties = {
    logger.info("getPostgresCommonProps() started")
    val pgConnectionProperties = new Properties()
    pgConnectionProperties.put("user","postgres")
    pgConnectionProperties.put("password","12345")
    pgConnectionProperties
  }

  def getPostgresServerDatabase() : String = {
    logger.info("getPostgresServerDatabase() started")

    val pgURL = "jdbc:postgresql://localhost:5432/postgres"
    pgURL
  }
  def fetchDataFrameFromPgTable(spark : SparkSession, pgTable : String ) : Option[DataFrame] = {
      logger.info("fetchDataFrameFromPgTable() started")
      val pgProp = getPostgresCommonProps
      val pgURLdetails = getPostgresServerDatabase()
      logger.info("Creating Dataframe from Postgres")
      val pgCourseDataframe = spark.read.jdbc(pgURLdetails, pgTable, pgProp)
      Some(pgCourseDataframe)
  }

}
