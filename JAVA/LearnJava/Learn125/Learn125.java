package NewLearn.Learn125;

import java.io.IOException;
import java.io.InputStream;

public class Learn125 {
    public static void main(String[] args) {
        //标准输入流是指从控制台读取，普通输入流是指从文件或网络等
        InputStream in = System.in;//标准输入流是全局输入流，随JVM关闭，因此不需要手动关闭
        byte[] bytes = new byte[1024];
        int readCount;
        try {
            readCount = in.read(bytes);
            for (int i = 0; i < readCount; i++) {
                System.out.println(bytes[i]);//将从控制台上读取的字节转换成ASCII码打印，换行符也获取
            }
            System.out.println(in.read());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
