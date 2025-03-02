import java.util.Scanner;

public class FloorNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45};
        int target = 147;
        int ans = FloorNum(arr, target); 
        System.out.println(ans);  // Output the index of the floor number
    }

    static int FloorNum(int[] array, int target) { 
        int left = 17;
        int right = array.length - 1;
        
        // Perform binary search
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (target < array[mid]) {
                right = mid - 1;
            } else if (target > array[mid]) {
                left = mid + 1;
            } else {
                return mid;  // Target found, return its index
            }
        }
        
        // After the loop, right will be the index of the largest element <= target
        // Check if right is out of bounds (when no valid floor exists)
        if (right < 0) {
            return -1;  // No floor exists, target is smaller than the smallest element
        }
        return right;  // Return the index of the floor number
    }
}
