package NewLearn.Learn50;
// 主类，用于测试魔法师类的使用
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};//静态初始化一个数组
        String[] name = {"baba","luck"};
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal a3 = new Animal();
        Animal[] animals = {a1,a2,a3,new Animal(),new Animal()};
        System.out.println(name.length);
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }
        //JDK5之后的for-each遍历数组(x表示数组元素)
        for(int x : arr){
            System.out.println(x);
        }
        double[] a = new double[10];//动态初始化，默认值0
        display(a);
        //还有些诡异的传参方式
        display(new double[]{1,2,3,4});
        display(new double[10]);
        Object[] objects = {a1,a2,a3};//父类型数组可以储存子类元素，这些元素被使用时需要向下转型调用方法(因为储存时已默认转为父类)
    }
    public static void display(double[] arr){
    }
}