package hashmaps;

import java.util.HashMap;
import java.util.List;

public class IsAnagram {
    public static void main(String[] args) {
        IsAnagram isAnagram = new IsAnagram();
        System.out.println(isAnagram.isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram.isAnagram("rat", "car"));
        System.out.println(isAnagram.isAnagram("listen", "silent"));
    }
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();

        for(char c: s.toCharArray()){
            countS.put(c, countS.getOrDefault(c,0)+1);
        }
        for(char c: t.toCharArray()){
            countT.put(c, countT.getOrDefault(c,0)+1);
        }
        if(countS.equals(countT)){
            return true;
        }
        else{
            return false;
        }
    }
}
