//https://leetcode.com/problems/matrix-diagonal-sum/description/
//1572. Matrix Diagonal Sum

//Given a square matrix mat, return the sum of the matrix diagonals.

//Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of 
//the primary diagonal.



import java.util.Scanner;

public class MatrixDiagonalSum {
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
        }
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][mat.length - 1 - i];
        }
        if (mat.length % 2 != 0) {
            sum -= mat[mat.length / 2][mat.length / 2];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of matrix: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int result = diagonalSum(mat);
        System.out.println("Diagonal sum of the matrix is: " + result);

        sc.close();
    }
}