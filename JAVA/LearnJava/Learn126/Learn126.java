package NewLearn.Learn126;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Learn126 {
    public static void main(String[] args) {
        try {
            InputStream in = System.in;
            byte[] bytes = new byte[1024];
            int readCount = in.read(bytes);
            for (int i = 0; i < readCount; i++) {
                System.out.println(bytes[i]);//输出仍是ASCII码
            }
            System.setIn(new FileInputStream("src\\NewLearn\\Learn126\\linshi.txt"));//初始化后更改调用要从System开始(因为in对象没有更改)
            System.out.println(System.in.read());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
