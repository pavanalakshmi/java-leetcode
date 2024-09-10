package stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class SimplifyPath {
    /**
    The path must start with a single slash '/'.
    Directories within the path must be separated by exactly one slash '/'.
    The path must not end with a slash '/', unless it is the root directory.
    The path must not have any single or double periods ('.' and '..') used to denote current or parent directories.
    **/
    public static void main(String[] args) {
        System.out.println(simplifyPath("/home/"));
        System.out.println(simplifyPath("/home//foo/"));
        System.out.println(simplifyPath("/home/user/Documents/../Pictures"));
        System.out.println(simplifyPath("/../"));
        System.out.println(simplifyPath("/.../a/../b/c/../d/./"));
    }
    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        List<String> path_split = new ArrayList<>();
        path_split.addAll(Arrays.asList(path.split("/")));
        StringBuilder output = new StringBuilder("");
// for(int i=0;i<path.split("/").length;i++){ path_split.add(path.split("/")[i]); stack.push(path.split("/")[i]); }
        for (String s : path_split) {
            if ((!s.equals("")) && (!s.equals(".")) && (!s.equals(".."))) {
                stack.push(s);
            }
            else if((s.equals("..")) && (!stack.isEmpty())){
                stack.pop();
            }
        }
        if(stack.isEmpty()){
            return "/";
        }
        else{
            for(String s: stack){
                output.append("/");
                output.append(s);
            }
        }
//        System.out.println(path_split); System.out.println(stack); System.out.println(output);
        return output.toString();
    }
}
