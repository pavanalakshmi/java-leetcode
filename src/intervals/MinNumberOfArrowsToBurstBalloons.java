package intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinNumberOfArrowsToBurstBalloons {
    public static void main(String[] args) {
        MinNumberOfArrowsToBurstBalloons minNumberOfArrowsToBurstBalloons = new MinNumberOfArrowsToBurstBalloons();
        int[][] input = {{10, 16}, {2, 8}, {1, 6}, {7, 12}}; //[[0,5]]
        System.out.println(findMinArrowShots(input));
        }
    public static int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int arrows = 1, current = points[0][1];
//        System.out.println(Arrays.deepToString(points));
        for (int i = 1; i < points.length; i++) {
            if(points[i][0]>current){
                arrows++;
                current=points[i][1];
            }
        }
        return arrows;
    }
}