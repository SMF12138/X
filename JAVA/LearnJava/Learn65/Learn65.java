package NewLearn.Learn65;

public class Learn65 {
    static int a = method();//类加载初始化时按照顺序，此时默认值是0赋值给a
    static int b = 10;//如果和上面代码调换顺序则结果是10

    public static void main(String[] args) {
        System.out.println(get());//结果取finally的返回值
        m(null);//null作为引用类型离String近，则走第二个函数
        System.out.println(a);
    }

    private static int method() {
        return b;
    }

    private static void m(Object o) {
        System.out.println("Object....");
    }

    private static void m(String o) {
        System.out.println("String....");
    }

    private static boolean get() {
        try {
            return true;
        } finally {
            return false;
        }
    }
}
