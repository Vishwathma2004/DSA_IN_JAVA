package Leetcode;

import java.util.Scanner;

public class MergeSortedArray {
    public static void mergeStep(int[] num1, int m, int[] num2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        
        while (i >= 0 && j >= 0) {
            if (num1[i] > num2[j]) {
                num1[k--] = num1[i--];
            } else {
                num1[k--] = num2[j--];
            }
        }
        
        // Copy any remaining elements from nums2
        while (j >= 0) {
            num1[k--] = num2[j--];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define nums1 size correctly as m + n
        System.out.print("Enter number of valid elements in nums1: ");
        int m = sc.nextInt();
        System.out.print("Enter number of elements in nums2: ");
        int n = sc.nextInt();

        // nums1 should have size m + n to accommodate both arrays
        int[] nums1 = new int[m + n];
        int[] nums2 = new int[n];

        // Take input for valid elements in nums1
        System.out.println("Enter elements of nums1:");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        // Take input for nums2
        System.out.println("Enter elements of nums2:");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        // Call merge function
        mergeStep(nums1, m, nums2, n);

        // Print the merged array
        System.out.print("Merged array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
