package NewLearn.Learn131;

public abstract class FlyableDecorator implements Flyable{//将所有装饰者的父类定义为抽象类
    private Flyable flyable;//引用被装饰者，要用抽象类型

    public FlyableDecorator(Flyable flyable) {
        this.flyable = flyable;
    }//将子装饰器构造方法提取出到本装饰器进行

    @Override
    public void fly() {
        flyable.fly();
    }
}
