package hashmaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        System.out.println(longestConsecutiveSequence.longestConsecutive(new int[]{100,4,200,1,3,2}));
        System.out.println(longestConsecutiveSequence.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));
        System.out.println(longestConsecutiveSequence.longestConsecutive(new int[]{4,0,-4,-2,2,5,2,0,-8,-8,-8,-8,-1,7,4,5,5,-4,6,6,-3}));
    }
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length==0){
            return 0;
        }
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i: nums){
            hashSet.add(i);
        }
        Integer[] array = hashSet.toArray(new Integer[0]);
        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));

        int longestCount =0, count =1;
        for(int i=0;i<array.length-1;i++){
            if(array[i+1]-array[i]==1){
                count +=1;
            }
            else{
                longestCount = Math.max(longestCount, count);
                count =1;
            }
        }
        return Math.max(longestCount, count);
    }
}
