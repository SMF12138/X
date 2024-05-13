package NewLearn.Learn5;

public class Learn5 {
    public static void main(String[] args){
       //任何一个数与1&，如果为0为偶数，如果为1为奇数
        int num = 35;
        if((num & 1)== 1){//注意优先级，要带()
            System.out.println("是奇数");
            num = num | (1<<3);//将第四位设置成1
            int data = 365725657;
            int key = 531332;
            int password = key^data;
            num = password^key;//异或有自反性用于加密解密
            int flag = (1<<3);
            num = num & (~flag);//按位取反用于将某二进制位清零
        }
    }
}
