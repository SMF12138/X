package NewLearn.Learn15;
//属性私有化private，只能在本类中访问
//为使外部访问，要提供访问入口(读/改)，即getter和setter
//getter接口有返回值无参数，setter接口无返回值有参数

public class User {
    private int age;
    public int getAge(){
        return age;
    }
    public void setAge(int age){//Java中有就近原则，因此若参数为age则不做属性使用


        if(age<0||age>100){
            System.out.println("不合理");
            return;
        }
        this.age = age;//因此这里this.表示属性不能省
    }
}
//此时类有了封装性
