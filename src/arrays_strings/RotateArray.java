package arrays_strings;

import java.util.ArrayList;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        k = k % nums.length;
        for(int i=0;i<nums.length;i++){
            for(int j=nums.length-k;j<nums.length;j++){
                arrayList.add(nums[j]);
            }
            for(int l=0;l<nums.length-k;l++){
                arrayList.add(nums[l]);
            }
            break;
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = arrayList.get(i);
        }
    }
//    reverse(nums, nums.length-k,nums.length-1);
//    reverse(nums, 0,nums.length-k-1);
//    reverse(nums, 0,nums.length-1);
//
//        for(int x=0;x<nums.length;x++){
//        System.out.println(nums[x]);
//    }
//}
//
//private void reverse(int[] nums, int start, int end){
//    while(start<end){
//        int temp = nums[start];
//        nums[start] = nums[end];
//        nums[end] = temp;
//        start++;
//        end--;
//    }
//}

    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(new int[]{1,2,3,4,5,6,7},3);
//        rotateArray.rotate(new int[]{-1,-100,3,99},2);
    }
}
