package NewLearn.Learn108;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Learn108 {
    public static void main(String[] args) {
        //Java7的新特性，凡是实现了AutoCloseable接口符合try-with-resources格式的流会自动关闭
        try (FileInputStream in = new FileInputStream("C:\\Users\\86177\\IdeaProjects\\JAVA\\src\\NewLearn\\Learn108\\linshi.txt.txt.txt.txt");
             FileOutputStream out = new FileOutputStream("C:\\Users\\86177\\IdeaProjects\\JAVA\\src\\NewLearn\\Learn108\\linshi.txt.txt.txt.txt")) {
            byte[] bytes = new byte[1024];//一次至少拷贝一KB
            int readCount;
            while ((readCount = in.read(bytes)) != -1) {
                out.write(bytes, 0, readCount);
            }
            out.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }//用这种格式流会自动关闭
    }
}
