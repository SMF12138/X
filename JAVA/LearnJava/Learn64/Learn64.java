package NewLearn.Learn64;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class Learn64 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //Java8之后字符串常量池在堆中，字符串字面量在JVM启动时就会创建好，是一种缓存技术，省去了对象创建的过程
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);//这里比较的是内存地址，全部由字符常量池取出(但是其他的对象不能用==直接比较)
        String s3 = s1 + s2;
        String s4 = "abcabc";
        System.out.println(s3 == s4);//底层在+时会创建一个StringBuilder对象(至少有一个对象)，进行字符串拼接，
        //最后调用StringBuilder对象的toString方法，再将StringBuilder对象转换成String对象，所以结果为false
        String s5 = "abc" + "abc";
        String s6 = "abcabc";
        System.out.println(s5 == s6);//s5在编译时已经拼好，结果为true
        String s7 = s3.intern();//将s3放入常量池中，将地址返回给s7(由于已经有s4，实际上返回的是s4地址)
        System.out.println(s4 == s7);//此时s4等于s7
        final String ss = "abc";
        System.out.println((ss + "abc") == "abcabc");//ss用final修饰后可视为常量，因此此时不新创建StringBuilder对象，结果为true
        final String s0 = getABC();
        System.out.println((s0 + "abc") == "abcabc");//s0由于接收的是方法返回值，无法在编译阶段确定返回结果，结果为false
        //关于String的构造方法(注意如果StringBuilder对象和String用equals比较结果为false，因为类型不同)
        char[] chars = new char[]{'动', '力', '节', '点'};
        String s8 = new String(chars);
        System.out.println(s8);
        String s9 = new String(chars, 0, 2);//起始位0，个数2
        System.out.println(s9);
        byte[] bytes = {97, 98, 99, 100};//编码
        String s10 = new String(bytes);//解码，采用平台默认方式
        System.out.println(s10);
        String s11 = new String(bytes, 0, 2);//起始位0，个数2
        System.out.println(s11);
        byte[] bs1 = "我是张稀然的爸爸".getBytes("GBK");//编码
        String s12 = new String(bs1, "GBK");
        System.out.println(s12);
        byte[] bs2 = "我是张稀然的爸爸".getBytes(Charset.defaultCharset());//采用平台默认编码
        String s13 = new String(bs2, Charset.defaultCharset());//采用平台默认解码
        System.out.println(s13);
    }

    public static String getABC() {
        return "abc";
    }
}
