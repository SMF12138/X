package NewLearn.Learn133;

import java.io.*;
import java.util.Date;

public class Learn133{
    public static void main(String[] args) {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();//内存流为节点流因为只在内存中进行不需要打开关闭
             ObjectOutputStream oos = new ObjectOutputStream(baos)) {//根据装饰器设计模式，节点流可以和任意包装流结合使用
//            baos.write(1);内存流也可单独进行读写，但一般都进行包装
//            baos.write(1);
//            baos.write(1);
//            baos.write(1);

            oos.writeInt(100);
            oos.writeObject(new Date());
            oos.flush();//包装流中输出流需要手动刷新
            byte[] byteArray = baos.toByteArray();//获取内存中数组
            for (byte b : byteArray) {
                System.out.println(b);
            }
            ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);//读取时需要指定数组
            ObjectInputStream ois = new ObjectInputStream(bais);
            System.out.println(ois.readInt());
            System.out.println(ois.readObject());
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
