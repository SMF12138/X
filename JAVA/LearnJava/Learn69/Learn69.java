package NewLearn.Learn69;

public class Learn69 {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder();//创建一个初始化容量16的StringBuilder对象
        String stringBuilder2 = "";//初始化容量320
        StringBuilder stringBuilder3 = new StringBuilder("abc");//放入字符串abc
        String stringBuilder4 = String.valueOf(stringBuilder3);//放入其他对象
        stringBuilder1.append("hello");//追加字符串
        stringBuilder1.append("world");//追加字符串
        stringBuilder1.append(100);//追加字符串
        stringBuilder1.append(false);//追加字符串
        System.out.println(stringBuilder1);//追加后的空间为原空间的二倍加二，但如果追加的字符所占空间超过该值则直接分配所占空间
        System.out.println(stringBuilder2);
        System.out.println(stringBuilder3);
        System.out.println(stringBuilder4);
        stringBuilder1.delete(3, 5);//删除[3,5)范围的字符
        System.out.println(stringBuilder1);
        stringBuilder1.deleteCharAt(3);//删除指定位置的字符
        System.out.println(stringBuilder1);
        stringBuilder1.insert(3, "AOE");
        System.out.println(stringBuilder1);//插入指定字符串
        stringBuilder1.replace(3, 5, "COC");//替换[3,5)范围字符串
        System.out.println(stringBuilder1);
        stringBuilder1.reverse();
        System.out.println(stringBuilder1);
        stringBuilder1.setLength(3);
        System.out.println(stringBuilder1);//将3后的字符串抹除
    }
}
