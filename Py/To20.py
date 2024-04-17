from pyspark import SparkContext, SparkConf
import os

os.environ['PYSPARK_PYTHON'] = "C:\\Users\\86177\\PycharmProjects\\LearnPy\\venv\\Scripts\\python.exe"
os.environ['HADOOP_PYTHON'] = "D:\\Hadoop配置\\hadoop-3.0.0"
conf = SparkConf().setMaster("local[*]").setAppName("test_spark_app")
sc = SparkContext(conf=conf)
rdd = sc.parallelize([1, 2, 2, 3, 4, 5])
# collect()实际是把rdd变为list
print(rdd.collect())
# reduce算子聚合不需要给值而是聚合所有
num = rdd.reduce(lambda a, b: a + b)
print(num)
# 取出前n个元素返回list
take_list = rdd.take(3)
print(take_list)
# count统计rdd元素个数
num_count = rdd.count()
print(num_count)
# 将rdd对象写入到文件中(配置Hadoop依赖),有多少个分区就输出多少个文件
rdd.saveAsTextFile("C:\\Users\\86177\\Desktop\\风不死\\编码\\软件\\SMF的自制软件\\Spark\\output1")
sc.stop()
