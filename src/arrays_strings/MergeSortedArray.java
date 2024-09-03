package arrays_strings;

import java.util.Arrays;

public class MergeSortedArray {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int i = m-1; int j=n-1; int k=m+n-1;
                while(i>=0 && j>=0){
                    if(nums1[i] > nums2[j]){
                        nums1[k--] = nums1[i--];
//                        i--;
                    }
                    else { //if(nums2[j]>nums1[i])
                        nums1[k--] = nums2[j--];
//                        j--;
                    }
//                    k--;
                }
                while(j>=0){
                    nums1[k--] = nums2[j--];
//                    j--;k--;
                }
                System.out.println(Arrays.toString(nums1));
            }

    public static void main(String[] args) {
            MergeSortedArray mergeSortedArray = new MergeSortedArray();
//            mergeSortedArray.merge(new int[]{1, 2, 3, 0, 0, 0},3, new int[]{2, 5, 6},3);
            mergeSortedArray.merge(new int[]{-1,0,0,3,3,3,0,0,0},6, new int[]{1, 2, 2},3);

//        {-1,0,0,3,3,3,0,0,0} {1,2,2}. _> [-1,0,0,1,2,2,3,3,3]
    }
    }
