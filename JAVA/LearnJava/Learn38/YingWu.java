package NewLearn.Learn38;

public class YingWu extends Animal implements Flyable,Speakable{
    //单继承多实现extends前，implements后
    public YingWu() {
    }

    public YingWu(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+"吃爆米花");
    }

    @Override
    public void fly() {
        System.out.println(getName()+"在飞");
    }

    @Override
    public void speak() {
        System.out.println(getName()+"在说");
    }
}