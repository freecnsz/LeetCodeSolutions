import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode Number: 13
 * 
 * @author @freecnsz
 * @Date 01.12.2023
 */

public class RomanToInteger {
    public static void main(String[] args) {

        System.out.println(romanToInteger("MMMCMXCIX")); // the biggest Romen numeral -> 3999

    }

    public static int romanToInteger(String s) {

        // keep the value of each Romen symbol
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        // keep the subtraction pairs and their values
        Map<String, Integer> map2 = new HashMap<>();

        map2.put("IV", 4);
        map2.put("IX", 9);
        map2.put("XL", 40);
        map2.put("XC", 90);
        map2.put("CD", 400);
        map2.put("CM", 900);

        int integerNumber = 0; // like a sum variable, at the and it will turn the integer of Romen numeral

        for (int i = 0; i < s.length(); i++) {

            integerNumber += map.get(s.charAt(i)); // add value of each symbol to our variable

            // for subtraction pairs
            if (i < s.length() - 1) {
                if (map2.containsKey(s.substring(i, i + 2))) {
                    integerNumber -= map.get(s.charAt(i));       // following two line will subtract the value that added
                    integerNumber -= map.get(s.charAt(i + 1));   // before for reaching the correct value
                    
                    integerNumber += map2.get(s.substring(i, i + 2));
                }

            }
        }
        //return the value
        return integerNumber;
    }

}
