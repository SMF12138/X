from pyspark import SparkContext, SparkConf
import os

os.environ['PYSPARK_PYTHON'] = "C:\\Users\\86177\\PycharmProjects\\LearnPy\\venv\\Scripts\\python.exe"
conf = SparkConf().setMaster("local[*]").setAppName("test_spark_app")
sc = SparkContext(conf=conf)
# 针对KV型RDD(二元元组),自动按照Key分组，根据提供的聚合逻辑完成组内数据聚合
rdd = sc.parallelize([('N', 99), ('F', 66), ('N', 88), ('F', 55)])
# 求N,F两组的成绩之和
rdd1 = rdd.reduceByKey(lambda a, b: a + b)
print(rdd1.collect())

sc.stop()
