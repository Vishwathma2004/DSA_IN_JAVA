/*
Time Complexity: O(n)
Space Complexity: O(1)
 */
package PalindromeChecking;

import java.util.Scanner;

public class TwoPointer {
    static boolean isPalindrome(String s){
        int i=0,j=s.length()-1;
        s = s.toLowerCase();
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
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
