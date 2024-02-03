package JavaCorePractice.EasyRevision;

import java.util.Scanner;

public class PalindromUsingRec {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check:");
        String str = sc.nextLine();

        if (isPalindrome(str)) {
            System.out.println(str + " : is a palindrome");
        } else {
            System.out.println(str + " : is not a palindrome");
        }
    }

    public static boolean isPalindrome(String str) {
        int n = str.length();
        if (n == 0) //empty string
        {
            return true;
        } else {
            return PalindromeRec(str, 0, n - 1);
        }
    }

    public static boolean PalindromeRec(String str, int left, int right) {
        if (left >= right) {
            return true;
        }
        else if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        else {
            return PalindromeRec(str, left + 1, right - 1);
        }
    }
}
