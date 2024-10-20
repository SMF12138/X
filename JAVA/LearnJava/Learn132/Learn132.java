package NewLearn.Learn132;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class Learn132 {
    public static void main(String[] args) {//如果不用下面模式，节点流不需要手动关闭，但包装流需要
        try (GZIPOutputStream gzip1 = new GZIPOutputStream(new FileOutputStream("src\\NewLearn\\Learn132\\yasuo1.gz"));//要写压缩文件名
             GZIPInputStream gzip2 = new GZIPInputStream(new FileInputStream("src\\NewLearn\\Learn132\\yasuo1.gz"));
             FileInputStream in = new FileInputStream("src\\NewLearn\\Learn132\\yasuo.txt");
             FileOutputStream out = new FileOutputStream("src\\NewLearn\\Learn132\\yasuo2.txt")) {
            byte[] bytes = new byte[1024];
            int readCount;
            while ((readCount = in.read(bytes)) != -1){
                gzip1.write(bytes,0,readCount);
            }
            gzip1.finish();//刷新并最终生成压缩文件
            while ((readCount = gzip2.read(bytes)) != -1){
                out.write(bytes,0,readCount);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
