from pyspark import SparkContext, SparkConf
import os
import sys

# 打印解释器路径
print(sys.executable)
os.environ['PYSPARK_PYTHON'] = "C:\\Users\\86177\\PycharmProjects\\LearnPy\\venv\\Scripts\\python.exe"
# 创建对象conf并通过链式调用设置基础属性
conf = SparkConf().setMaster("local[*]").setAppName("test_spark_app")
# 基于conf对象构建context对象
sc = SparkContext(conf=conf)
rdd1 = sc.parallelize([1, 2, 3, 4, 5, 6])


def func(data):
    return data * 10


# 通过map方法将全部数据乘10,链式调用,同时使用lambda
rdd2 = rdd1.map(func).map(lambda x: x + 10)
print(rdd2.collect())
sc.stop()
