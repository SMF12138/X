from pyecharts.charts import Bar
from pyecharts.options import LabelOpts

bar = Bar()
bar.add_xaxis(["我", "儿子", "我的儿子"])
bar.add_yaxis("智慧", [30, 20, 10], label_opts=LabelOpts(position="right"))
# 反转轴
bar.reversal_axis()
bar.render("基础柱状图.html")
