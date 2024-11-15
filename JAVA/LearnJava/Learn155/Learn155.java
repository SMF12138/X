package NewLearn.Learn155;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ResourceBundle;

public class Learn155 {
    public static void main(String[] args) throws Exception {
        ResourceBundle bundle = ResourceBundle.getBundle("NewLearn/Learn155/classInfo.properties");
        String className = bundle.getString("className");//从配置文件中获取类名路径
        Class classObj = Class.forName(className);//通过类名获取类
        Object obj = classObj.newInstance();//通过类实例化对象
        System.out.println(obj);//这样就达到了通过修改配置文件动态
        // 实例化对象的特点，更灵活且符合OCP原则

        Class vipClass = Class.forName("NewLearn.Learn155.Vip");
        Field[] fields1 = vipClass.getFields();//返回类中的所有public字段和属性
        for (Field field : fields1) {
            System.out.println(field.getName());
        }
        Field[] fields2 = vipClass.getDeclaredFields();//返回类中的所有的字段和属性
        for (Field field : fields2) {
            System.out.println(field.getName());
            Class fieldType = field.getType();//获取字段的类型
            System.out.println(fieldType);
            System.out.println(fieldType.getSimpleName());//不带包名的简单名称
            System.out.println(field.getModifiers());//获取修饰符，0默认，1公开，2私有，4受保护，8静态，16final
            System.out.println(Modifier.toString(field.getModifiers()));//接收int型并返回描述该修饰符的字符串
        }
    }
}
