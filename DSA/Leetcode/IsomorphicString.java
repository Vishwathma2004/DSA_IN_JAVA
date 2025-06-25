/*
https://leetcode.com/problems/isomorphic-strings/description
205. Isomorphic Strings
Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

Example 1:
Input: s = "egg", t = "add"
Output: true

Explanation:
The strings s and t can be made identical by:
Mapping 'e' to 'a'.
Mapping 'g' to 'd'.

Example 2:
Input: s = "foo", t = "bar"
Output: false
Explanation:
The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.

Example 3:
Input: s = "paper", t = "title"
Output: true
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IsomorphicString {
    public static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Character> characterMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char original = s.charAt(i);
            char replacement = t.charAt(i);
            if(!characterMap.containsKey(original)){
                if(!characterMap.containsValue(replacement)){
                    characterMap.put(original,replacement);
                }
                else{
                    return false;
                }
            }
            else{
                int mappedCharacter = characterMap.get(original);
                if(mappedCharacter!=replacement){
                    return false;
                }
            }
        }
        return true;   
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String s = sc.nextLine();
        System.out.println("Enter the second string:");
        String t = sc.nextLine();
        if(isIsomorphic(s,t)){
            System.out.println("The strings are isomorphic.");
        }
        else{
            System.out.println("The strings are not isomorphic.");
        }
        sc.close();
    }
}
