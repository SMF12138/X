package NewLearn.Learn176;

public class Learn176 {//Lambda表达式不同于匿名内部类生成.class文件，但同样会创建对象
    public static void main(String[] args) {
        Learn176.test(new Animal() {
            @Override
            public void run() {
                System.out.println("跑");
            }
        });

        Learn176.doFly(new Flyable() {
            @Override
            public void run() {
                System.out.println("跑");
            }

            @Override
            public void fly() {
                System.out.println("飞");
            }
        });
        //Lambda表达式只能是接口，并且接口有且只有一个抽象方法，因此上面匿名内部类不能转换成Lambda表达式
    }
    public static void test(Animal a){
        a.run();
    }
    public static void doFly(Flyable f){
        f.fly();
        f.run();
    }
}

abstract class Animal{
    public abstract void run();
}

interface Flyable{
    void run();
    void fly();
}
