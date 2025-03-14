//https://leetcode.com/problems/reverse-words-in-a-string/description/
//151. Reverse Words in a String
//Given an input string s, reverse the order of the words.

//A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

//Return a string of the words in reverse order concatenated by a single space.

//Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

package Leetcode;

import java.util.Scanner;

public class ReverseWordInAString {
    public static String reverseWord(String s){
        String[] arr = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]+" ");
        }
        String ans = sb.toString();
        ans = ans.trim();
        return ans;
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        System.out.println("The string after Reversing is: ");
        System.out.println(reverseWord(s));
        sc.close();
    }
}
