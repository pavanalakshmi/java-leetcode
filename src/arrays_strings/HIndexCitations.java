package arrays_strings;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class HIndexCitations {
    public static void main(String[] args) {
        HIndexCitations hIndexCitations = new HIndexCitations();
        System.out.println(hIndexCitations.hIndex(new int[]{3,0,6,1,5}));
        System.out.println(hIndexCitations.hIndex(new int[]{1,3,1}));

    }
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int citations_index =0;
        for(int i=citations.length-1;i>=0;i--){
            if(citations[i]>=citations_index+1)
            {
                citations_index++;
            }
        }
        return citations_index;
    }
}
