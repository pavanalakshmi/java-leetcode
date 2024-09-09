package intervals;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        SummaryRanges summaryRanges = new SummaryRanges();
        System.out.println(summaryRanges.summaryRanges(new int[]{0,1,2,4,5,7}));
        System.out.println(summaryRanges.summaryRanges(new int[]{0,2,3,4,6,8,9}));
    }
    public List<String> summaryRanges(int[] nums) {
        List<String> out = new ArrayList<>();
        int start =0; String temp="";
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1 || (nums[i+1]-nums[i]!=1)){
                if(start==i){
                    temp=String.valueOf(nums[start]);
                }
                else{
                    temp = nums[start]+"->"+nums[i];
                }
                out.add(temp);
                start=i+1;
            }
//            else if((nums[i+1]-nums[i]==1)) {//nothing;}
        }
        return out;
    }
}
