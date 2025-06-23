import java.lang.*;
import java.util.*;
public class ReverseString {
    static String reversal(String s){
        StringBuilder result = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            result.append(s.charAt(i));
        }
        return result.toString();
    }
    //using two pointer 
    //Time Complexity - O(N) 
    //Space Complexity - O(1) 
    static String twoPointer(String s){
        int left = 0,right = s.length()-1;
        StringBuilder res = new StringBuilder(s);
        while(left<right){
            char temp = s.charAt(left);
            res.setCharAt(left,res.charAt(right));
            res.setCharAt(right,temp);
            left++;
            right--;
        }
    }

    //using recursion
    //Time Complexity - O(N) 
    //Space Complexity - O(N) 
    static void recursionReverse(char[] s,int left,int right){
        if(left>=right){
            return;
        }
        char temp = s[l];
        s[l] = s[r];
        s[r] = temp;
        recusrionReverse(s,l+1,r-1);

    }
    static String reverseRecursion(String s){
        char[] arr = s.toCharArray();
        recursionReverse(arr,0,arr.length-1);
        return new String(arr);
    }

    //Using Stack
    //Time Complexity : O(N)
    //space Complexity : O(N)
    static String stackReverse(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length;i++){
            st.push(s.charAt(i));
        }
        StringBuilder res = new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            res.append(st.pop());
        }
        return res.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        System.out.println("The reversed string is:");
        System.out.println(reversal(s));
        sc.close();
    }
}
