//https://leetcode.com/problems/single-element-in-a-sorted-array/description/

//540. Single Element in a Sorted Array
//You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

//Return the single element that appears only once.

//Your solution must run in O(log n) time and O(1) space.

package Leetcode;

import java.util.Scanner;

public class singleNonDuplicate {
    public int findSingleNonDuplicate(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        } else if (nums[0] != nums[1]) {
            return nums[0];
        } else if (nums[nums.length - 1] != nums[nums.length - 2]) {
            return nums[nums.length - 1];
        }

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]) {
                return nums[mid];
            } else if (mid % 2 == 1) {
                if (nums[mid - 1] == nums[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (nums[mid] == nums[mid + 1]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking for the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];

        // Asking for the elements of the array
        System.out.println("Enter the elements of the array (sorted and each element appears twice except one): ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Creating an instance of singleNonDuplicate and finding the single non-duplicate element
        singleNonDuplicate obj = new singleNonDuplicate();
        int result = obj.findSingleNonDuplicate(nums);

        // Printing the result
        System.out.println("The single non-duplicate element is: " + result);

        scanner.close();
    }
}
