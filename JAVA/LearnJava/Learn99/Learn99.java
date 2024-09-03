package NewLearn.Learn99;

import java.util.Enumeration;
import java.util.Properties;

public class Learn99 {
    public static void main(String[] args) {
        Properties properties = new Properties();//Properties继承Hashtable，线程安全，不支持泛型，key和value为String类型，不能为null
        //Properties为属性类，通常与属性文件一起使用
        properties.setProperty("jdbc.driver", "com.mysql.jdbc.Driver");//储存对象
        properties.setProperty("jdbc.user", "root");
        properties.setProperty("jdbc.password", "123123");
        System.out.println(properties.getProperty("jdbc.driver"));//根据key获取value
        System.out.println(properties.getProperty("jdbc.user"));
        System.out.println(properties.getProperty("jdbc.password"));
        Enumeration<?> names = properties.propertyNames();//或取所有key
        while (names.hasMoreElements()) {
            String name = (String) names.nextElement();
            System.out.println(name + ":" + properties.getProperty(name));
        }
    }
}
