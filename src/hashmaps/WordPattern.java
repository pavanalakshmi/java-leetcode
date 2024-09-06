package hashmaps;

import java.util.HashMap;

public class WordPattern {
    public static void main(String[] args) {
        WordPattern wordPattern = new WordPattern();
        System.out.println(wordPattern.wordPattern("abba", "dog cat cat dog"));
        System.out.println(wordPattern.wordPattern("abba", "dog cat cat fish"));
        System.out.println(wordPattern.wordPattern("aaaa", "dog cat cat dog"));
        System.out.println(wordPattern.wordPattern("abba", "dog dog dog dog"));
    }

    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String > mapPS = new HashMap<>();
        HashMap<String,Character> mapSP = new HashMap<>();
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            if (!mapPS.containsKey(pattern.charAt(i))) {
                mapPS.put(pattern.charAt(i), words[i]);
            } else {
                if (!mapPS.get(pattern.charAt(i)).equals(words[i])) {
                    return false;
                }
            }
            if(!mapSP.containsKey(words[i])){
                mapSP.put(words[i], pattern.charAt(i));
            }
            else{
                if(!mapSP.get(words[i]).equals(pattern.charAt(i))){
                    return false;
                }
            }
        }
        return true;
    }
}
