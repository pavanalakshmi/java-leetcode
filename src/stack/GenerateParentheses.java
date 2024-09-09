package stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0,0,n);
        return result;
    }
    private static void backtrack(List<String> result, String current, int open, int close, int n) {
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }
        // Add ( if open<n
        if (open < n) {
            backtrack(result, current + "(", open + 1, close, n);
        }
        // add ) if close<open
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, n);
        }
    }
}
