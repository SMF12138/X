package NewLearn.Learn19;

public class Learn19 {
    //静态代码块在类加载时执行，并且只执行一次，可以写多个静态代码块依次执行
    //静态代码块内无法直接访问实例相关的数据，但可以访问静态变量或方法(因为也是在类加载时初始化的)
    //静态代码块用于在类加载时执行程序
    static {
        System.out.println("静态代码块");
    }

    public static void main(String[] args) {
        System.out.println("执行");
    }
}
