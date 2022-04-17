import org.apache.spark.{SparkConf, SparkContext}

object firstDemo {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local[*]").setAppName("FirstDemo")

    val sc = new SparkContext(conf)

    val rdd = sc.parallelize(Array(5, 10, 20))

    println(rdd.reduce(_+_))
  }

}
