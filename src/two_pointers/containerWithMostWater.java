package two_pointers;

public class containerWithMostWater {
    public static void main(String[] args) {
        containerWithMostWater containerWithMostWater = new containerWithMostWater();
        System.out.println(containerWithMostWater.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
    /**
    public int maximum(int x, int y){
        if(x>y){
            return x;
        }
        else{
            return y;
        }
    }
    public int minimum(int x, int y){
        if(x<y){
            return x;
        }
        else{
            return y;
        }
    } **/
    public int maxArea(int[] height) {
        int water=0; int left=0; int right = height.length-1;
        while (left!=right){
//            water = maximum(water, ((right-left)*(minimum(height[left], height[right])))); //Math.min()
            water = Math.max(water, ((right-left)*(Math.min(height[left], height[right]))));
            if(height[right]>height[left]){
                left++;
            }
            else{
                right--;
            }
        }
        return water;
    }
}
