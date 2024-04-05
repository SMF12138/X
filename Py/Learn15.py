import json
from pyecharts.charts import Line
from pyecharts.options import TitleOpts, LegendOpts, ToolboxOpts, VisualMapOpts, LabelOpts

f = open("D:没有这个文件", "r", encoding="UTF-8")
data = f.read()
data = data.replace("要替换的内容", " ")
# 删掉末尾不合规范的字符
data = data[:-2]
# 转换成json
Udict = json.loads(data)
trend = Udict['data'][0]['trend']
x = trend['updata'][:314]
y = trend['list'][0]['data'][:314]

line = Line()
line.set_global_opts(
    # 标题的创建，通过关键字传参
    title_opts=TitleOpts(title="标题", pos_left="center", pos_bottom="1%"),
    # 图例(默认显示)
    legend_opts=LegendOpts(is_show=True),
    # 工具箱
    toolbox_opts=ToolboxOpts(is_show=True),
    # 视觉映射
    visualmap_opts=VisualMapOpts(is_show=True)
)
# 这里设置使标签(数字)不显示
line.add_yaxis("Y轴标题", y, Label_Opts=LabelOpts(is_show=False))
line.add_xaxis(x)
line.render()
f.close()
