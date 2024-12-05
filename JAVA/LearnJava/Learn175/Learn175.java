package NewLearn.Learn175;

import java.util.Comparator;
import java.util.TreeSet;

public class Learn175 {
    public static void main(String[] args) {
        //Java8ĞÂÌØĞÔLambda
        TreeSet<User> users = new TreeSet<>(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        User user1 = new User(20);
        User user2 = new User(25);
        User user3 = new User(22);
        users.add(user1);
        users.add(user3);
        users.add(user2);
        System.out.println(users);

        TreeSet<User> lambdaUsers = new TreeSet<>((User o1, User o2) -> {
            return o1.getAge() - o2.getAge();
        });
        lambdaUsers.add(user1);
        lambdaUsers.add(user3);
        lambdaUsers.add(user2);
        System.out.println(lambdaUsers);

        TreeSet<User> topLambdaUsers = new TreeSet<>((o1, o2) -> o2.getAge() - o1.getAge());
        topLambdaUsers.add(user1);
        topLambdaUsers.add(user3);
        topLambdaUsers.add(user2);
        System.out.println(topLambdaUsers);
    }
}

class User {
    private int age;

    public User(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                '}';
    }
}