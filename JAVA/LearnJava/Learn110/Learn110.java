package NewLearn.Learn110;

import java.io.FileWriter;
import java.io.IOException;

public class Learn110 {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("C:\\Users\\86177\\IdeaProjects\\JAVA\\src\\NewLearn\\Learn110\\linshi.txt.txt")) {
            writer.write("张三");
            writer.write("张三shaaa", 1, 2);
            writer.write("张三shaaa".toCharArray());
            writer.write("张三shaaa".toCharArray(), 1, 2);
            writer.append("11111");
            writer.append("11111");
            writer.flush();//关闭时自动刷新
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}