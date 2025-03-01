import java.util.Scanner;

public class CeilingNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45};
        int target = 22;
        int ans = Ceilingnumber(arr, target);
        System.out.println(ans);  // Output the index of the ceiling number
    }

    static int Ceilingnumber(int[] array, int target){
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            // Calculate the mid index safely to avoid overflow
            int mid = left + (right - left) / 2;
            if (target < array[mid]) {
                right = mid - 1;
            } else if (target > array[mid]) {
                left = mid + 1;
            } else {
                return mid;  // Target found, return its index
            }
        }
        return left;  // If target is not found, return the index where the target could be inserted
    }
}
