package NewLearn.Learn129;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Learn129 {
    public static void main(String[] args) {
        File src = new File("src\\NewLearn\\Learn128");
        File dest = new File("src\\NewLearn\\Learn129");
        copy(src, dest);//将一个目录(同所有上下级目录)拷贝到另一个目录，(实现的有些抽象)
    }

    private static void copy(File src, File dest) {
        if (src.isFile()) {
            try (FileInputStream in = new FileInputStream(src);
                 FileOutputStream out = new FileOutputStream(dest.getAbsolutePath() + src.getAbsolutePath().substring(2))) {
                byte[] bytes = new byte[1024 * 1024];
                int readCount;
                while ((readCount = in.read(bytes)) != -1) {
                    out.write(bytes, 0, readCount);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return;
        }
        File newDir = new File(dest.getAbsolutePath() + src.getAbsolutePath().substring(2));
        if (!newDir.exists()) {
            newDir.mkdirs();//不存在则创建新目录
        }
        File[] files = src.listFiles();
        for (File file : files) {
            copy(file, dest);
        }
    }
}
