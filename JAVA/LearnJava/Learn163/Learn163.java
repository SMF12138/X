package NewLearn.Learn163;

public class Learn163 {
    public static void main(String[] args) throws Exception {
        //通过类加载器获取类
        ClassLoader appClassLoader1 = ClassLoader.getSystemClassLoader();//获取应用(系统)类加载器，加载classpath中的字节码文件
        Class<?> aClass = appClassLoader1.loadClass("NewLearn.Learn163.Learn163");//拿到类，且只装载链接，第一次调用该类时才初始化(静态方法不执行)
        //类加载器有启动(核心)，平台(扩展)和应用(用户)
        ClassLoader appClassLoader2 = Learn163.class.getClassLoader();//自定义类获取应用类加载器(与上面地址相同，是同一个)
        ClassLoader contextClassLoader3 = Thread.currentThread().getContextClassLoader();//通过线程获取应用类加载器
        ClassLoader parent1 = appClassLoader1.getParent();//父类加载器(平台类加载器)
        ClassLoader parent2 = parent1.getParent();//再次调用获取启动类加载器
        System.out.println(parent2);//结果null是一种名字隐藏机制(保证安全)，并不是真的为空
        //类加载器会向父类加载器委托任务，若失败则向下委托(保护程序安全，防止类加载重复)，这是双亲委派机制
    }
}
