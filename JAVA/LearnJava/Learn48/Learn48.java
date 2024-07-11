package NewLearn.Learn48;

public class Learn48 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.conn(new Printer());
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

class Printer implements Usb{
    @Override
    public void read() {
        System.out.println("开始读取");
    }

    @Override
    public void write() {
        System.out.println("开始打印");
    }
}