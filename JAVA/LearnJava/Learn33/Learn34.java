package NewLearn.Learn33;

public class Learn34 {
    public static void main(String[] args) {
        Circle circle = new Circle("圆形","红色",2.0);
        circle.display();
        System.out.println(circle.getName()+"的面积是"+circle.area());
        Rectangle rectangle = new Rectangle("长方形","蓝色",2.0,3.0);
        rectangle.display();
        System.out.println(rectangle.getName()+"的面积是"+rectangle.area());
    }
}
