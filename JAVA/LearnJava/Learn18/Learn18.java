package NewLearn.Learn18;

//this中本质储存的是Java对象中的内存地址
public class Learn18 {
    public static void main(String[] args) {
        Chinese zhangsan = new Chinese("130282200406180031", "zhangsan");
        zhangsan.display();
        //static修饰静态变量和方法，访问时用类名，不用new出的对象
        //使用对象(如zhangsan)也可以成功调用，但会造成困惑，这种调用和对象无关
        zhangsan = null;
        System.out.println(zhangsan.country);
        //因此如果不是静态变量对象赋值null调用，会空指针异常
    }
}
