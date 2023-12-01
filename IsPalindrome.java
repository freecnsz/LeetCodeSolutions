/**
 * LeetCode Number: 9
 * 
 * @author @freecnsz
 * @Date 11.30.2023
 */

public class IsPalindrome {

    public static void main(String[] args) {

        // some input to check that isPalindrom method weather run correctly or not
        System.out.println(isPalindrome(1231));

        System.out.println(isPalindrome(-121)); // it is not palindrome: "-121" -> "121-"

        System.out.println(isPalindrome(1221));

    }

    public static boolean isPalindrome(int x) {

        // base cases to make method faster
        if (x < 0) // if there is a minus sign on the number than it cannot be palindrome
            return false;
        if (x < 10) // if the number contains one digit than it is palindrome
            return true;

        String number = String.valueOf(x); // convert integer value to string to check individual digits
        int length = number.length();

        // loop will check every couple digit from begin and end, and if they are not
        // equal then it will return false.
        for (int i = 0, j = length - 1; i < j; i++, j--) {
            if (number.charAt(i) != number.charAt(j))
                return false;
        }

        return true; // if loop does not return then the number is palindrome
    }
}