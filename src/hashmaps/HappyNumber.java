package hashmaps;

import java.util.HashMap;
import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args) {
        HappyNumber happyNumber = new HappyNumber();
        System.out.println(happyNumber.isHappy(19));
        System.out.println(happyNumber.isHappy(2));
        System.out.println(happyNumber.isHappy(7));
        System.out.println(happyNumber.isHappy(1));
    }
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        if(n==1){return true;}
        while(n!=1 && !seen.contains(n)){
            seen.add(n);
            n = squares(n);
            }
        return n==1;
    }
    public int squares(int n){
        int out=0;
        while(n>0){
            int n1=n%10;
            out+=(n1*n1);
            n=n/10;
        }
        return out;
    }
}
