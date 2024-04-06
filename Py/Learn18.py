from pyecharts.charts import Bar, Timeline
from pyecharts.globals import ThemeType
from pyecharts.options import LabelOpts

bar1 = Bar()
bar1.add_xaxis(["SMF", "LMQ", "YYB", "SJF", "MM", "CL", "LMY", "CQ", "BYZ", "BYY", "LZD"])
bar1.add_yaxis("气", [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0], label_opts=LabelOpts(position="right"))
bar1.reversal_axis()

bar2 = Bar()
bar2.add_xaxis(["SMF", "LMQ", "YYB", "SJF", "MM", "CL", "LMY", "CQ", "BYZ", "BYY", "LZD"])
bar2.add_yaxis("气", [1000, 1000, 1000, 1000, 1000, 500, 500, 500, 500, 500, 500],
               label_opts=LabelOpts(position="right"))
bar2.reversal_axis()

bar3 = Bar()
bar3.add_xaxis(["SMF", "LMQ", "YYB", "SJF", "MM", "CL", "LMY", "CQ", "BYZ", "BYY", "LZD"])
bar3.add_yaxis("气", [100000, 90000, 9000, 50000, 4000, 40000, 30000, 20000, 20000, 20000, 4000],
               label_opts=LabelOpts(position="right"))
bar3.reversal_axis()

bar4 = Bar()
bar4.add_xaxis(["SMF", "LMQ", "YYB", "SJF", "MM", "CL", "LMY", "CQ", "BYZ", "BYY", "LZD"])
bar4.add_yaxis("气", [1000000, 500000, 500000, 200000, 200000, 80000, 80000, 50000, 50000, 40000, 20000],
               label_opts=LabelOpts(position="right"))
bar4.reversal_axis()
# 通过字典设置时间线主体
timeline = Timeline({"theme": ThemeType.CHALK})
timeline.add(bar1, "2008")
timeline.add(bar2, "2012")
timeline.add(bar3, "2016")
timeline.add(bar4, "2020")
timeline.add_schema(
    # 自动播放时间(毫秒)
    play_interval=1000,
    # 播放时是否显示时间线
    is_timeline_show=True,
    # 是否自动播放
    is_auto_play=True,
    # 是否循环播放
    is_loop_play=True
)
timeline.render("时间柱状图.html")
