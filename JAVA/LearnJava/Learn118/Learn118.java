package NewLearn.Learn118;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Learn118 {
    public static void main(String[] args) {
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(" rc\\NewLearn\\Learn118\\linshi.txt"), StandardCharsets.UTF_8)) {
            //创建一个转换流(将字符流转换成字节流输入输出解决乱码问题)，包装了节点流FileInputStream
            char[] chars = new char[1024];
            int readCount;
            while ((readCount = isr.read(chars)) != -1) {//读取过程中文件字符转换为字节传入到内存，为防止解码失败可指定文件解码的字符集(默认为UTF-8)
                //FileReader是InputStreamReader的子类，因此也是包装流，但传字符集时必须用Charset.forName("...")对象，而不能直接传字符串
                System.out.println(new String(chars, 0, readCount));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
