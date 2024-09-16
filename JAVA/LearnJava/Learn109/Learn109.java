package NewLearn.Learn109;

import java.io.FileReader;
import java.io.IOException;

public class Learn109 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("C:\\Users\\86177\\IdeaProjects\\JAVA\\src\\NewLearn\\Learn109\\linshi.txt.txt.txt.txt")) {
            char[] chars = new char[512];//½ÓÊÕ×Ö·û
            int readCount;
            while ((readCount = reader.read(chars)) != -1) {
                System.out.println(new String(chars, 0, readCount));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
