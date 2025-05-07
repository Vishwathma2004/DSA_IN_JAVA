//https://leetcode.com/problems/sort-colors/

//75. Sort Colors
//Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

//We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

//You must solve this problem without using the library's sort function.



import java.util.Scanner;

public class SortColors {
    public void sortColors(int[] nums) {
        int start = 0;
        int mid = 0;
        int end = nums.length - 1;
        while (mid <= end) {
            if (nums[mid] == 0) {
                swap(nums, start, mid);
                start++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, end, mid);
                end--;
            }
        }
    }

    public void swap(int[] nums, int start, int mid) {
        int temp = nums[start];
        nums[start] = nums[mid];
        nums[mid] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        
        System.out.println("Enter the elements (only 0, 1, or 2):");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        SortColors sorter = new SortColors();
        sorter.sortColors(nums);
        
        System.out.println("Sorted colors: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}