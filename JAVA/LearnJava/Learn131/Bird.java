package NewLearn.Learn131;

public class Bird implements Flyable {//被装饰者

    @Override
    public void fly() {
        System.out.println("鸟会飞");
    }
}
