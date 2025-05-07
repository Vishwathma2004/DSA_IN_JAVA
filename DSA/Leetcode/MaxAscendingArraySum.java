//https://leetcode.com/problems/maximum-ascending-subarray-sum/description/
//1800. Maximum Ascending Subarray Sum
// Given an array of positive integers nums, return the maximum possible sum of an strictly increasing subarray in nums.

// A subarray is defined as a contiguous sequence of numbers in an array.

// Example 1:

// Input: nums = [10,20,30,5,10,50]
// Output: 65
// Explanation: [5,10,50] is the ascending subarray with the maximum sum of 65.



import java.util.Scanner;

public class MaxAscendingArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum sum is Ascending array is");
        System.out.println(max(arr));
        sc.close();

    }
    public static int max(int[] arr){
        int max = arr[0];
        int curMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1]<arr[i]){
                curMax+=arr[i];
            }
            else{
                max = Math.max(curMax, max);
                curMax = arr[i];
            }
        }
        max = Math.max(max, curMax);
        return max;
    }
}
