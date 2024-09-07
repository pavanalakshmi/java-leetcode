package hashmaps;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum TwoSum = new TwoSum();
        System.out.println(Arrays.toString(TwoSum.TwoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(TwoSum.TwoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(TwoSum.TwoSum(new int[]{3, 3}, 6)));
    }

    public int[] TwoSum(int[] nums, int target) {
//        Arrays.sort(numbers); // shouldnt sort as it changes originial indices
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            int diff = target- nums[i];
            if(hashMap.containsKey(diff)){
                return new int[]{hashMap.get(diff), i};
            }
            hashMap.put(nums[i], i);
        }
       return new int[0];
    }
}
