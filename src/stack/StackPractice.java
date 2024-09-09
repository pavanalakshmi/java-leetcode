package stack;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        System.out.println(stack);
//        System.out.println(stack.get(1));
        System.out.println(stack.size());
        System.out.println(stack.peek()); // gives top element without removing it.
        stack.empty();
        System.out.println(stack);
    }
}
