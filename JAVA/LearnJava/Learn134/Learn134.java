package NewLearn.Learn134;

import java.io.*;

public class Learn134 {
    public static void main(String[] args) {
        //使用内存流复制的对象是深克隆
        Address addr = new Address("北京", "朝阳");
        User user1 = new User("zhangsan", 20, addr);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
            oos.writeObject(user1);
            oos.flush();
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            User user2 = (User) ois.readObject();//拷贝后的对象
            user2.getAddr().setCiyt("南京");//深克隆子对象不受影响
            System.out.println(user1);//序列化的过程要注意implements Serializable
            System.out.println(user2);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
