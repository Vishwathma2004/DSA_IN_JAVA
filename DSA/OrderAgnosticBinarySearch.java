import java.util.Scanner;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45};
        int ele = 22;
        int ans = OrderAgnosticBS(arr, ele);
        System.out.println(ans);
    }

    static int OrderAgnosticBS(int[] arr, int ele) {
        int start = 0;
        int end = arr.length - 1;

        // Check if the array is empty
        if (arr.length == 0) {
            return -1; // Array is empty, return -1
        }

        // Determine if the array is sorted in ascending or descending order
        boolean asc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // If the element is found at mid
            if (ele == arr[mid]) {
                return mid;
            }

            if (asc) {
                // If the array is in ascending order
                if (ele < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                // If the array is in descending order
                if (ele > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1; // Element not found
    }
}
