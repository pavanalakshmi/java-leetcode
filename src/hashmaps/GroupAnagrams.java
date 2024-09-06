package hashmaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        System.out.println(groupAnagrams.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
        System.out.println(groupAnagrams.groupAnagrams(new String[]{""}));
        System.out.println(groupAnagrams.groupAnagrams(new String[]{"a"}));

    }
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<String> output = new ArrayList<>();
        HashMap<String,List<String>> sortedStringMappping = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            char[] sortedArray = strs[i].toCharArray();
            Arrays.sort(sortedArray);
            String sorted = new String(sortedArray);

            List<String> temp = sortedStringMappping.getOrDefault(sorted, new ArrayList<>());
            temp.add(strs[i]);

            sortedStringMappping.put(sorted, temp);
        }
        ArrayList<List<String>> outputList= new ArrayList<>(sortedStringMappping.values());
        return outputList;
    }
}
