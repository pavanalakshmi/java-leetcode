package arrays_strings;
public class JumpGame {
    public static void main(String[] args) {
        JumpGame jumpGame = new JumpGame();
        System.out.println(jumpGame.canJump(new int[]{2,3,1,1,4}));
        System.out.println(jumpGame.canJump(new int[]{3,2,1,0,4}));
        System.out.println(jumpGame.canJump(new int[]{0}));
        System.out.println(jumpGame.canJump(new int[]{}));
        System.out.println(jumpGame.canJump(new int[]{1,2,3}));
        System.out.println(jumpGame.canJump(new int[]{3,0,8,2,0,0,1}));
    }
    public boolean canJump(int[] nums) {
        int maximumReach = 0; boolean output=false;
        for(int i=0;i<nums.length;i++){
            if (i > maximumReach) {  // If current index is greater than maximumReach, return false
                output = false;
                break;
            }
            maximumReach = Math.max(maximumReach,i + nums[i]); //which is higher
            if (maximumReach >= nums.length - 1) {
                output = true;
                break;
            }
        }
        return output;
    }




//    public boolean canJump(int[] nums) {
//        int maximumReach = 0; boolean output=false;
////        if(nums.length==1) { // since we are at last index, it should return true
////            output=true;
////        }
//////        else if(nums.length==0) { // since we are at last index, it should return true
//////            output=false;
//////        }
//////        else if (nums.length>1)
////        else{
//                for(int i=0;i<nums.length;i++){
//                    if (i > maximumReach) {  // If current index is greater than maximumReach, return false
//                        output = false;
//                        break;
//                    }
////                    else {
////                    maximumReach = i + nums[i]; //not working for all test cases
//                    maximumReach = Math.max(maximumReach,i + nums[i]); //which is higher
//                        if (maximumReach >= nums.length - 1) {
//                            output = true;
//                            break;
//                        }
////                        else {
////                            output = false;
////                        }
////                    }
//                }
////            }
//        return output;
//        }

    }


