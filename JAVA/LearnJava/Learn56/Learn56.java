package NewLearn.Learn56;

public class Learn56 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 8, 9, 17, 25, 36, 43, 47};
        int num = 43;
        int index = binarySearch(arr,num);//二分查找
        System.out.println(num + "的下标是" + index);
    }

    private static int binarySearch(int[] arr, int num) {
        int left = 0;
        int right = arr.length-1;
        int mid =(left + right)/2;
        while (num!=arr[mid]) {
            if (num<=arr[mid]) right = mid - 1;
            else if (num>=arr[mid]) left = mid + 1;
            if(left > right) {
                System.out.println("查找的数不存在");
                return -1;
            }
            else mid = (left + right)/2;
        }
        return mid;
    }
}
