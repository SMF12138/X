package NewLearn.Learn131;

public class BirdSub extends Bird {
    @Override
    public void fly() {
        long begin = System.currentTimeMillis();
        super.fly();
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }
}
