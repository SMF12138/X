package NewLearn.Learn167;

public class Learn167 {
    public static void main(String[] args) {
        @M(age = 2, L = @L("1"), schools = {"1", "2"}, m = {"1"}, value = "")//哪里都能用(包括方法参数前)
                //如果注解中单独只有value名的属性，使用注解时该名可以省略，若单个属性是数组，大括号可以省略
        int a;
        //如果注解里有属性那么使用时必须赋值否则报错，除非定义注解时给属性指定了默认值default，类型只能是基本数据类型，String，Class，枚举，注解，和这些类型的一位数组

    }
}


