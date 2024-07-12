package NewLearn.Learn49;

public class Learn49 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        //匿名内部类，既完成了内部类的定义，又实例化了对象
        computer.conn(new Usb() {
            @Override
            public void read() {
                System.out.println("开始读取");
            }

            @Override
            public void write() {
                System.out.println("开始打印");
            }
        });
    }
}
class Computer{
    public void conn(Usb usb){
        usb.read();
        usb.write();
    }
}

interface Usb{
    void read();
    void write();
}

/*
class Printer implements Usb{
    @Override
    public void read() {
        System.out.println("开始读取");
    }

    @Override
    public void write() {
        System.out.println("开始打印");
    }
}*/