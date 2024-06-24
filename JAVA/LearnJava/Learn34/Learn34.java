package NewLearn.Learn34;

public class Learn34 {
    public static void main(String[] args) {
        MyInterface myInterface = new MyInterfaceImpl();
        //接口要和多态一起使用
        myInterface.m();
        myInterface.defaultMethod();
        MyInterface.staticMethod();
    }
}
