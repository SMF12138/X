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
rdd1 = sc.parallelize(["1 2 3 4 5 6", "wsn bb", "wsl"])
rdd2 = rdd1.map(lambda x: x.split(" "))
# 与map不同在于flatMap可以解一层嵌套
rdd3 = rdd1.flatMap(lambda x: x.split(" "))
print(rdd2.collect())
print(rdd3.collect())
sc.stop()
