package NewLearn.Learn38;

public class Learn38 {
    public static void main(String[] args) {
        XiaoYan xiaoYan = new XiaoYan("小燕子",1);
        xiaoYan.display();
        xiaoYan.eat();
        Dog dog = new Dog("狗",2);
        dog.display();
        dog.eat();
        YingWu yingWu = new YingWu("傻鸟",3);
        yingWu.display();
        yingWu.eat();
        if (xiaoYan instanceof Flyable){
            Flyable x = (Flyable)xiaoYan;
            x.fly();
        }
        if (xiaoYan instanceof Speakable){
            //类转换成接口不考虑继承关系!!!
            Speakable x = (Speakable)xiaoYan;
            x.speak();
        }
        if (yingWu instanceof Flyable){
            Flyable y = (Flyable)yingWu;
            y.fly();
        }
        if (yingWu instanceof Speakable){
            Speakable y = (Speakable)yingWu;
            y.speak();
        }
    }
}
