package NewLearn.Learn171;

import java.net.InetAddress;
import java.net.URL;


public class Learn171 {
    public static void main(String[] args) throws Exception {
        InetAddress ia1 = InetAddress.getLocalHost();//获取本机的对象
        String hostAddress = ia1.getHostAddress();//获取本机的ip地址
        String hostName = ia1.getHostName();//获取本机的名字
        System.out.println(hostAddress);
        System.out.println(hostName);

        InetAddress ia2 = InetAddress.getByName("www.baidu.com");//获取指定域名的本机对象
        System.out.println(ia2.getHostName());//获取域名和ip
        System.out.println(ia2.getHostAddress());

        //URL包括协议，ip，端口，资源名四部分，是某个资源唯一标识
        URL url = new URL("https://www.baidu.com:8888/oa/index.html?name=zhangsan&password=123#tip");
        System.out.println(url.getProtocol());//获取协议
        System.out.println(url.getPath());//获取资源名
        System.out.println(url.getDefaultPort());//获取默认端口(http默认80)
        System.out.println(url.getPort());//获取当前端口
        System.out.println(url.getHost());//获取ip地址
        System.out.println(url.getQuery());//获取需要提交给服务器的数据
        System.out.println(url.getRef());//获取锚点
        System.out.println(url.getFile());//获取资源路径加数据
    }
}
