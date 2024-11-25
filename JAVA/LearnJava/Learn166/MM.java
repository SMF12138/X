package NewLearn.Learn166;
@FunctionalInterface//函数式接口注解，用于只有一个抽象方法的接口，不符合会报错
public interface MM {
    @Deprecated

    void M();//如果再写一个抽象方法就会报错，但写默认方法，静态方法不会报错

}
