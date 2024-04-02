# 使用模块
import time

time.sleep(5)
print("你好")

# 或者单独导入某个功能
from time import sleep

sleep(5)
# 这样可以省略time
print("你好")

# 或者导入所有功能
from time import *

sleep(5)

# 给time起一个别名
import time as t

t.sleep(5)
print("你好")

# 给sleep起一个别名
from time import sleep as sl

sl(5)
print("你好")

# 自定义模块，从L1中导入main函数
from L11 import *
# 若会重复两遍是因为在L11的main函数中有一次调用，导入时直接导入了main()，因此设置了主函数防止这种情况
main1()

# 不同模块导入函数时若出现同名，则前者会被覆盖

