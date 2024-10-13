package NewLearn.Learn128;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Learn128 {
    public static void main(String[] args) {
        File file = new File("src\\NewLearn\\Learn128\\linshi.txt");//File是路径的抽象表现形式，可能是文件或目录
        System.out.println(file.exists() ? "存在" : "不存在");
        if (file.exists()) {
            try {
                System.out.println(file.createNewFile());//以新文件形式创建
                System.out.println(file.mkdir());//以目录形式创建
                System.out.println(file.mkdirs());//以多重目录形式创建
                System.out.println(file.getAbsoluteFile());//获取绝对路径
                System.out.println(file.getName());//获取文件名
                System.out.println(file.getParent());//获取父路径
                System.out.println(file.isDirectory());//判断是否是目录
                System.out.println(file.isFile());//判断是否是文件
                System.out.println(file.isHidden());//判断是否是隐藏文件
                Date time = new Date(file.lastModified());//获取文件最后修改时间
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
                System.out.println(sdf.format(time));
                System.out.println(file.length());//获取文件总字节
                System.out.println(file.renameTo(new File("src\\NewLearn\\Learn128\\ls.txt")));//重命名，同时能达到剪切效果
                File[] files1 = file.listFiles();//获取当前目录所有子目录，子文件
                System.out.println(files1);
                File[] files2 = file.listFiles(new FilenameFilter() {//加入过滤器
                    @Override
                    public boolean accept(File dir, String name) {
                        return name.endsWith(".txt");//true表示选中了所有文件
                    }
                });
                System.out.println(files2);
//                System.out.println(file.delete());//删除目录
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
