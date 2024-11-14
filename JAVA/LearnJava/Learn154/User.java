package NewLearn.Learn154;

public class User {
    static {
        System.out.println("User的静态代码块执行了");
    }
    private String name;
    private int age;

    public User() {
        System.out.println("无参构造执行了");
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
