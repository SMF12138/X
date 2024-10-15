package NewLearn.Learn52;

public class Learn52 {
    public static void main(String[] args) {
        m1();
        m1(1);
        m1(1,2);
        m1(new int[]{1,2,3});
        int[] arr1 = {1,2,3,4,5,6,7,8};
        int[] dest = new int[arr1.length*2];
        System.arraycopy(arr1,0,dest,0,arr1.length);//将arr1中的数据拷贝到dest中，起始下标都为0
    }
    public static void m1(int... nums){//可变长参数，只能含有一个并且出现在最后一位，
        System.out.println("方法执行了");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);//可变长参数可以当成数组
        }
    }
}
