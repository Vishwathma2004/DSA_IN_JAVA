//https://leetcode.com/problems/longest-common-prefix/description/
//14. Longest Common Prefix
//Write a function to find the longest common prefix string amongst an array of strings.

//If there is no common prefix, return an empty string "".


package Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefix {
    public static String longestPrefix(String[] s){
        Arrays.sort(s);
        int idx = 0;
        String s1 = s[0];
        String s2 = s[s.length-1];
        if(s.length==0){
            return "";
        }
        if(s.length==1) return s[0];
        while(idx<s1.length() && idx<s2.length()){
            if(s1.charAt(idx)==s2.charAt(idx)){
                idx++;
            }
            else{
                break;
            }
        }
        return s1.substring(0, idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of words");
        int n = sc.nextInt();
        sc.nextLine();
        String[] s = new String[n];
        System.out.println("Enter the String: ");
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextLine();   
        }
        System.out.println("The longest SubString is");
        System.out.println(longestPrefix(s));
        sc.close();
    }   
}