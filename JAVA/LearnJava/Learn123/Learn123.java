package NewLearn.Learn123;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Learn123 {
    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("src\\NewLearn\\Learn124\\linshi.txt")) {
            //打印流可以打印各种类型，并且可以自动刷新
            ps.print(100);
            ps.print("100");
            ps.print(true);
            ps.println();//支持自动换行，转义及自动选择编码(字符集)
            ps.print(9.6);
            ps.printf("姓名:%d", 1);//支持格式化打印
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
