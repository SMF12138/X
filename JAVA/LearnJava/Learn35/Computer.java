package NewLearn.Learn35;

public class Computer {
    //Computer和HardDrive耦合度高，扩展性差
    public void conn(HardDrive hardDrive){
        System.out.println("链接成功");
        hardDrive.read();
        hardDrive.write();
    }
}
