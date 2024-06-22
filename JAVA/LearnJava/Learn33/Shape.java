package NewLearn.Learn33;

public abstract class Shape {
    private String name;
    private String color;

    public Shape() {
    }

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract double area();
    public void display(){
        System.out.println(getName()+"µÄÑÕÉ«ÊÇ"+getColor());
    }
}
