package NewLearn.Learn46;

public class Learn46 {

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.m3();
    }
}
