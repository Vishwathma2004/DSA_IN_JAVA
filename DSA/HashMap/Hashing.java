package HashMap;

import java.util.Scanner;

public class Hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of elements
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        // Input elements
        System.out.println("Enter the elements (between 0 and 12): ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Precompute frequency using a fixed size hash array
        int[] hash = new int[13]; // assuming elements range from 0 to 12
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0 && arr[i] < hash.length) {
                hash[arr[i]] += 1;
            } else {
                System.out.println("Element out of range: " + arr[i]);
            }
        }

        // Handle queries
        System.out.println("Enter the number of queries: ");
        int q = sc.nextInt();
        while (q > 0) {
            System.out.println("Enter the number to get its frequency: ");
            int number = sc.nextInt();

            if (number >= 0 && number < hash.length) {
                System.out.println("The frequency of " + number + " is " + hash[number]);
            } else {
                System.out.println("Number out of range (0-12).");
            }

            q--;
        }

        sc.close(); // Always good practice to close the scanner
    }
}
