package NewLearn.Learn114;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Learn114 {
    public static void main(String[] args) {
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/NewLearn/Learn114/linshi.txt"))) {
            //BufferedOutputStream输出流与输入流类似
            bos.write("张稀然我是你爸爸".getBytes());
            bos.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
