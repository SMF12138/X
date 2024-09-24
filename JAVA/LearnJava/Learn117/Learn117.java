package NewLearn.Learn117;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Learn117 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("src\\NewLearn\\Learn117\\linshi.txt"))) {
            System.out.println(br.read());//编码解码未指定默认为UTF-8
            System.out.println(br.read());
            br.mark(0);//标记字符位置(函数值在高版本无意义)
            System.out.println(br.read());
            br.reset();//返回标记位置
            System.out.println(br.read());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
