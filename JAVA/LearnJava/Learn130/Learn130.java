package NewLearn.Learn130;

import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.ResourceBundle;

public class Learn130 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("src\\NewLearn\\Learn130\\jdbc.properties")) {
            Properties pro = new Properties();
            pro.load(reader);//将流中的配置文件读取到集合中
            Enumeration<?> names = pro.propertyNames();
            while (names.hasMoreElements()) {
                String name = (String) names.nextElement();
                System.out.println(name + ":" + pro.getProperty(name));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ResourceBundle bundle = ResourceBundle.getBundle("NewLearn\\Learn130\\jdbc");
        //资源绑定，注意这里用包名(从src为根)加文件名(不加后缀)，也可以写成NewLearn.Learn130.jdbc的形式
        System.out.println(bundle.getString("driver"));//可以直接拿到值，但根路径(src)外的配置无法绑定
    }
}
