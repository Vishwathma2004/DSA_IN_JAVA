package RadixSort;
import java.util.Arrays;
import java.util.Scanner;

public class RadixSort {

    public static void radixSort(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        /*
        you can also find max using the below code
         * max = Arrays.stream(arr).max().getAsInt();
         */
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(arr, exp);
        }
    }

    private static void countSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];
        Arrays.fill(count, 0);
        
        // Store count of occurrences
        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }
        
        System.out.println("Count array for " + exp + ": " + Arrays.toString(count));

        // Change count[i] to store actual position of this digit
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        System.out.println("Updated count array " + exp + " : " + Arrays.toString(count));

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
 
        // Copy the output array to arr[]
        System.arraycopy(output, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Call radixSort
        System.out.println("Original array: " + Arrays.toString(arr));
        radixSort(arr);
        
        // Display the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));

        scanner.close();
    }
}
