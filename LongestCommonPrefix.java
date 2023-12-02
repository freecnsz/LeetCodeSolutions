/**
 * LeetCode Number: 14
 * 
 * @author @freecnsz
 * @Date 02.12.2023
 * 
 */

public class LongestCommonPrefix {
    public static void main(String[] args) {

        String[] str = { "flower", "flow", "flight" }; // this should print "fl".

        System.out.println(longestCommonPrefix(str));

    }

    public static String longestCommonPrefix(String[] strings) {

        String commonPrefix = "";
        int lengthOfShortestString = Integer.MAX_VALUE;

        // this loop finds the length of the shortest string in the given array.
        for (int i = 0; i < strings.length; i++) {
            lengthOfShortestString = Math.min(lengthOfShortestString, strings[i].length());
        }

        for (int i = 0; i < lengthOfShortestString; i++) { // run based on shortest string
            for (int j = 1; j < strings.length; j++) { // for checking if they have common prefix or not
                if (strings[0].charAt(i) != strings[j].charAt(i)) { // if the statement is true then there is a not
                    return commonPrefix;                            // common char and common prefix found
                }
            }
            commonPrefix += strings[0].charAt(i); // if not returned inside the loop then current char is in the comman
                                                  // prefix
        }
        return commonPrefix; // return common prefix
    }
}
