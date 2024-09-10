package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CalculatorStack {
    public static void main(String[] args) {
        System.out.println(calculate("1 + 1"));
        System.out.println(calculate(" 2-1 + 2 "));
        System.out.println(calculate("(1+(4+5+2)-3)+(6+8)"));
        System.out.println(calculate("1-(     -2)"));
        System.out.println(calculate("(1+(4+5+2)-3)+(6+8)"));
        System.out.println(calculate("- (3 + (4 + 5))"));
        System.out.println(calculate("2-1 - 2"));
    }

    public static int calculate(String s) {
        List<String> tokens = tokenize(s);
        // Handle parentheses first
        tokens = handleParenthesis(tokens);
//        // handle multiply and division first
        tokens = performMultiplyAndDivision(tokens);
//        // handle subtraction and division
        return performSubtractionAndAddition(tokens);
    }

    public static List<String> tokenize(String s){
        List<String> tokens = new ArrayList<>();
        StringBuilder numbers = new StringBuilder();
        boolean lastCharWasOperatorOrOpenParen = true;
        // loop through the given expression as characters
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            // if character is a number, append to numbers string.
            if(Character.isDigit(ch)){
                    numbers.append(ch);
                lastCharWasOperatorOrOpenParen = false;
                }
            else if (ch == ' '){
                continue;
            }
            else{
                // if char is an operator and numbers is not empty, add the operator to tokens
                if (!numbers.isEmpty()) {
                    tokens.add(numbers.toString());
                    numbers.setLength(0);
                }
                if (ch == '-' && (lastCharWasOperatorOrOpenParen || (i > 0 && s.charAt(i - 1) == '('))) {
                    numbers.append(ch);
                } else {
                    tokens.add(String.valueOf(ch));
                    lastCharWasOperatorOrOpenParen = (ch == '(' || ch == '+' || ch == '-');
                }
//                if (ch == '-' && (i == 0 || s.charAt(i - 1) == '(' || s.charAt(i - 1) == '+' || s.charAt(i - 1) == ' ')) {
//                    // Handle negative numbers
//                    numbers.append(ch); // It's a negative number, not an operator
//                }
//                else{
//                    tokens.add(Character.toString(ch));
//                }
            }
        }
        // Add the last number
        if(!numbers.isEmpty()){
            tokens.add(numbers.toString());
        }
        // the tokens array will be [21, -, 31, *, 22]
//         System.out.println(tokens);
        return tokens;
    }

    public static List<String> handleParenthesis(List<String> tokens){
        Stack<List<String>> stack = new Stack<>();
        List<String> currentList = new ArrayList<>();

        for(String token: tokens){
            if(token.equals("(")){
                stack.push(currentList);
                currentList = new ArrayList<>();
            }
            else if(token.equals(")")){
                // process the current list and then pop from stack
                List<String> result = performMultiplyAndDivision(currentList);
                int finalresult = performSubtractionAndAddition(result);
                currentList = stack.pop();
                currentList.add(String.valueOf(finalresult));
            }
            else{
                currentList.add(token);
            }
        }
        return currentList;
    }

    public static int performSubtractionAndAddition(List<String> tokens){
            int result = 0;
            int currentNumber = 0;
            String operation = "+"; // Start with addition operation
            for (String token : tokens) {
                if (token.equals("+") || token.equals("-")) {
                    // When encountering an operator, apply the previous operation
                    if (operation.equals("+")) {
                        result += currentNumber;
                    } else if (operation.equals("-")) {
                        result -= currentNumber;
                    }
                    // Update the operation to the new one
                    operation = token;
                    currentNumber = 0; // Reset current number
                } else {
                    // Handle numbers (including negative ones)
                    currentNumber = Integer.parseInt(token);
                }
            }
            // Apply the last operation
            if (operation.equals("+")) {
                result += currentNumber;
            } else if (operation.equals("-")) {
                result -= currentNumber;
            }

            return result;
//        int result = Integer.parseInt(tokens.get(0));
//        for(int i=1;i<tokens.size();i+=2){
//            String operator = tokens.get(i);
//            if(operator.equals("+")){
//                result+=Integer.parseInt(tokens.get(i+1));
//            }
//            else if(operator.equals("-")){
//                result-=Integer.parseInt(tokens.get(i+1));
//            }
//        }
//        return result;
    }

    public static List<String> performMultiplyAndDivision(List<String> tokens){
        List<String> result = new ArrayList<>();
        int i=0;
        while(i<tokens.size()){
            String token = tokens.get(i);
            if((token.equals("*")) || (token.equals("/"))){
                int num1 = Integer.parseInt(result.remove(result.size()-1));
                int num2 = Integer.parseInt(tokens.get(i+1));
                int calculatedResult = 0;
                // int calculatedResult = token.equals("*") ? num1 * num2 : num1 / num2;
                if(token.equals("/")){
                    calculatedResult = num1/num2;
                }
                else if(token.equals("*")){
                    calculatedResult = num1*num2;
                }
                result.add(String.valueOf(calculatedResult));
                i+=2;
            }
            else{
                result.add(token);
                i++;
            }
        }
        return result;
    }
}
