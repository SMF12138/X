import To7
import To6


# 多继承
class Vipphone(To7.Phone, To6.Phone):
    # 复写
    faceid = "9999"

    def call_by_5G(self):
        print("正在通话,dudu")

    def facelook(self):
        print("人脸识别新功能")

    # 通过pass表示继承后没有新功能只是单独继承
    def Newphone(Vipphone):
        pass


phone = Vipphone()
phone.facelook()
phone.call_by_5G()
phone.call_by_4G()
# 若多个继承父类都有同名属性则采用第一个即To7.Phone
print(phone.faceid)
