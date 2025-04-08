package CountSort;

import java.util.Scanner;

public class CountSort {

    /**
     * Sorts the given array using the Count Sort algorithm.
     * @param arr The input array to be sorted.
     */
    public static void countSort(int[] arr) {
        // Check if the array is null or has 1 or fewer elements (no sorting needed)
        if (arr == null || arr.length <= 1) {
            return;
        }

        // Step 1: Find the maximum element in the array
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;  // Update max if a larger element is found
            }
        }

        // Step 2: Initialize the count array of size (max + 1)
        int[] countArray = new int[max + 1];

        // Step 3: Populate the count array
        for (int num : arr) {
            countArray[num]++;  // Increment count of each number
        }

        // Step 4: Rebuild the sorted array using the count array
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (countArray[i] > 0) {
                arr[index] = i;  // Place the element i at the correct position
                index++;  // Move to the next index
                countArray[i]--;  // Decrease the count of i
            }
        }
    }

    /**
     * Utility method to print an array
     * @param arr The array to print
     */
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    /**
     * Main method to test the CountSort with user input
     */
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask user for the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Declare the array and take input from the user
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();  // Read each element from the user
        }

        // Close the scanner to prevent resource leaks
        scanner.close();

        // Print the original array
        System.out.println("Original Array:");
        printArray(arr);

        // Call countSort to sort the array
        countSort(arr);

        // Print the sorted array
        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
