//https://leetcode.com/problems/regular-expression-matching/description/
/*
10. Regular Expression Matching

Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:

'.' Matches any single character.​​​​
'*' Matches zero or more of the preceding element.
The matching should cover the entire input string (not partial).

Example 1:

Input: s = "aa", p = "a"
Output: false
Explanation: "a" does not match the entire string "aa".
 */



import java.util.Scanner;

public class RegularExpression {
    public boolean isMatch(String s,String p){
        Boolean[][] memo = new Boolean[s.length()+1][p.length()+1];
        return isMatch(s, p,0,0,memo);
    }
    public boolean isMatch(String s,String p,int sIndex,int pIndex,Boolean[][] memo){
        if(sIndex==s.length() && pIndex==p.length()){
            return true;
        }
        if(pIndex==p.length()){
            return false;
        }
        if(memo[sIndex][pIndex]!=null){
            return memo[sIndex][pIndex];
        }
        boolean characterMatch = sIndex<s.length() &&  (s.charAt(sIndex)==p.charAt(pIndex)||p.charAt(pIndex)=='.'); 
        boolean nextIsStar = pIndex+1<p.length() && p.charAt(pIndex+1)=='*';
        boolean isMatch = false;
        if(characterMatch){
            if(nextIsStar){
                isMatch = isMatch(s, p, sIndex, pIndex+2, memo) || isMatch(s, p, sIndex+1, pIndex, memo);
            }
            else{
                isMatch = isMatch(s, p, sIndex+1, pIndex+1, memo);
            }
        }
        else{
            if(nextIsStar){
                isMatch = isMatch(s, p, sIndex, pIndex+2, memo);
            }
            else{
                return false;
            }
        }
        memo[sIndex][pIndex] = isMatch;
        return isMatch;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input for the string s
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        
        // Input for the pattern p
        System.out.println("Enter the pattern:");
        String p = sc.nextLine();
        
        // Create an instance of RegularExpression
        RegularExpression regex = new RegularExpression();
        
        // Call isMatch and print the result
        boolean result = regex.isMatch(s, p);
        System.out.println("Is the string \"" + s + "\" matching the pattern \"" + p + "\"? " + result);
        
        sc.close(); // Close the scanner
    }
}
