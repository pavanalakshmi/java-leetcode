package arrays_strings;

public class indexofFirstOccurence {
    public static void main(String[] args) {
        indexofFirstOccurence indexofFirstOccurence = new indexofFirstOccurence();
        System.out.println(indexofFirstOccurence.strStr("sadbutsad","sad"));
        System.out.println(indexofFirstOccurence.strStr("a","a"));
    }
    public int strStr(String haystack, String needle) {
        for(int temp=0;temp<=haystack.length()-needle.length();temp++){
            int i;
            for(i=0;i<needle.length();i++){
                if(haystack.charAt(i+temp)!=needle.charAt(i)){
                    break;
                }
            }
            if(i==needle.length()){
                return temp;
            }
        }
        return -1;
    }
}
