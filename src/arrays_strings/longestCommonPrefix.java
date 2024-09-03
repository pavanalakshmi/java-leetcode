package arrays_strings;

import java.util.Arrays;

public class longestCommonPrefix {
    public static void main(String[] args) {
        longestCommonPrefix longestCommonPrefix = new longestCommonPrefix();
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"flow","flower","flow","flight"}));
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"}));
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"a"}));
    }
    public String longestCommonPrefix(String[] strs) {
        String result = ""; int k=0;
        if(strs.length==1){
            return strs[0];
        }
        while(k<strs[0].length()){
            for(int i=1;i<strs.length;i++) {
                if ((k >= strs[i].length()) || (strs[0].charAt(k) != strs[i].charAt(k))) {
                    return result;
                }
            }
                result=result+strs[0].charAt(k);
                k++;
            }
    return result;
    }
}
