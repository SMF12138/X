package NewLearn.Learn21;

public class Student {
    private Student() {
        //构造函数私有化
    }
    private static Student s;
    public static Student get(){
        if(s==null){
            //懒汉式在用时才创建对象
            s=new Student();
        }
        return s;
    }
}
