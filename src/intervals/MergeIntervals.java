package intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        MergeIntervals mergeIntervals = new MergeIntervals();
//        int[][] input = {{1,3},{2,6},{8,10},{15,18}};
//        int[][] input = {{1,4},{4,5}}; //[[1,5]]
//        int[][] input = {{1,4},{0,4}}; //[[0,4]]
        int[][] input = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
//        int[][] input = {{1, 4}, {0, 2}, {3, 5}}; //[[0,5]]
        System.out.println(Arrays.deepToString(merge(input)));
    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> output = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
//            System.out.println(Arrays.toString(intervals[i]));
            // i[1]>i+1[0]
            if (output.isEmpty() || (output.get(output.size() - 1))[1] < intervals[i][0]) {
                output.add(intervals[i]);
            } else {
                int[] end = output.get(output.size() - 1);
                end[1] = Math.max(end[1], intervals[i][1]);
            }
        }
        return output.toArray(new int[0][]);
    }
}


// sorting--
//        for(int i=0;i<intervals.length-1;i++){
//            if(intervals[i][0]>intervals[i+1][0]){
//                int temp=intervals[i][0];
//                intervals[i][0]=intervals[i+1][0];
//                intervals[i+1][0]=temp;
//            }
//        }

//         boolean isLast = false;
//if(intervals[i][1]>=intervals[i+1][0]){
//        int start = intervals[i][0];
//        int end = Math.max(intervals[i][1], intervals[i+1][1]);
//        output.add(new int[]{start,end});
//        i++;
//    }
//            else{
//        output.add(intervals[i]);
//    }
//            if(i==intervals.length-1){
//        isLast=true;
//    }
//}
//        if(!isLast){
//        output.add(intervals[intervals.length-1]);
//        }