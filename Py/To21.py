from pyspark import SparkContext, SparkConf
import os

os.environ['PYSPARK_PYTHON'] = "C:\\Users\\86177\\PycharmProjects\\LearnPy\\venv\\Scripts\\python.exe"
os.environ['HADOOP_PYTHON'] = "D:\\Hadoop配置\\hadoop-3.0.0"
conf = SparkConf().setMaster("local[*]").setAppName("test_spark_app")
# spark.default.parallelism为默认并行度
conf.set('spark.default.parallelism', 1)
sc = SparkContext(conf=conf)
# 或设置分区数为1
rdd = sc.parallelize([1, 2, 2, 3, 4, 5], numSlices=1)

rdd.saveAsTextFile("C:\\Users\\86177\\Desktop\\风不死\\编码\\软件\\SMF的自制软件\\Spark\\output2")
sc.stop()
