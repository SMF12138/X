package NewLearn.Learn156;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Learn156 {//反射机制

    public static void main(String[] args) throws ClassNotFoundException {
        Class Stringclass = Class.forName("java.lang.String");//这里可以选择任意一个类(可以和配置文件配合使用)
        StringBuilder sb = new StringBuilder();
        sb.append(Modifier.toString(Stringclass.getModifiers()));//获取类的修饰符拼接到字符串中
        System.out.println(sb);
        sb.append(" class ");
        sb.append(Stringclass.getSimpleName());//追加简单类名
        sb.append(" extend ");
        sb.append(Stringclass.getSuperclass().getSimpleName());//追加继承父类
        System.out.println(sb);
        Class[] interfaces = Stringclass.getInterfaces();//获取类中所有的接口返回数组
        if (interfaces.length > 0) {
            sb.append(" implements ");
            for (int i = 0; i < interfaces.length; i++) {
                Class interfaceClass = interfaces[i];
                sb.append(interfaceClass.getSimpleName());
                if (i != interfaces.length - 1) {
                    sb.append(", ");
                }
            }
        }
        sb.append("{\n");
        Field[] Fields = Stringclass.getDeclaredFields();//获取所有属性
        for (Field field : Fields) {
            sb.append("\t");
            sb.append(Modifier.toString(field.getModifiers()));//追加属性修饰符
            sb.append(" ");
            sb.append(field.getType().getSimpleName());//追加类型名
            sb.append(" ");
            sb.append(field.getName());//追加属性名
            sb.append(";\n");
        }
        sb.append("}");
        System.out.println(sb);
        //反编译(反射)完成
    }
}
