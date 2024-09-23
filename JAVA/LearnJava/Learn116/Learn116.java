package NewLearn.Learn116;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Learn116 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/NewLearn/Learn116/linshi.txt"))) {
            String s;
            while ((s = br.readLine()) != null) {//readLine方法每次读取一行，读不到返回null
                System.out.println(s);//BufferedWriter与其类似，不再举例
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
