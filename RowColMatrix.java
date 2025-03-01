public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {28, 29, 37, 49},
            {33, 34, 38, 50}
        };

        int target = 29;  // Example target to search
        int[] result = search(arr, target);
        if (result[0] != -1 && result[1] != -1) {
            System.out.println("Element found at: (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("Element not found.");
        }
    }

    // Corrected return type from int to int[] for returning an array
    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length - 1; // Corrected to use matrix[0].length for column index
        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }
            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[]{-1, -1}; // Return [-1, -1] if not found
    }
}
