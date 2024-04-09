
class Phone:
    __is_5G_enable = False
    faceid = "10001"

    def __check_5G(self):
        if self.__is_5G_enable:
            print("开启5G")
        else:
            print("5G关闭")

    def call_by_5G(self):
        self.__check_5G()
        print("正在通话")

    def facelook(self):
        print("看看脸")


# 单继承
class Vipphone(Phone):
    faceid = "1881"

    def facelook(self):
        print("人脸识别新功能")

# 注意这里写在了子类外部，那么用super和函数调用父类时就必须传参
if __name__ == '__main__':
    phone = Vipphone()
    phone.facelook()
    phone.call_by_5G()
    print(phone.faceid)
    # 指定父类调用变量
    print(Phone.faceid)
    print(super(Vipphone, phone).faceid)
    # 指定父类调用函数
    Phone.facelook(phone)
    super(Vipphone, phone).facelook()
