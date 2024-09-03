package two_pointers;
import java.util.*;
public class threeSum {
    public static void main(String[] args) {
        threeSum threeSum = new threeSum();
        System.out.println(threeSum.threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int left = i+1; //since 1st element is kept aside, we need to check from 2nd value.
            int right=nums.length-1;
            while(left<right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum==0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                }
                else  if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }

        return new ArrayList<>(result);
    }
}
