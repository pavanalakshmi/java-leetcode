package arrays_strings;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray2 {
    public int removeDuplicates(int[] nums) {
        int temp=2;
        for(int i=2;i<nums.length;i++) {
            if(nums[i]!=nums[temp-2]){
                nums[temp] = nums[i];
                temp++;
            }
        }
        for (int i=temp;i<nums.length;i++){
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
        return temp;
    }

    public static void main(String[] args) {
        RemoveDuplicatesfromSortedArray2 removeDuplicatesfromSortedArray2 = new RemoveDuplicatesfromSortedArray2();
        System.out.println(removeDuplicatesfromSortedArray2.removeDuplicates(new int[]{1,1,1,2,2,3}));
    }
}
