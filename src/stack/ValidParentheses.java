package stack;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
    }
    public static boolean isValid(String s) {
        Stack<Character> characterStack = new Stack<>();
        HashMap<Character, Character> hashMap = new HashMap<>();
        hashMap.put('{','}');
        hashMap.put('[',']');
        hashMap.put('(',')');
        for(int i=0;i<s.length();i++){
            if(hashMap.containsKey(s.charAt(i))){
                characterStack.push(s.charAt(i));
            }
            else{
                if(characterStack.isEmpty() || (hashMap.get(characterStack.pop())!=s.charAt(i))){
                    return false;
                }
//                else if(hashMap.get(characterStack.pop())==s.charAt(i)){continue;}
            }
        }
//        if(characterStack.isEmpty()){return true;}
        return characterStack.isEmpty();
    }
}
