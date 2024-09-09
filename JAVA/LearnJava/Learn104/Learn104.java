package NewLearn.Learn104;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Learn104 {
    public static void main(String[] args) {
        InputStream in = null;//创建一个字节输入流(读取字节，可读任何类型，但一般用于读取音乐视频等字节文件)
        byte[] bytes = new byte[4];
        try {
            in = new FileInputStream("C:\\Users\\86177\\IdeaProjects\\JAVA\\src\\NewLearn\\Learn104\\linshi.txt.txt.txt.txt.docx.txt");
            int read1 = in.read();//返回读到的字节本身(ASCII码)
            int read2 = in.read(bytes);//一次最多读bytes.length个字节，返回值为读取到的字节数
            System.out.println("第一个字节" + read1);//读不到返回-1
            System.out.println("第一次读到" + read2 + "个字节");
            String s1 = new String(bytes);
            System.out.println(s1);
            int read3 = in.read(bytes);
            System.out.println("第二次读到" + read3 + "个字节");
            String s2 = new String(bytes);//只读取到一个字节替换首位，后面字节不变
            //如果想要读多少转多少字符串只需要new String(bytes,0,read)加入参数(0起始，read为读到的字符数，即需转到长度)即可
            System.out.println(s2);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
