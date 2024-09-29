package NewLearn.Learn121;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Learn121 {
    public static void main(String[] args) {
        //对象转二进制的过程叫序列化，二进制转对象的过程叫反序列化
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\NewLearn\\Learn121\\linshi.txt"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\NewLearn\\Learn121\\linshi.txt"))) {
            Date nowTime = new Date();
            oos.writeObject(nowTime);//包装流，序列化，输出
            Object o = ois.readObject();//反序列化，输入
            System.out.println(o);
            Date date = new Date();
            List<Date> list = new ArrayList<>();
            list.add(date);
            list.add(nowTime);
            oos.writeObject(list);//序列化多个对象采用集合
            System.out.println(ois.readObject());//反序列化多个对象
            oos.flush();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
