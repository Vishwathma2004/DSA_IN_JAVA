//https://leetcode.com/problems/rotate-image/description/
//48. Rotate Image

//You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

//You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. 
//DO NOT allocate another 2D matrix and do the rotation.

package Leetcode;


import java.util.Scanner;

public class RotateImage {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        // Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int k = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = k;
            }
        }

        // Reverse each row
        for (int i = 0; i < n; i++) {
            int[] arr = matrix[i];
            reverse(arr);
        }
    }

    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) { // Fix: start < end (not <=)
            int k = arr[start];
            arr[start] = arr[end];
            arr[end] = k;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the matrix (n x n): ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        rotate(matrix);

        System.out.println("Rotated Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
