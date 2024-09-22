package NewLearn.Learn115;

import java.io.*;

public class Learn115 {
    public static void main(String[] args) {
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/NewLearn/Learn115/copy.txt"));
             BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/NewLearn/Learn115/linshi.txt"))) {
            byte[] bytes = new byte[1024];
            int readCount;
            while ((readCount = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, readCount);//拷贝大文件缓冲流效率更高
            }
            bos.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
