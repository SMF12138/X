class Phone:
    # 定义私有属性
    __current_voltage = 1
    faceid = "10000"
    def __keeo_single_core(self):
        print("让CPU以单核运行")

    def call_by_4G(self):
        if self.__current_voltage >= 1:
            print("4G通话开启")
        else:
            self.__keeo_single_core()
            print("电量不足开启单核")


if __name__ == '__main__':
    phone = Phone()
    phone.call_by_4G()
