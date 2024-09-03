package arrays_strings;

public class reverseStringWords {
    public static void main(String[] args) {
        reverseStringWords reverseStringWords = new reverseStringWords();
        System.out.println(reverseStringWords.reverseWords(new String("the sky is blue")));
        System.out.println(reverseStringWords.reverseWords(new String("  hello world  ")));


    }
    public String reverseWords(String s) {
        String result = ""; int temp=s.length();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' ') {
                if(i!=temp-1){
                    result = result + s.substring(i + 1, temp) + ' ';
                }
                temp=i;
            }
        }
        if(temp>0){
            result = result + s.substring(0, temp);
        }
        return result.trim();
    }
}
