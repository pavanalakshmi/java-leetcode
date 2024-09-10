package stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minValueStack;

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        String[] operations = {"MinStack", "push", "push", "push", "getMin", "pop", "top", "getMin"};
        String[] values = {"", "-2", "0", "-3", "", "", "", ""};
//      String[][] input = {{}};
        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "MinStack":
                    // already initialized
                    break;
                case "push":
                    minStack.push(Integer.parseInt(values[i]));
                    break;
                case "getMin":
                    System.out.println(minStack.getMin());
                    break;
                case "pop":
                    minStack.pop();
                    break;
                case "top":
                    System.out.println(minStack.top());
                    break;
            }
        }
    }

    public MinStack() {
        stack = new Stack<>();
        minValueStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minValueStack.isEmpty() || val <= minValueStack.peek()) {
            minValueStack.push(val);
        }
    }

    public void pop() {
        if (!stack.isEmpty() && stack.peek().equals(minValueStack.peek())) {
            minValueStack.pop();

        }
        if (!stack.isEmpty()) {
            stack.pop();
        }
    }

    public int top() {
        if(stack.isEmpty()){
            throw new EmptyStackException();
        }
        return stack.peek();
    }

    public int getMin() {
        if(minValueStack.isEmpty()){
            throw new EmptyStackException();
        }
        return minValueStack.peek();
    }
}