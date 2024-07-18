package NewLearn.Learn55;

public class Learn55 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 6, 1, 8, 9, 2, 1};
        bubbleSort(arr);//√∞≈›≈≈–Ú
        for (int k : arr) {
            System.out.print(k+" ");
        }
        System.out.println();
        MySort(arr);
        for (int j : arr) {
            System.out.print(j+" ");
        }
        System.out.println();
        selectSort(arr);
        for (int j : arr) {
            System.out.print(j+" ");
        }
    }


    private static void MySort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            temp = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > temp) {
                    arr[i] = arr[j];
                    arr[j] = temp;
                    temp = arr[i];
                }
            }
        }
    }

    private static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            boolean flag = true;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) break;
        }
    }

    private static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            if(min!=i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
}
