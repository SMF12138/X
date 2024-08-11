package NewLearn.Learn79;

import java.util.Random;

public class Learn79 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr1 = new int[10];
        double[] arr2 = new double[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(100);//取[0,99]间随机整数
            System.out.println(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = random.nextDouble(100);//取[0,99]间随机数
            System.out.println(arr2[i]);
        }
    }
}
