from pyspark import SparkContext, SparkConf
import os

os.environ['PYSPARK_PYTHON'] = "C:\\Users\\86177\\PycharmProjects\\LearnPy\\venv\\Scripts\\python.exe"
conf = SparkConf().setMaster("local[*]").setAppName("test_spark_app")
sc = SparkContext(conf=conf)
rdd = sc.parallelize([1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6])
# 对rdd数据进行过滤(清除False数据)
rdd2 = rdd.filter(lambda num: num % 2 == 0)
print(rdd2.collect())
# distinct()去重
rdd2 = rdd2.distinct()
print(rdd2.collect())
sc.stop()
