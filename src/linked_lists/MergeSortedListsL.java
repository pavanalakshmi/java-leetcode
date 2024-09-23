package linked_lists;

import java.util.LinkedList;
import java.util.List;

public class MergeSortedListsL {
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(4);

        List<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(3);
        list2.add(4);

        System.out.println(mergeTwoLists(list1, list2));
    }

    private static List<Integer> mergeTwoLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new LinkedList<>();
        int i=0, j=0;
        while(i<list1.size() && j<list2.size()){
            if(list1.get(i) < list2.get(j)){
                result.add(list1.get(i));
                i++;
            }
            else{
                result.add(list2.get(j));
                j++;
            }
        }
        while(i<list1.size()){
            result.add(list1.get(i));
            i++;
        }
        while(j<list2.size()){
            result.add(list2.get(j));
            j++;
        }
        return result;
    }
}
