package Leetcode;

import java.util.Scanner;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        
        System.out.println("Enter the elements in ascending order: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target element: ");
        int target = sc.nextInt();

        // Store the result from searchrange
        int[] result = searchrange(arr, target);

        // Print the result
        System.out.println("Element found at index: [" + result[0] + ", " + result[1] + "]");

        sc.close();
    }

    public static int[] searchrange(int[] arr, int target) {
        int[] ans = {-1, -1};
        if (arr.length == 0) {
            return ans;
        }
        ans[0] = firstOccurence(arr, target);
        ans[1] = lastOccurence(arr, target);
        return ans;  // Return the result array
    }

    public static int firstOccurence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                end = mid - 1; // Move left to find the first occurrence
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static int lastOccurence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                start = mid + 1; // Move right to find the last occurrence
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
