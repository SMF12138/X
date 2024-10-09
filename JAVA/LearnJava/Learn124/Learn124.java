package NewLearn.Learn124;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Learn124 {
    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter(new FileWriter("src\\NewLearn\\Learn124\\linshi.txt"), true)) {

            //PrintWriter比PrintStream多一个构造方法，不仅可以传OutputStream，也可以传FileWriter
            pw.print(100);
            pw.print("100");
            pw.print(true);
            pw.println();//支持自动换行，转义及自动选择编码(字符集)
            pw.print(9.6);
            pw.printf("姓名:%d", 1);//支持格式化打印
            pw.flush();//但是需要手动刷新，或者传入true参数
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
