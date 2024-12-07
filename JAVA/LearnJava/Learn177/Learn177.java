package NewLearn.Learn177;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Learn177 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(100, 200, 300, 400);
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        Collections.sort(list, (Integer o1, Integer o2) -> {
            return o1 - o2;
        });
    }
}
