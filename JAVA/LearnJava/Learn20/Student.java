package NewLearn.Learn20;
//单例模式(饿汉式)
public class Student {
    private Student(){
        //构造函数私有化
    }

    private static Student s = new Student();
    //饿汉式在类加载时就创建好对象
    public static Student get(){
        //提供一个方法获取这个实例
        return s;
    }
}
