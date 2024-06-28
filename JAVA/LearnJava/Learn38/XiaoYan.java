package NewLearn.Learn38;

public class XiaoYan extends Animal implements Flyable{
    //单继承多实现extends前，implements后
    public XiaoYan() {
    }

    public XiaoYan(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+"吃虫子");
    }

    @Override
    public void fly() {
        System.out.println(getName()+"在飞");
    }
}
