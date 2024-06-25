package NewLearn.Learn35;

public class Learn35 {
    public static void main(String[] args) {
        HardDrive hardDrive = new HardDrive();
        Computer computer = new Computer();
        computer.conn(hardDrive);
    }
}
