package NewLearn.Learn168.源文件;

@Authors({})//这个注解会保存在字节码中且运行时可以反射

public class Learn168 {
    public static void main(String[] args) {
        Class<Learn168> testClass = Learn168.class;
        Authors annotation = testClass.getAnnotation(Authors.class);//获取这个类上的注解，参数是为了指明具体哪个注解
        System.out.println(annotation);//成功被反射机制所拿到，而如果保持性不能被反射则读取为null，内置注解的保持性各不相同
        //所有自定义的注解父类都是annotation(接口)
    }
}
