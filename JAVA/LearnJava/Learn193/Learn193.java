package NewLearn.Learn193;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Learn193 {
    public static void main(String[] args) throws Exception {
        //jshell是Java9后的新特性，可以实现命令行交互
        FileInputStream in = new FileInputStream("C:\\Users\\86177\\IdeaProjects\\JAVA\\src\\NewLearn\\Learn193\\Learn193.java");
        FileOutputStream out = new FileOutputStream("C:\\Users\\86177\\IdeaProjects\\JAVA\\src\\NewLearn\\Learn193\\Learn193.java");
        try (in; out) {//Java9后特性改为可以将变量填到此处

        } catch (Exception e) {
            e.printStackTrace();
        }

        //Java10新特性，局部变量推断
        var i = 100;
        var d = 3.14;
        var flag = false;
    }
}
