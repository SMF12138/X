package NewLearn.Learn131;

public class Learn131 {
    public static void main(String[] args) {//IO流是典型的装饰器设计模式
        Flyable flyable1 = new CatSub();//后期修改业务，通过写子类的方式扩展父类，只将测试代码中Cat修改为CatSub
        Flyable flyable2 = new BirdSub();//但扩展能力差，且容易类爆炸
        //使用装饰器解决这个问题，实现松耦合
        //装饰器要求和被装饰者实现同样接口和抽象类继承
        flyable1.fly();
        flyable2.fly();

        Flyable flyable3 = new TimeDecorator(new Cat());
        flyable3.fly();//通过装饰器完成功能扩展
        Flyable flyable4 = new LogDecorator(new Cat());
        flyable4.fly();// 如果还要扩展只需再添加其它的装饰器
    }
}
