package sliding_window;

public class longestSubstring {
    public static void main(String[] args) {
        longestSubstring longestSubstring = new longestSubstring();
        System.out.println(longestSubstring.lengthOfLongestSubstring("abcabcbb"));
    }
    public boolean isExists (String s, char x){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==x){
                return true;
            }
        }
        return false;
    }
    public int lengthOfLongestSubstring(String s) {
        int left = 0; int right = 0; String out = ""; int length = 0;
        while(left<s.length()){
            if(!isExists(out, s.charAt(left))){
                out+=s.charAt(left);
                left++;
                length = Integer.max(length, out.length());
            }
            else{
                right++;
                out=s.substring(right, left);
            }
        }
        return length;
    }
}
