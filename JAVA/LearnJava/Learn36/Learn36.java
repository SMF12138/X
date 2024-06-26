package NewLearn.Learn36;
//使用了接口
public class Learn36 {
    public static void main(String[] args) {
        Usb usb1 = new Printer();
        usb1.read();
        usb1.write();
        Usb usb2 = new HardDrive();
        usb2.read();
        usb2.write();
        Computer computer = new Computer();
        computer.conn(usb1);
        computer.conn(usb2);
    }
}
