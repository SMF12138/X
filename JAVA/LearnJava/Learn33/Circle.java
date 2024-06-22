package NewLearn.Learn33;

public class Circle extends Shape{
    private double radius;
    public Circle(){

    }
    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Constant.MATH_PI * radius * radius;
    }
}
