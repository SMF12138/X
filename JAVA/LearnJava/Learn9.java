package NewLearn.Learn9;

public class Learn9 {
    //Java中定义方法名可以一致，即方法重载,但必须在同一个类，并且参数不同(顺序，个数，类型)
    //如果一个类中的方法类似，可以重载
    public static void main(String []args){

        int a = 0;
        int b = 0;
        sum(a,b);
    }

    public static void sum(int a,int b){
        
    }
    public static void sum(char a,int b){

    }
    public static void sum(long a,int b){

    }
}
