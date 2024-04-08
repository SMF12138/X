class Clock:
    id = None
    price = None

    def ring(self):
        # 导包，可以发出一些声音
        import winsound
        # 参数为频率和持续时间
        winsound.Beep(500, 9000)


clock1 = Clock()
clock1.id = "003032"
clock1.price = 19.19
print(f"ID{clock1.id},价格{clock1.price}")
clock1.ring()


