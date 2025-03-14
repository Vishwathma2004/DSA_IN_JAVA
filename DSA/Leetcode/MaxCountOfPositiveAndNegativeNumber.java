//https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/description/
//2529. Maximum Count of Positive Integer and Negative Integer

//Given an array nums sorted in non-decreasing order, return the maximum between the number of positive integers and the number of negative integers.

//In other words, if the number of positive integers in nums is pos and the number of negative integers is neg, then return the maximum of pos and neg.
//Note that 0 is neither positive nor negative.

package Leetcode;

import java.util.Scanner;

public class MaxCountOfPositiveAndNegativeNumber {
    public static int maxCount(int[] arr){
        int negCount=0,posCount = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                posCount++;
            }
            else if(arr[i]<0){
                negCount++;
            }
        }
        int res = Math.max(negCount, posCount);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        System.out.println("Enter the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The maximum between the number of positive integers and the number of negative integers is "+maxCount(arr));
        sc.close();
    }
}
