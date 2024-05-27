package NewLearn.Learn11;
//同时编辑多行Ctrl+shift
public class Learn11 {
    public static void main(String[] args) {
        //实例即对象,类=属性+方法，通过类实例化对象从而形成系统
        //一个类可以造出多个Java对象
        Student s1 = new Student();
        //通过new学生类实例化对象，用变量接收,数据类型Student为引用数据类型(类名)
        //不同于基本数据类型int等，String也是一种引用数据类型
        System.out.println(s1.name);
        Student s2 = new Student();
        //创建新对象，有运算符new对象储存在堆中，变量s2引用了Java对象的内存地址
        s2.name = "sb";
        //修改对象属性
        Student s3 = new Student();
        //每创建一个实例变量，就会在堆开创一个空间供调用
        //Java有垃圾回收机制，主要针对堆区
        //不能通过类名直接访问，要先创建实例变量引用
    }
}
