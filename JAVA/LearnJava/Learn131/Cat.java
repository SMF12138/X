package NewLearn.Learn131;

public class Cat implements Flyable {//被装饰者

    @Override
    public void fly() {
        System.out.println("猫会飞");
    }
}
