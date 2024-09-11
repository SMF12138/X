package NewLearn.Learn105;

import java.io.FileInputStream;
import java.io.IOException;

public class Learn105 {
    public static void main(String[] args) {
        FileInputStream in = null;
        byte[] bytes = new byte[4];
        try {
            in = new FileInputStream("C:\\Users\\86177\\IdeaProjects\\JAVA\\src\\NewLearn\\Learn104\\linshi.txt.txt.txt.txt.docx.txt");//构造输入流
            int read1 = in.read(bytes, 1, 2);//读取时同样可以限定存入数组位置和长度
            String s1 = new String(bytes, 1, read1);
            System.out.println(s1);
            in.skip(2);//跳过两个字节
            int read2 = in.read(bytes, 1, 2);//第一次读取两个第二次接着读取两个
            String s2 = new String(bytes, 1, read2);
            System.out.println(s2);
            System.out.println(in.available());//还剩几个字节未读
            //因此有byte[] bytes = new byte[in.available()];这种使用方式可以一次把所以字节读取
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
