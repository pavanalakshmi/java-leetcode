package arrays_strings;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int temp=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[temp] = nums[i];
                temp++;
            }
        }
    return temp;

        //     ArrayList<Integer> arrayList = new ArrayList<>();
        //     int out=0;
        //     for(int i=0;i<nums.length;i++){
        //         if(nums[i]!= val){
        //             arrayList.add(nums[i]);
        //             out++;
        //         }
        //     }
        // return out;

    }

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        System.out.println(removeElement.removeElement(new int[]{1,2,3,4,3}, 3));
    }
}


