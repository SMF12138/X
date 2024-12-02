package NewLearn.Learn172;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Learn172 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://tianqi.qq.com/");
        InputStream inputStream = url.openStream();//通过url获取输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream,"UTF-8"));
        String s = null;
        while ((s = br.readLine())!=null){
            System.out.println(s);
        }
        br.close();
    }
}
