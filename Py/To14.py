from pyspark import SparkContext, SparkConf

# 创建对象conf并通过链式调用设置基础属性
conf = SparkConf().setMaster("local[*]").setAppName("test_spark_app")
# 基于conf对象构建context对象
sc = SparkContext(conf=conf)
print(sc.version)
# 通过该方法将Py对象加载到Spark内，成为RDD对象
rdd1 = sc.parallelize([1, 2, 3, 4, 5, 6])
# 查看RDD内容要用collect()
print(rdd1.collect())
# 通过textFile读取文件加载到Spark
rdd2 = sc.textFile("D:/hello.txt")
sc.stop()
