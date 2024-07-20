package NewLearn.Learn57;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Learn57{
    public static void main(String[] args) {
        int[] arr1 = {9,2,3,4,5};
        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));
        int[][] arr2 = {{1,1,1},{1,2,3}};
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.deepToString(arr2));//deep针对多维数组
        String[] name1 = {"aaa","bbb"};
        String[] name2 = {"aaa","bbb"};
        System.out.println(Arrays.equals(name1,name2));//比较两个数组是否一致
        Arrays.sort(arr1);//排序，注意也可以排字符串
        System.out.println(Arrays.toString(arr1));
        Person p1 = new Person(20);
        Person p2 = new Person(19);
        Person p3 = new Person(18);
        Person p4 = new Person(17);
        Person[] person = {p1,p2,p3,p4};
        Arrays.sort(person);
        /**
         * 在对自定义类型进行排序时底层代码会将自定义类型person转成Comparable接口类型，因此此接口的方法需要先在类中进行重写
         */
        System.out.println(Arrays.toString(person));
        
        int [] arr = new int[100000000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int num = random.nextInt(100000001);
            arr[i] = num;
        }
        long begin = System.currentTimeMillis();//获取1970-1-1 0:0:0到当前系统时间的总毫秒数
        Arrays.parallelSort(arr);//并行排序，适用于大数据量，效率高，数据长度超过4096时启用多核
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
        System.out.println(Arrays.binarySearch(arr,5));//binarySearch为JDK自带的二分查找方法Learn24

        int[] arr3 = new int[5];
        Arrays.fill(arr3,10);//fill为数组填充元素的方法
        System.out.println (Arrays.toString(arr3));
        Arrays.fill(arr3,1,3,1);//加入了开始和结尾下标两个参数(不包含结尾)
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = {1,2,3,4,5,6};
        int[] arr5 = Arrays.copyOf(arr4,3);
        int[] arr6 = Arrays.copyOfRange(arr4,2,4);//(不包含结尾)
        System.out.println(Arrays.toString(arr5));

        List list = Arrays.asList(1,2,3);//将一串数字转换成List集合
    }
}
