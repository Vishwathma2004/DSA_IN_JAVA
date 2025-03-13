//https://leetcode.com/problems/length-of-last-word/description/
//58. Length of Last Word
//Given a string s consisting of words and spaces, return the length of the last word in the string.

//A word is a maximal substring consisting of non-space characters only.

package Leetcode;

import java.util.Scanner;

public class LengthOfLastWord {
    public static int lastWordLength(String s){
        int count = 0;
        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            if(ch!=' '){
                count++;
            }
            else if(count!=0){
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        System.out.println("Length of last word is: ");
        System.out.println(lastWordLength(s));
        sc.close();
    }
}
