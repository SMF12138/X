package NewLearn.Learn131;

public class CatSub extends Cat {
    @Override
    public void fly() {
        long begin = System.currentTimeMillis();
        super.fly();
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }
}
