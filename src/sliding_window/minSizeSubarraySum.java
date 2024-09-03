package sliding_window;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class minSizeSubarraySum {
    public static void main(String[] args) {
        minSizeSubarraySum minSizeSubarraySum = new minSizeSubarraySum();
        System.out.println(minSizeSubarraySum.minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
    }
    public int minSubArrayLen(int target, int[] nums) {
        int currentSum=0; int minWindow =Integer.MAX_VALUE; int high =0; int low=0;
        while(high<nums.length){
            if(nums[high]>=target){
                return 1;
            }
            else{
            currentSum+=nums[high];
            high++;
            while(currentSum>=target){
                int currentWindowSize = high - low;
                minWindow = Math.min(currentWindowSize, minWindow);

                currentSum-=nums[low];
                low++;
            }
            }
        }
        return minWindow == Integer.MAX_VALUE ? 0 : minWindow;
    }


//        ArrayList<Integer> arrayList = new ArrayList<>();
//        int left = 0;
//        int right = nums.length-1;
//        while (left < right) {
//            int sum = nums[left] + nums[right];
//            if (sum >= target) {
//                arrayList.add()
//                output_index[0] = left + 1;
//                output_index[1] = right + 1;
//                return output_index.length;
//            } else if (sum < target) {
//                left++;
//            }
//            }





//        ArrayList<List<Integer>> a = new ArrayList<>();
//        a.add(Arrays.asList(-1, -1, 2));
//        a.add(Arrays.asList(-1, 0, 2));
//        ArrayList<Integer> out = new ArrayList<>(a.get(0));
//
//        for (int i = 0; i < a.size(); i++) {
//            if (sum(a.get(i)) > sum(out)) {
//                out.clear();
//                out.add(i);
//            }
//        }
//    }
//        public int sum(List<Integer> x){
//            int sum=0;
//            for(int i:x){
//                sum+=i;
//            }
//            return sum;
        }

