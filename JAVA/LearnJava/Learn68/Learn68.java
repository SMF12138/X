package NewLearn.Learn68;

public class Learn68 {
    public static void main(String[] args) {
        String s1 = "ab8opd5s6dd45d4";
        String s2 = "wud45f21f4f5ff1f45";
        String maxSubstring = getMaxSubstring(s1, s2);//求最大子字符串
        System.out.println(maxSubstring);
    }

    private static String getMaxSubstring(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        int maxLen = 0;
        int start = 0;
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                int k = 0;
                while (i + k < n1 && j + k < n2 && s1.charAt(i + k) == s2.charAt(j + k)) {
                    k++;
                }
                if (k > maxLen) {
                    maxLen = k;
                    start = i;
                }
            }
        }
        return s1.substring(start, start + maxLen);
    }
}
