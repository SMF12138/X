package NewLearn.Learn92;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Stack;

public class Learn92 {
    public static void main(String[] args) {
        Stack<String> stack1 = new Stack<>();//数组实现栈
        LinkedList<String> stack2 = new LinkedList<>();//链表实现栈
        ArrayDeque<String> stack3 = new ArrayDeque<>();//双向队列实现栈
        stack1.push("A");//压栈
        stack1.push("B");
        stack1.push("C");
        stack1.push("D");
        System.out.println(stack1.search("A"));//搜索"A"位置，不存在返回-1，与数组不同栈顶默认位置为1
        System.out.println(stack1.pop());//弹栈，先进后出
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.peek());//窥视此时栈顶元素
        //stack2和stack3与其是一样的
    }
}
