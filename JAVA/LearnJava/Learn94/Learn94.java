package NewLearn.Learn94;

import java.util.ArrayDeque;
import java.util.Deque;

public class Learn94 {
    public static void main(String[] args) {
        Deque<String> queue = new ArrayDeque<>();//双向队列
        queue.offerLast("1");//队尾入队
        queue.offerLast("2");
        queue.offerLast("3");
        queue.offerLast("4");
        System.out.println(queue.pollFirst());//队头出队，先进先出
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());

        queue.offerFirst("1");//队头入队
        queue.offerFirst("2");
        queue.offerFirst("3");
        queue.offerFirst("4");
        System.out.println(queue.pollLast());//队尾出队，先进先出
        System.out.println(queue.pollLast());
        System.out.println(queue.pollLast());
        System.out.println(queue.pollLast());
    }
}
