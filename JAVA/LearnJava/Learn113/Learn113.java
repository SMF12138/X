package NewLearn.Learn113;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Learn113 {
    public static void main(String[] args) {
        //内存中的缓冲区为大的byte数组，读写时与缓冲区进行交互，减少了IO次数，提升了读写效率
        //节点流修饰后变成了缓冲流(包装流，处理流)，如BufferedInputStream就修饰了FileInputStream增添了缓冲区机制
        //读大文件建议缓冲流
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src\\NewLearn\\Learn113\\linshi.txt.txt"))) {
            //先创建节点流再创建包装流，包装流关闭时节点流自动关闭
            byte[] bytes = new byte[1024];
            int readCount;
            while ((readCount = bis.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, readCount));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
