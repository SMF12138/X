from pyspark import SparkContext, SparkConf
import os

os.environ['PYSPARK_PYTHON'] = "C:\\Users\\86177\\PycharmProjects\\LearnPy\\venv\\Scripts\\python.exe"
conf = SparkConf().setMaster("local[*]").setAppName("test_spark_app")
sc = SparkContext(conf=conf)
rdd = sc.textFile("C:\\Users\\86177\\Desktop\\英语.txt")
word_rdd = rdd.flatMap(lambda x: x.split(" "))
word_num_rdd = word_rdd.map(lambda word: (word, 1))
result_rdd = word_num_rdd.reduceByKey(lambda a, b: a + b)
print(result_rdd.collect())
# 对结果排序,ascending=False表示降序，numPartitions值默认
result_rdd = result_rdd.sortBy(lambda x: x[1], ascending=False, numPartitions=1)
print(result_rdd.collect())
sc.stop()
