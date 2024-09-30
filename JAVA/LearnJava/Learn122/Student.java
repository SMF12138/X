package NewLearn.Learn122;

import java.io.Serial;
import java.io.Serializable;

public class Student implements Serializable {//只有实现这个接口才能序列化
    @Serial
    private static final long serialVersionUID = 12138;//给类提供一个固定序列化号，这样避免后期改动类后报错
    private String name;
    private transient int age;//加入transient修饰符，则该属性不参与序列化，打印时输出默认值

    public Student() {
    }

    public Student(String name, int age) {
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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
