package arrays_strings;

import java.util.Arrays;

public class productArrayExceptSelf {
    public static void main(String[] args) {
        productArrayExceptSelf productArrayExceptSelf = new productArrayExceptSelf();
        System.out.println(Arrays.toString(productArrayExceptSelf.productExceptSelf(new int[]{1,2,3,4})));
        System.out.println(Arrays.toString(productArrayExceptSelf.productExceptSelf(new int[]{-1,1,0,-3,3})));
    }
    public int[] productExceptSelf(int[] nums) {
        //calculate left product and right product of the given array except self
        int[] answer = new int[nums.length];
        answer[0]=1;
        for(int i=1;i<nums.length;i++){
            answer[i] = nums[i-1]*answer[i-1];
        }
        int rightProduct = 1;
        for(int j=nums.length-1;j>=0;j--){
            answer[j]=answer[j] * rightProduct;
            rightProduct = rightProduct * nums[j];
        }
        return answer;
    }
//    public int[] productExceptSelf(int[] nums) {
//        int[] answer = new int[nums.length]; int i=0;
//        while(i<nums.length){
////        for(int i=0;i<nums.length;i++){
//            int temp=1;
//            for(int j=0;j<nums.length;j++){
//                if(i!=j){
//                    temp=temp*nums[j];
//                }
//            }
//            answer[i]=temp;
//            i++;
//        }
//        return answer;
//    }
}
