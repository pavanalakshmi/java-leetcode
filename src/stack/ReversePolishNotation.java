package stack;

import java.util.Stack;

public class ReversePolishNotation {
    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"2","1","+","3","*"}));
        System.out.println(evalRPN(new String[]{"4","13","5","/","+"}));
        System.out.println(evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> numbers = new Stack<>();
        for(String s: tokens){
            if(isInteger(s)){ //if(Character.isDigit(s.toCharArray()[0]))
                numbers.push(Integer.parseInt(s));
            }
            else{
                int num2 = numbers.pop();
                int num1 = numbers.pop();
                numbers.push(eval(s, num1, num2));
            }
        }
        return numbers.pop();
    }

    private static boolean isInteger(String s) {
        try{
            Integer.parseInt(s);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }

    private static int eval(String s, int num1, int num2) {
        int out=0;
        switch (s){
            case "*":
                out = num1*num2;
                break;
            case "/":
                out = num1/num2;
                break;
            case "+":
                out = num1+num2;
                break;
            case "-":
                out = num1-num2;
                break;
            default:
                throw new IllegalArgumentException("Invalid operator:" +s);
        }
        return out;
    }
}
