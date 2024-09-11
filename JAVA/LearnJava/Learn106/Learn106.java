package NewLearn.Learn106;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Learn106 {
    public static void main(String[] args) {
        FileOutputStream out = null;
        try {
            out = new FileOutputStream("C:\\Users\\86177\\IdeaProjects\\JAVA\\src\\NewLearn\\Learn106\\linshi.txt.txt.txt.txt.docx.txt", true);
            //这里默认值是false，加true保证源文件不被清空
            byte[] bytes1 = {97, 98, 99};
            out.write(97);
            out.write(97);
            out.write(97);
            out.write(bytes1, 0, 2);//将前两个字节写入
            byte[] bytes2 = "将内容转成字节存入".getBytes(StandardCharsets.UTF_8);
            out.write(bytes2);
            out.flush();//将已写的内容存到硬盘
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
