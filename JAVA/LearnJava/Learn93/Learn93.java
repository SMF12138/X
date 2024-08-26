package NewLearn.Learn93;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Learn93 {
    public static void main(String[] args) {
        Queue<String> queue1 = new ArrayDeque<>();//底层是环形数组
        Queue<String> queue2 = new LinkedList<>();//底层是双向链表
        queue1.offer("1");//队尾入队
        queue1.offer("2");
        queue1.offer("3");
        queue1.offer("4");
        System.out.println(queue1.poll());//队头出队，先进先出
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());
    }
}