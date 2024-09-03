package arrays_strings;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        // Boyer Moore voting algorithm
        int count=0; int candidate=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                candidate = nums[i];
                count = 1;
            }
            else if(candidate == nums[i]){
                count++;
            }
            else{
                count--;
            }
            }
        return candidate;

//        int count=0; int majority=0; int max_val=0;
//        for(int i=0;i<nums.length;i++){
//            for(int j=0;j<nums.length;j++){
//                if(nums[i]==nums[j]){
//                    count = count+1;
//                }
//            }
//            if(count>majority){
//                majority=count;
//                max_val = nums[i];
//            }
//            count=0;
//        }
//        return max_val;
    }
    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();
        System.out.println(majorityElement.majorityElement(new int[]{1,1,2,2,1,2,2,3}));
    }
}
