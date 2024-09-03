package two_pointers;

import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
        twoSum twoSum = new twoSum();
        System.out.println(Arrays.toString(twoSum.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum.twoSum(new int[]{2, 3, 4}, 6)));
        System.out.println(Arrays.toString(twoSum.twoSum(new int[]{-1, 0}, -1)));
        System.out.println(Arrays.toString(twoSum.twoSum(new int[]{-10, -8, -2, 1, 2, 5, 6}, 0)));
    }

    public int[] twoSum(int[] numbers, int target) {
        int[] output_index = new int[2];
        int left = 0;
        int right = numbers.length-1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                output_index[0] = left + 1;
                output_index[1] = right + 1;
                return output_index;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return output_index;
    }
}


/** This concept returns Time Limit Exceeded error for some testcases, due to time complexity of O(n^2).
        int[] output_index = new int[2];
        int temp= 0;
        for(int i=1;i<numbers.length;i++){
            if(numbers[temp]+numbers[i]==target){
                output_index[0]=temp+1;
                output_index[1]=i+1;
                break;
            }
            if(i==numbers.length-1){
                temp++;
                i=temp;
            }
        }
        return output_index;
    }

}
**/