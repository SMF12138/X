class Phone11:
    faceid = "111"

    def facelook(self):
        print("看看脸")


class Vipphone11(Phone11):
    faceid = "110"

    def facelook(self):
        print("人脸识别新功能")
        # 指定父类调用变量
        print(Phone11.faceid)
        print(super().faceid)
        # 指定父类调用函数
        Phone11.facelook(self)
        super().facelook()


phone = Vipphone11()
phone.facelook()

