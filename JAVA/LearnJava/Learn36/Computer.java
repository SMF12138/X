package NewLearn.Learn36;

public class Computer {
    //Computer和Usb耦合度低，扩展性高
    public void conn(Usb usb){
        System.out.println("链接成功");
        usb.read();
        usb.write();
    }
}
