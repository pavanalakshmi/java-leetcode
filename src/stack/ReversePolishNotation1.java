package stack;

import java.util.Stack;

public class ReversePolishNotation1 {
    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"2","1","+","3","*"}));
        System.out.println(evalRPN(new String[]{"4","13","5","/","+"}));
        System.out.println(evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> numbers = new Stack<>();
        for(String s: tokens){
            if(s.equals("+")){
                numbers.push(numbers.pop() + numbers.pop());
            }
            else if(s.equals("-")){
                int n2 = numbers.pop();
                int n1 = numbers.pop();
                numbers.push(n1-n2);
            }
            else if(s.equals("*")){
                numbers.push(numbers.pop() * numbers.pop());
            }
            else if(s.equals("/")){
                int n2 = numbers.pop();
                int n1 = numbers.pop();
                numbers.push(n1/n2);
            }
            else{
                numbers.push(Integer.parseInt(s));
            }
        }
        return numbers.pop();
    }
}
