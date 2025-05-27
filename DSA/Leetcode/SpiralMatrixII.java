//https://leetcode.com/problems/spiral-matrix-ii/description/
//59. Spiral Matrix II
//Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order


package Leetcode;
import java.util.Scanner;

public class SpiralMatrixII {
    public static int[][] spiralMatrix(int n) {
        int[][] arr = new int[n][n];
        int count = 1;
        int minRow = 0;
        int maxRow = n - 1;
        int minCol = 0;
        int maxCol = n - 1;
        
        while (count <= n * n) {
            // Fill top row
            for (int i = minCol; i <= maxCol; i++) {
                arr[minRow][i] = count;
                count++;
            }
            // Fill right column
            for (int i = minRow + 1; i <= maxRow; i++) {
                arr[i][maxCol] = count;
                count++;
            }
            // Fill bottom row
            for (int i = maxCol - 1; i >= minCol; i--) {
                arr[maxRow][i] = count;
                count++;
            }
            // Fill left column
            for (int i = maxRow - 1; i > minRow; i--) {
                arr[i][minCol] = count;
                count++;
            }

            // Shrink the boundaries
            minCol++;
            maxCol--;
            minRow++;
            maxRow--;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the matrix (n): ");
        int n = sc.nextInt();
        
        int[][] result = spiralMatrix(n);
        
        System.out.println("Spiral Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
