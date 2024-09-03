package two_pointers;

public class isSubSequence {
    public static void main(String[] args) {
        isSubSequence isSubSequence = new isSubSequence();
        System.out.println(isSubSequence.isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubSequence.isSubsequence("axc", "ahbgdc"));
    }
    public boolean isSubsequence(String s, String t) {
        int i=0; int j=0;
        if(s.length()==0){return true;}
            while(j<t.length()) {
                if (s.charAt(i) == t.charAt(j)) {
                    i++;
                    if (i == s.length()) {
                        return true;
                    }
                }
                j++;
            }
                return false;
            }
 }




//        for(int i=0;i<t.length()-s.length();i++){
//        for(int j=0;j<s.length();j++){
//        if(s.charAt(j)!=t.charAt(j+i)){
//        break;
//        }
//        }
//result=true;}
