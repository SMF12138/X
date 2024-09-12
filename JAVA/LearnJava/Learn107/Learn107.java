package NewLearn.Learn107;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Learn107 {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("C:\\Users\\86177\\Desktop\\清明再平阳.docx");
            out = new FileOutputStream("C:\\Users\\86177\\IdeaProjects\\JAVA\\src\\NewLearn\\Learn107\\linshi.txt.txt.txt.txt.docx");
            byte[] bytes = new byte[1024];//一次至少拷贝一KB
            int readCount;
            while ((readCount = in.read(bytes)) != -1) {
                out.write(bytes, 0, readCount);
            }
            out.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (in != null) {
                    out.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
