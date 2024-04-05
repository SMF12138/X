from pyecharts.charts import Line
from pyecharts.options import TitleOpts, LegendOpts, ToolboxOpts, VisualMapOpts

# 导包后建立一个折线图
line = Line()
# 创建全局配置项
line.set_global_opts(
    # 标题的创建，通过关键字传参
    title_opts=TitleOpts(title="GDP展示", pos_left="center", pos_bottom="1%"),
    # 图例(默认显示)
    legend_opts=LegendOpts(is_show=True),
    # 工具箱
    toolbox_opts=ToolboxOpts(is_show=True),
    # 视觉映射
    visualmap_opts=VisualMapOpts(is_show=True)
)

line.add_xaxis(["中国", "美国", "日本"])
# 值与上面一一对应
line.add_yaxis("GDP", [100, 20, 10])
# 将代码可视化
line.render()
