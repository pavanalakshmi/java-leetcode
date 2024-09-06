package hashmaps;

import java.util.HashMap;

public class IsIsomorphic {
    public static void main(String[] args) {
        IsIsomorphic isIsomorphic = new IsIsomorphic();
        System.out.println(isIsomorphic.isIsomorphic("egg", "add")); //substring, super
        System.out.println(isIsomorphic.isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic.isIsomorphic("paper", "title"));
        System.out.println(isIsomorphic.isIsomorphic("library", "privacy"));
        System.out.println(isIsomorphic.isIsomorphic("badc", "baba"));

    }
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> mapST = new HashMap<>();
        HashMap<Character,Character> mapTS = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(!mapST.containsKey(s.charAt(i))){
                mapST.put(s.charAt(i), t.charAt(i));
            }
            else{
                if(!mapST.get(s.charAt(i)).equals(t.charAt(i))){
                    return false;
                }
            }

            if(!mapTS.containsKey(t.charAt(i))){
                mapTS.put(t.charAt(i), s.charAt(i));
            }
            else{
                if(!mapTS.get(t.charAt(i)).equals(s.charAt(i))){
                    return false;
                }
            }
        }
        return true;
    }
}