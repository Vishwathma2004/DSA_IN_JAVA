import java.util.Arrays;

class NextPermutation {

    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx = -1;

        // Step 1: Find the first decreasing element from the end
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }

        // Step 2: If no such element found, reverse the array
        //for example for the array [3,2,1] ---> no next permutation so reverse the entire array ---> [1,2,3]
        if (idx == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 3: Find just larger element to swap
        for (int i = n - 1; i > idx; i--) {
            if (nums[i] > nums[idx]) {
                swap(nums, i, idx);
                break;
            }
        }

        // Step 4: Reverse the remaining part
        reverse(nums, idx + 1, n - 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i++, j--);
        }
    }

    public static void main(String[] args) {
        // Using a static array for test
        int[] nums = {1, 2, 3};

        nextPermutation(nums);

        System.out.println("Next Permutation: " + Arrays.toString(nums));
    }
}
