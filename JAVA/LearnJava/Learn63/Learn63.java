package NewLearn.Learn63;

public class Learn63 {
    //如果子类继承父类，子类不能抛出更多的异常，只能更少
    public static void main(String[] args) {
        int i = 100;
        try {
            String s = null;
            System.out.println(m(i));//
        } catch (Exception e) {
            System.out.println("出现了异常");
        } finally {
            System.out.println("但finally语句块中的代码不论异常一定会执行");//一般用来关闭资源
        }
    }

    private static int m(int i) {
        try {
            return i;//即使加入return，finally依然执行，但如果换成System.exit(0);则无法继续执行
        } finally {
            i++;
            System.out.println(i);//返回的值提前保存临时变量，这个变量会覆盖i++后的结果，故返回值不变
        }
    }
}
