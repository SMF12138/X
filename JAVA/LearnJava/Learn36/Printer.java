package NewLearn.Learn36;

public class Printer implements Usb {
    @Override
    public void read() {
        System.out.println("打印机在读");
    }

    @Override
    public void write() {
        System.out.println("打印机在写");
    }
}
