package NewLearn.Learn43;

public class Learn43 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Learn43 test1 = new Learn43();
        int i = test1.hashCode();
        System.out.println(i);//根据对象的内存地址生成哈希值
        /**
         * test1.finalize();
         * 方法需要在子类中重写，由GC垃圾回收器自动回收时调用
         * finalize()方法在JDK9已被废弃
         */
        User user = new User(20);
        System.out.println(user.getAge());
        //注意clone()是protected方法，在包外只能通过子类重写的方法来继承，所以User类中需要重写
        //clone对对象进行拷贝，保护原对象的数据结构，复制一份，生成新对象
        Object obj = user.clone();
        //这是一种浅克隆
        User copyuser = (User) obj;
        copyuser.setAge(100);
        System.out.println("克隆后年龄"+copyuser.getAge());

    }
}
