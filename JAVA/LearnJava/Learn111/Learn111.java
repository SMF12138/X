package NewLearn.Learn111;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Learn111 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("C:\\Users\\86177\\IdeaProjects\\JAVA\\src\\NewLearn\\Learn111\\linshi.txt.txt");
             FileWriter writer = new FileWriter("C:\\Users\\86177\\IdeaProjects\\JAVA\\src\\NewLearn\\Learn111\\copy.txt")) {
            char[] chars = new char[1024];
            int readCount;
            while ((readCount = reader.read(chars)) != -1) {//¸´ÖÆ×Ö·ûÎÄ¼þ
                writer.write(chars, 0, readCount);
            }
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
