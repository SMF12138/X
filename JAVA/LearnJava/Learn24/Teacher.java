package NewLearn.Learn24;

public class Teacher extends Person{
    //这里是继承的用法，继承了Person类，但私有属性和构造方法不会被继承
    //Java只支持单继承，不能直接继承多个类
    //若无继承默认继承祖宗Object，JDK中根类
    double sal;
    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
    public void teach(){
        System.out.println(name+"在讲课");
    }
}
