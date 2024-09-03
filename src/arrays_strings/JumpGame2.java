package arrays_strings;

public class JumpGame2 {
    public static void main(String[] args) {
        JumpGame2 jumpGame = new JumpGame2();
        System.out.println(jumpGame.jump(new int[]{2,3,0,1,4}));
        System.out.println(jumpGame.jump(new int[]{1,2,1,1,1}));
    }
    public int jump(int[] nums) {
        int maximumReach = 0; int count=0; int currentJump=0;
        if(nums.length>1){
            for(int i=0;i<nums.length;i++){
//                if (i > maximumReach) {  // If current index is greater than maximumReach, return false
//                    count=0;
//                    break;
//                }
                maximumReach = Math.max(maximumReach,i + nums[i]); //which is higher
                if (i==currentJump){
                    count++;
                    currentJump=maximumReach;
                if (maximumReach >= nums.length - 1) {
                    break;
                }
                }
            }
        }
        return count;
    }

}
