package NewLearn.Learn194;

public class Learn194 {
    public static void main(String[] args) {
        //Java14新特性16发布instanceof的匹配模式
        //以前
        Animal c = new Cat();
        if (c instanceof Cat) {
            Cat cat = (Cat) c;
            cat.catchMouse();
        }
        //现在
        if (c instanceof Cat cat){//同时判断并向下转型
            cat.catchMouse();
        }

        //Java12增强了switch，语句执行后可返回(使用yield关键字)，可设置相同变量名，不用加break，case可设置多个值(之前应用过)
    }
}
