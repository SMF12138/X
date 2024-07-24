package NewLearn.Learn61;

public class Learn61 {
    public static void main(String[] args) {
        User user = new User();
        try {
            user.setAge(100);
        } catch (Exception e) {
            System.out.println("年龄异常");
        }
    }
}

class User {
    private int age;

    public User() {
    }

    public User(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if (age < 0 || age > 100) {
            throw new Exception("年龄不合法");
        }
        this.age = age;
    }
}