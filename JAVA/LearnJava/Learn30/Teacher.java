package NewLearn.Learn30;

public class Teacher extends Person{
    double sal;
    String name;
    //super用于子类定义了一个与父类相同的变量或方法，但想在子类中访问父类的变量或方法
    public Teacher() {
    }

    public Teacher(String name,int age,String email,String address,double sal) {
        //super();这里实际上默认有，即先调用父类构造方法初始化变量null
        this.name=name;
        //但这里的name赋值的却是子类的name
        this.age=age;
        this.emile=email;
        this.address=address;
        this.sal = sal;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
    public void display(){
        System.out.println(this.getName());
        System.out.println(this.getAge());
        System.out.println(this.getEmile());
        System.out.println(this.getAddress());
        System.out.println(this.getSal());
        //下面从父类继承出的四个属性可以用super来引用
        System.out.println(super.getName());
        System.out.println(super.getAge());
        System.out.println(super.getEmile());
        System.out.println(super.getAddress());
    }

    @Override
    public void doSome() {
        System.out.println("开始");
        super.doSome();//这里也用了super调用父类函数，没有super就变成了死递归
        //super只是一个代号，而不是地址，无法像this那样单独输出
        System.out.println("结束");
    }
}
