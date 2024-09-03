package two_pointers;

public class palindromeChecker {
    public static void main(String[] args) {
        palindromeChecker palindromeChecker = new palindromeChecker();
        System.out.println(palindromeChecker.isPalindrome("A man, a plan, a canal: Panama"));
    }
    public boolean isPalindrome(String s) {
        s = s.toLowerCase(); String temp = ""; String reverse = "";
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                temp+=s.charAt(i);
            }
        }
        for(int j=temp.length()-1;j>=0;j--){
            reverse+=temp.charAt(j);
        }
        if(temp.equals(reverse)){
            return true;
        }
        return false;
    }
}
