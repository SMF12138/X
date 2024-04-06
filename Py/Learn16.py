from pyecharts.charts import Map
from pyecharts.options import TitleOpts, LegendOpts, ToolboxOpts, VisualMapOpts

map = Map()

data = [
    ("北京市", 70),
    ("上海市", 80),
    ("湖南省", 95),
    ("河北省", 95),
    ("山东省", 75),
    ("广东省", 80),
    ("辽宁省", 65),
    ("吉林省", 65),
    ("河南省", 65),
    ("湖北省", 80),
    ("江苏省", 70),
    ("内蒙古自治区", 70),
    ("天津市", 75)
]
map.set_global_opts(
    title_opts=TitleOpts(title="行至一栏表", pos_left="center", pos_bottom="1%"),
    toolbox_opts=ToolboxOpts(is_show=True),
    # 可视化(带上颜色)
    visualmap_opts=VisualMapOpts(
        is_show=True,
        # 允许自主设定范围
        is_piecewise=True,
        pieces=[
            {"min": 1, "max": 60, "label": "1-60", "color": "#CCFFFF"},
            {"min": 60, "max": 80, "label": "60-80", "color": "#181299"},
            {"min": 80, "max": 100, "label": "80-100", "color": "#990033"}
        ]
    )
)
map.add("行至一栏表", data, "china")
map.render()
