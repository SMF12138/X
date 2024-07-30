package NewLearn.Learn67;

public class Learn67 {
    public static void main(String[] args) {
        String s = "Ab1c2jqiJIJInNIinNn46464d5D4";
        char[] chars = s.toCharArray();
        int bigCount = 0, smallCount = 0, numCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                bigCount++;
            } else if (chars[i] >= 'a' && chars[i] <= 'z') {
                smallCount++;
            } else if (chars[i] >= '0' && chars[i] <= '9') {
                numCount++;
            }
        }
        System.out.println("大写字母个数" + bigCount);
        System.out.println("小写字母个数" + smallCount);
        System.out.println("数字个数" + numCount);
        s = "hello";
        String newStr = reverse(s);
        System.out.println(s + "反转后的结果是" + newStr);
        String s1 = "oraclejavac++mysqloraclejavapythonphporacle";
        int index = 0;
        int count = 0;
        while ((index = s1.indexOf("oracle")) != -1) {
            s1 = s1.substring(index + 1);//在目标字符串下标的下一位截取
            count++;
        }
        System.out.println(count);
    }

    private static String reverse(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }
        return new String(chars);
    }
}
