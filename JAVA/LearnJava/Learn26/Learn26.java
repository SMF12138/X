package NewLearn.Learn26;
//上转型和下转型(引用类型)
//向上转型(子转父)(自动)
//向下转型(父转子)(强制)
public class Learn26 {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.eat();
        animal1.run();
        Cat cat1 = new Cat();
        cat1.eat();
        cat1.run();
        Bird bird = new Bird();
        bird.eat();
        bird.run();
        //向上转型
        Animal animal2 = new Cat();
        //编译时判断animal2为Animal类，寻找eat方法
        //但运行时堆内存中真实的对象是Cat，会自动调用Cat的eat方法，这种绑定称为动态绑定
        //编译时和运行时的状态不同，称为多态
        //多态的核心是父类引用指向子类对象
        animal2.eat();
        //如果animal2调用Cat中特有的方法会在编译阶段失败，此时只能向下转型
        //向下转型
        Cat cat2 = (Cat)animal2;
        cat2.catchMouse();
        /**
         * 下面是一个重要的错误，编译可以通过但运行报错
         * Animal animal = new Cat();
         * 堆中真实对象是Cat,无法转换成Bird
         * Bird bird = (Bird) animal;
         * 因此向下转型有一定风险
         */
        Animal animal = new Cat();
        //因此出现instanceof关键字用于检查一个对象是否是一个类或其子类的实例
        if(animal instanceof Cat){
            //animal instanceof Cat结果为False
            //因为在Java中，除非animal引用了Cat对象，否则不能直接转成Cat型
            Cat A=(Cat)animal;
            //快捷键变量名.castvar
        }
        //这样将Animal型转为Cat型避免错误
    }
}
