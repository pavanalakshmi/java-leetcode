
package arrays_strings;

import java.util.ArrayList;
import java.util.Arrays;

public class integerToRoman {
    public static void main(String[] args) {
        integerToRoman integerToRoman = new integerToRoman();
        System.out.println(integerToRoman.intToRoman(3749));
        System.out.println(integerToRoman.intToRoman(58));
        System.out.println(integerToRoman.intToRoman(1994));
    }
    public String intToRoman(int num) {
        ArrayList<String> arrayList = new ArrayList<>();
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for(int i=0;i<values.length;i++){
            while(num>=values[i]){
                arrayList.add(numerals[i]);
                num-=values[i];
            }
        }
        String result = String.join("", arrayList);
        return result;
    }

//    public String toRoman(int roman){
//        switch(roman){
//            case 1: return "I";
//            case 4: return "IV";
//            case 5: return "V";
//            case 9: return "IX";
//            case 10: return "X";
//            case 40: return "XL";
//            case 50: return "L";
//            case 90: return "XC";
//            case 100: return "C";
//            case 500: return "D";
//            case 1000: return "M";
//        }
//        return "error";
//    }

}