package NewLearn.Learn53;

public class Learn53 {
    public static void main(String[] args) {
        //二维数组静态初始化
        int[][] arr1 = new int[][]{//new int[][]可省
                {1, 2, 3}, {1, 2, 3, 4}, {1, 2}};
        System.out.println(arr1.length);
        System.out.println(arr1[0].length);
        System.out.println(arr1[1].length);
        System.out.println(arr1[2].length);
        //二维数组动态初始化
        int[][] arr2 = new int[3][4];
        arr2[0] = new int[]{1, 2, 3, 4};
        arr2[1] = new int[]{5, 6, 7, 8};
        arr2[2] = new int[]{9, 10, 11, 2};
    }
}
