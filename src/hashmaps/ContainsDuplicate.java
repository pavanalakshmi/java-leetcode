package hashmaps;

import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        System.out.println(containsDuplicate.containsNearbyDuplicate(new int[]{1,2,3,1}, 3));
        System.out.println(containsDuplicate.containsNearbyDuplicate(new int[]{1,0,1,1}, 1));
        System.out.println(containsDuplicate.containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2));
    }
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hashMap.containsKey(nums[i])){
                if(Math.abs(hashMap.get(nums[i])-i)<=k){
                    return true;
                }
            }
            hashMap.put(nums[i], i);
        }
        return false;
    }
}
