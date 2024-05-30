package NewLearn.Learn13;

public class Learn13 {
    public static void main(String[] args) {
        //描述一个对象的行为时不加static,没有添加static的方法称为实例方法
        Vip v = new Vip();
        v.shopping();//实例函数调用
        //不同于静态方法可以用类名引用，这种方法只能通过实例引用
        add(v);
        v = null;//此后再引用会出现空指针异常，栈(v)的地址null,如没有任何对象引用则堆中Vip
        // 被回收
    }
    public static void add(Vip v){//传入自定义类型
        v.shopping();
    }
}



