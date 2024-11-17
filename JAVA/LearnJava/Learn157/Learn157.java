package NewLearn.Learn157;

import java.lang.reflect.Field;

public class Learn157 {
    public static void main(String[] args) throws Exception{
        //不使用反射机制
        Customer customer = new Customer();
        customer.name = "张三";
        System.out.println(customer.name);

        //使用反射机制(与配置文件联合实现动态读取修改属性)
        Class clazz = Class.forName("NewLearn.Learn157.Customer");
        Field ageField = clazz.getDeclaredField("age");//根据字符串获取指定字段
        ageField.setAccessible(true);//调用方法打破封装，使私有属性可访问
        ageField.set(customer,30);//给对象customer的年龄赋值30，但如果属性是私有会报异常，因此要先打破封装
        System.out.println(ageField.get(customer));//获取属性信息，但如果属性是私有会报异常，因此要先打破封装


    }
}
