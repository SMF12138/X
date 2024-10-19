package NewLearn.Learn131;

public class TimeDecorator extends FlyableDecorator {//装饰者

    public TimeDecorator(Flyable flyable) {
        super(flyable);//继承祖宗构造器后不再自己进行构造方法而是直接调用父类方法
    }

    @Override
    public void fly() {
        long begin = System.currentTimeMillis();
        super.fly();//这里调用祖构造器
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }
}
