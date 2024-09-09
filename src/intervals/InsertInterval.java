package intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {
    public static void main(String[] args) {
        InsertInterval insertInterval = new InsertInterval();
//        int[][] input = {{1, 3}, {6, 9}}; new int[]{2,5}
        int[][] input = {{1, 2}, {3, 5}, {6,7}, {8,10}, {12,16}};
        System.out.println(Arrays.deepToString(insert(input, new int[]{4,8})));
    }
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] new_intervals = new int[intervals.length+1][];
        new_intervals[new_intervals.length-1] = newInterval;
        for(int i=0;i<intervals.length;i++){
            new_intervals[i]=intervals[i];
        }
        Arrays.sort(new_intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> output = new ArrayList<>();
        for (int i = 0; i < new_intervals.length; i++) {
            if (output.isEmpty() || (output.get(output.size() - 1))[1] < new_intervals[i][0]) {
                output.add(new_intervals[i]);
            } else {
                int[] end = output.get(output.size() - 1);
                end[1] = Math.max(end[1], new_intervals[i][1]);
            }
        }
        return output.toArray(new int[0][]);
    }
}
