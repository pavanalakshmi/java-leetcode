package arrays_strings;

import java.util.ArrayList;

public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        int temp=0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            if(!arrayList.contains(nums[i])){
                arrayList.add(nums[i]);
                nums[temp] = nums[i];
                temp++;
            }
        }
        return temp;

//        int temp=1;
//        for(int i=1;i<nums.length;i++) {
//            if(nums[i]!=nums[i-1]){
//                nums[temp] = nums[i];
//                temp++;
//            }
//        }
//        for (int i=temp;i<nums.length;i++){
//            nums[i] = 0;
//        }
//return temp;
    }

public static void main(String[] args) {
        RemoveDuplicatesfromSortedArray removeDuplicatesfromSortedArray = new RemoveDuplicatesfromSortedArray();
        System.out.println(removeDuplicatesfromSortedArray.removeDuplicates(new int[]{1,1,2,3,4,4}));
    }
}
