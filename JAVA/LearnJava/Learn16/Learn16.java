package NewLearn.Learn16;
//构造方法的作用是对象的创建和初始化
public class Learn16 {
    public static void main(String[] args) {
        //类中若没有提供构造方法系统会默认提供一个无参数的方法，通过new调用(缺省构造器)
        Student s = new Student();
        //s保存了Student类型的对象
        Student 张三 = new Student("zhangsan",20,true,"北京");
        //含参构造方法，构成方法重载
        Student.print(张三);
        //构造方法中给属性赋值但还需要set方法是因为可以后期调用进行属性修改
    }
}
