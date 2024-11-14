package NewLearn.Learn154;

public class Learn154 {//获取class三种方式

    public static void main(String[] args) {
        //反射机制帮助我们操作读取字节码文件，Java框架都是基于反射机制实现，反射机制使程序更加灵活
        //XXX.class代表硬盘上某个class文件或某种类型
        //XXX.reflect.Filed代表Field类型的实例代表类中的属性或字段
        //XXX.reflect.Constructor代表Constructor类型的实例代表类中的构造方法
        //XXX.reflect.Method代表Method类型的实例代表类中的方法
        try {
            Class stringClass1 = Class.forName("java.lang.String");//forName获取的是带有包名的全限定类名，传参为字符串，方法执行时导致类加载动作发生
            Class userClass1 = Class.forName("NewLearn.Learn154.User");//forName获取的是带有包名的全限定类名，传参为字符串，方法执行时导致类加载动作发生
            //并且这里包名只能用.表示
            String s1 = "动力节点";
            Class stringClass2 = s1.getClass();//用任意对象调用该对象代表的类
            System.out.println(stringClass2 == stringClass1);//结果相等，某种文件的字节码在内存只有一份

            Class intClass = int.class;//直接获取类型对应的类
            Class userClass2 = User.class;//直接获取类型对应的类
            System.out.println(userClass1 == userClass2);

            User user1 = (User) userClass1.newInstance();//通过获取的Class实例化对象，Java9过时，底层调用了无参构造方法(若没有会异常)
            User user2 = (User) userClass1.newInstance();
            System.out.println(user1);
            System.out.println(user2);//创建的两个对象是不相同的
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
