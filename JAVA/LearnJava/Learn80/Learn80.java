package NewLearn.Learn80;

import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;

public class Learn80 {
    public static void main(String[] args) {
        System.err.println("这是一个错误信息");
        long l = System.nanoTime();
        System.out.println(l);//总纳秒时间戳
        Map<String, String> map = System.getenv();//获取系统环境变量
        System.out.println(map);
        Properties properties = System.getProperties();//获取系统属性
        System.out.println(properties);
        Enumeration<Object> keys = properties.keys();//获取属性名字
        while (keys.hasMoreElements()) {
            Object o = keys.nextElement();//遍历名字
            System.out.println(o);
        }
        String vmName = System.getProperty("java.vm.name");//获取指定系统属性值
        System.out.println(vmName);

        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);
        System.out.println(uuid.toString().replace("-", "").toUpperCase());
    }
}
