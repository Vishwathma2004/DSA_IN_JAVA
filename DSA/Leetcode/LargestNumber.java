//https://leetcode.com/problems/largest-number/description/
//179. Largest Number

//Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.

//Since the result may be very large, so you need to return a string instead of an integer.

package Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumber {
    public static String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[i]+"";
        }
        Arrays.sort(arr,(s1,s2)->(s1+s2).compareTo(s2+s1));
        StringBuilder sb = new StringBuilder();
        for(int i = arr.length-1;i>=0;i--){
            sb.append(arr[i]);
        }
        if(sb.charAt(0)=='0'){
            return "0";
        }
        else{
            return sb.toString();
        }
        

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the Array");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(largestNumber(arr));
        sc.close();
    }
}
