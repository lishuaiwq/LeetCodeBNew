package main.solution;

/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */

import java.util.Stack;

public class Solution04 {
    // 中间栈
    private Stack<Integer> stack1 = new Stack<Integer>();
    //出栈
    private Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
       while (!stack1.empty()){
           stack2.push(stack1.pop());
       }
        return stack2.pop();
    }


    public static void main(String[] args) {
        Solution04 solution04 = new Solution04();
        solution04.push(1);
        solution04.push(2);
        solution04.push(3);

        solution04.push(4);
        solution04.push(5);
        System.out.println(solution04.pop());
        System.out.println(solution04.pop());
        System.out.println(solution04.pop());
        System.out.println(solution04.pop());
        System.out.println(solution04.pop());


    }
}
