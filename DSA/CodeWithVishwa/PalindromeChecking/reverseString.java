package PalindromeChecking;
import java.util.*;
public class reverseString {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder rev = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            rev.append(s.charAt(i));
        }
        return s.equals(rev.toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        if (isPalindrome(s)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
    }
}
