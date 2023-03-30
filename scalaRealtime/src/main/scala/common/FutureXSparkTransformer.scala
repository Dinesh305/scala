import common.{PostgresCommon, SparkCommon}
import org.apache.spark.sql.expressions.Window
import org.apache.spark.sql.functions._
import org.slf4j.LoggerFactory




object FutureXSparkTransformer {

  private val logger = LoggerFactory.getLogger(getClass.getName)

  def main(args: Array[String]): Unit = {

      val spark = SparkCommon.createSparkSession().get
      val table = "futureschema.transactions"

      val df1 = PostgresCommon.fetchDataFrameFromPgTable(spark,table).get

    val windowSpec  = Window.partitionBy("cust_id").orderBy(month(col("order_date")))
    val df2 = df1.withColumn("res",lead("order_date",1,"order_date").over(windowSpec))
    .orderBy("cust_id","order_date")

    df2.createOrReplaceTempView("EMP")
    spark.sql("SELECT month(order_date), sum(case when month(res) - month(order_date) = 1 then 1 else 0 end ) as result FROM EMP group by month(order_date)").show()



  }
}
