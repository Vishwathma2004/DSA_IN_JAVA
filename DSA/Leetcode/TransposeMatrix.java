//https://leetcode.com/problems/transpose-matrix/description/
//867. Transpose Matrix

//Given a 2D integer array matrix, return the transpose of matrix.

//The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.



package Leetcode;

import java.util.Scanner;

public class TransposeMatrix {
    public static int[][] findtranspose(int[][] mat) {
        int[][] ans = new int[mat[0].length][mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                ans[j][i] = mat[i][j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] mat = new int[rows][cols];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int[][] result = findtranspose(mat);

        System.out.println("Transposed Matrix:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
