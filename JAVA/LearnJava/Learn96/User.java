package NewLearn.Learn96;

import java.util.Objects;

public class User {
    private String name;
    private int age;

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

    @Override
    public String toString() {
        return "User1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj instanceof User user) {
            return user.name.equals(name) && user.age == age;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);//根据提供key中的属性生成哈希值，从而使相同属性产生哈希冲突
    }
}
