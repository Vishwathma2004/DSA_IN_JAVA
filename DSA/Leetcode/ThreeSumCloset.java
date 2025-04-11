//https://leetcode.com/problems/3sum-closest/description/?envType=problem-list-v2&envId=array
/*
16. 3Sum Closest

Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.

 

Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */
package Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeSumCloset {
    public static int threeSum(int[] arr, int target) {
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        int resultSum = arr[0] + arr[1] + arr[2];
        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == target) {
                    return target;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
                int diffTarget = Math.abs(sum - target);
                if (diffTarget < minDiff) {
                    resultSum = sum;
                    minDiff = diffTarget;
                }
            }
        }
        return resultSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Taking user input for the target
        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();
        
        // Calling the threeSum function and printing the result
        System.out.println("Closest sum to target " + target + " is: " + threeSum(arr, target));

        // Closing the scanner to prevent resource leak
        scanner.close();
    }
}
