package arrays_strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RandomizedSet {
    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();
        System.out.println(randomizedSet.insert(1));
        System.out.println(randomizedSet.remove(2));
        System.out.println(randomizedSet.insert(2));
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.remove(1));
        System.out.println(randomizedSet.insert(2));
        System.out.println(randomizedSet.getRandom());
    }
    private ArrayList<Integer> list;
    private Random random;

    public RandomizedSet() {
        list = new ArrayList<>();
        random = new Random();
    }

    public boolean insert(int val) {
        for(var num: list) {
            if (num == val) {
                return false;
            }
        }
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        // get the index of the val if present in list
        int index=-1;
        for(int i=0;i<list.size();i++) {
            if (list.get(i) == val) {
                index = i;
                break;
            }
        }
        if(index==-1){
            return false; //element not found
        }
        // since we got the index value, we need to remove the last element and replace it in the index found
        int lastElement = list.get(list.size()-1);
        list.set(index, lastElement); // replace index value to be removed with the last element of list
        // remove last element
        list.remove(list.size()-1);
        return true; //removed
    }

public int getRandom() {
        int randomIndex = random.nextInt(list.size());
        return list.get(randomIndex);
}
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */


//    int rd = new Random().nextInt(citations.length);
//        System.out.println(citations[rd]);

