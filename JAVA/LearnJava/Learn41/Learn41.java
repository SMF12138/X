package NewLearn.Learn41;

public class Learn41 {
    public static void main(String[] args) {
        Date date1 = new Date(2024,5,14);
        /**
         *     源码
         *     public String toString() {
         *         return getClass().getName() + "@" + Integer.toHexString(hashCode());
         *     }
         */
        String s = date1.toString();
        //将对象转换成字符串地址
        System.out.println(date1);
        //注意打印对象时自动调用toString!!!
        System.out.println(s);//但这样写可以避免空指针异常(内部类默认打印null字符串)
        Date date2 = new Date(2024,5,14);
        System.out.println(date1.equals(date2));
    }
}
