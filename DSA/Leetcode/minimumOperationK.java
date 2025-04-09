//https://leetcode.com/problems/minimum-operations-to-make-array-values-equal-to-k/description/?envType=daily-question&envId=2025-04-09
/*
3375. Minimum Operations to Make Array Values Equal to K

You are given an integer array nums and an integer k.

An integer h is called valid if all values in the array that are strictly greater than h are identical.

For example, if nums = [10, 8, 10, 8], a valid integer is h = 9 because all nums[i] > 9 are equal to 10, but 5 is not a valid integer.

You are allowed to perform the following operation on nums:

Select an integer h that is valid for the current values in nums.
For each index i where nums[i] > h, set nums[i] to h.
Return the minimum number of operations required to make every element in nums equal to k. If it is impossible to make all elements equal to k, return -1.

 

Example 1:

Input: nums = [5,2,5,4,5], k = 2

Output: 2

Explanation:

The operations can be performed in order using valid integers 4 and then 2.
 */
package Leetcode;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class minimumOperationK {
    // Method to compute the minimum number of operations to make all elements equal to k
    public int minOperations(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < k) {
                return -1;  // If any number is less than k, return -1 as it's impossible
            }
            if (nums[i] > k) {
                set.add(nums[i]);  // Add numbers greater than k to the set
            }
        }
        return set.size();  // Return the size of the set, which represents the number of operations
    }

    // Public static void main to take user input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for the array length and the array elements
        System.out.println("Enter the length of the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Take input for k
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();

        // Create an object of minimumOperationK and call minOperations method
        minimumOperationK obj = new minimumOperationK();
        int result = obj.minOperations(nums, k);

        // Print the result
        if (result == -1) {
            System.out.println("It is impossible to make all elements equal to " + k);
        } else {
            System.out.println("The minimum number of operations required: " + result);
        }

        sc.close();
    }
}
