/**
 * @author @freecnsz
 * @Date 11.30.2023
 */


public class RomanToInteger {
    public static void main(String[] args) {
        
    }

    public static int romanToInteger(String s) {

        final int[] valueOfRoman = {1,5,10,50,100,500,1000};
        final char[] symbolOfRoman = {'I','V','X','L','C','D','M'};

        char[] romanSymbols = new char[s.length()];
        int integerNumber = 0;
        char temp = ' ';

        for(int i = 0; i < s.length(); i++) {

            if (i > 0)
                temp = s.charAt(i);

            for (int j = 0; j < 7; j++) {


                if (s.charAt(i) == symbolOfRoman[j])
                    integerNumber += valueOfRoman[j];
            }
        }

        return integerNumber;
    }


}
