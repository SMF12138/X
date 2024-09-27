package NewLearn.Learn119;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Learn119 {
    public static void main(String[] args) {
        try (OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("src\\NewLearn\\Learn119\\linshi.txt"))) {
            //OutputStreamWrite与InputStreamReader性质类似
            osw.write("覆盖式写法，编码默认为UTF-8");
            //子类FileWriter
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
