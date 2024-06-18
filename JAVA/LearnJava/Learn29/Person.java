package NewLearn.Learn29;

public abstract class Person {//abstract代表一个抽象类，抽象类有构造方法但无法创建对象
    public String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void greet();//定义抽象方法，子类调用这个方法必须重写
}
