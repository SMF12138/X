package NewLearn.Learn120;

import java.io.*;

public class Learn120 {
    public static void main(String[] args) {
        //DataOutputStream写的效率很高，不需要转码，直接将数据写入文件，但只能用DataInputStream来读取，二者显然也是包装流
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("src\\NewLearn\\Learn120\\linshi.txt"));
             DataInputStream dis = new DataInputStream(new FileInputStream("src\\NewLearn\\Learn120\\linshi.txt"))) {
            int a = 1024;
            dos.writeInt(a);//直接存入数据类型，打开时为二进制，其他类型于举例类似
            System.out.println(dis.readInt());//读取时也必须按顺序
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
