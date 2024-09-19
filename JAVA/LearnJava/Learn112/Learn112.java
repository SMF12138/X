package NewLearn.Learn112;

import java.io.IOException;

public class Learn112 {
    public static void main(String[] args) throws IOException {
        //在IDEA工具中，默认当前路径是project的根(JAVA)，所以对于本类相对路径src\NewLearn\Learn112\Learn112
        String path = Thread.currentThread().getContextClassLoader().getResource("NewLearn/Learn112/log").getPath();
        //Thread.currentThread()获取当前线程，Thread.currentThread().getContextClassLoader()获取当前线程类加载器
        //getResource()从类的根路径(src)下开始加载资源
        System.out.println(path);//动态绝对路径，类路径外资源加载不到，但移植性高
    }
}
