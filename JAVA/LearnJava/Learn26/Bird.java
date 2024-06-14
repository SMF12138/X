package NewLearn.Learn26;

import NewLearn.Learn25.Animal;

public class Bird extends Animal {
    @Override//这个注解可以在编译阶段判断是否重写，如果不是会报错
    public void eat(){
        System.out.println("鸟在吃");
    }
}
