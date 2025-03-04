//https://leetcode.com/problems/add-to-array-form-of-integer/description/
//989. Add to Array-Form of Integer
//The array-form of an integer num is an array representing its digits in left to right order.
//For example, for num = 1321, the array form is [1,3,2,1].
//Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.


package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AddToArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of digits in array");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the numbers");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to add:");
        int add = sc.nextInt();
        List<Integer> result = addToArrayForm(arr, add);
        System.out.println("Result: " + result);
        sc.close();
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int p = num.length-1;
        int carry = 0;
        while(p>=0 || k>0){
            int numval = 0;
            if(p>=0){
                numval = num[p];
            }
            int d = k%10;
            int sum = numval + d + carry;
            int digit = sum%10;
            carry = sum/10;
            ans.add(digit);

            p--;
            k = k/10;
        }
        if(carry>0){
            ans.add(carry);
        }
        Collections.reverse(ans);
        return ans;
    }
}
