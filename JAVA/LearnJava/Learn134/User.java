package NewLearn.Learn134;

import java.io.Serial;
import java.io.Serializable;

public class User implements Serializable {
//    @Serial
//    private static final long serialVersionUID = 12318;
    private String name;
    private int age;
    private Address addr;

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

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    public User(String name, int age, Address addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "User1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addr=" + addr +
                '}';
    }
}
