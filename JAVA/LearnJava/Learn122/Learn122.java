package NewLearn.Learn122;

import java.io.*;

public class Learn122 {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\NewLearn\\Learn122\\linshi.txt"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\NewLearn\\Learn122\\linshi.txt"))) {
            Student student = new Student("zhangsan", 25);
            oos.writeObject(student);//自定义类型参与序列化和反序列化必须实现接口否则会报错
            System.out.println(ois.readObject());//实现Serializable接口，编译器会给类自动添加一个序列化版本号
            //通过类名和序列化版本号区分类，确保只有序列化和反序列化是同一个类，改动类代码后版本号发生改变，无法再反序列化
            //因此如果确定这个类还是之前的类，建议把版本号写死
            oos.flush();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
