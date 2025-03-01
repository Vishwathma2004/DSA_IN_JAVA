import java.util.Scanner;

public class FindMin {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = findmin(arr);
        System.out.println("The minimum value is: " + ans);
        sc.close(); // Close the scanner to avoid resource leak
    }

    public static int findmin(int[] arr) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE; // Returning Integer.MAX_VALUE if the array is empty
        }
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
