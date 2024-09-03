package arrays_strings;

public class romanToInteger {

    public static void main(String[] args) {
        romanToInteger romanToInteger = new romanToInteger();
        System.out.println(romanToInteger.romanToInt("III"));
        System.out.println(romanToInteger.romanToInt("LVIII"));
        System.out.println(romanToInteger.romanToInt("MCMXCIV"));
    }

    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
                if ((i+1<s.length()) && toInt(s.charAt(i)) < toInt(s.charAt(i + 1))) {
                    result -= toInt(s.charAt(i));
                }
//            else if(i==s.length()-1) {result += toInt(s.charAt(i));}
            else {
                result += toInt(s.charAt(i));
            }
    }
        return result;
}
    public int toInt(char roman){
        switch(roman){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
}
