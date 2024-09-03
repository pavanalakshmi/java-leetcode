package arrays_strings;

public class lengthOfLastWord {
    public static void main(String[] args) {
        lengthOfLastWord lengthOfLastWord = new lengthOfLastWord();
        System.out.println(lengthOfLastWord.lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord.lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord.lengthOfLastWord("luffy is still joyboy"));
    }
    public int lengthOfLastWord(String s) {
        return s.trim().substring(s.trim().lastIndexOf(" ")+1).length();
//        int count=0;
//        s=s.trim();
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)!=' '){
//                count++;
//            }
//            else{
//                count=0;
//            }
//        }
//        return count;
    }
}
