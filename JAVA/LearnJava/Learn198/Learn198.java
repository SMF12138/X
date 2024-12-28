package NewLearn.Learn198;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Learn198 {
    public static void main(String[] args) {
        //Java9后String底层储存数组由char[]变成byte[]，Java11后新增了一些方法
        System.out.println(" \n \t".isBlank());//是否空白字符串
        System.out.println("x".repeat(3));//重复3次
        "a\njj\nkl\n".lines().forEach(System.out::println);//按换行符分隔字符串生成流对象
        //Java12新增
        "hello world".indent(4);//在开始加入指定数目的空格
        //Java9中_不能独立命名标识符
        //Java11后使用cmd编译运行可以直接在当前目录下java xxx.java
        //不可添改的只读集合
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);//Set集合等同理
        List<Integer> list2 = Arrays.asList(1, 2, 3);//不可增删，但可改的集合
        list2.set(0, 6);//0号位改为6
        //Java8引入做空处理，代替从前if判断
        String name = null;
        Optional<String> optional = Optional.ofNullable(name);//将可能为空的name封装成Optional对象
        String s = optional.orElse("如果空返回括号内参数");
        System.out.println(s);
    }
}
