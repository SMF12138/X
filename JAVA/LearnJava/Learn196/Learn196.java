package NewLearn.Learn196;

public class Learn196 {
    public static void main(String[] args) {
        User user = new User("1", 1);//只是载体的类
    }

    public record recordUser(String name, int age) {
        //如果在开发中类只作为载体，那么可将其定义为record，自动带有提供的实例变量以及各种方法(User类中的都有)

        static int i = 9;//静态变量

        public recordUser {
            System.out.println("无参构造");
        }

        public static void m1() {
            System.out.println("静态方法");
        }

        public void m2() {
            System.out.println("实例方法");
        }//这些都可以添加
    }
}
