//https://leetcode.com/problems/spiral-matrix/description/?envType=problem-list-v2&envId=array
/*
54. Spiral Matrix

Given an m x n matrix, return all elements of the matrix in spiral order.

Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
*/

package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix.length == 0) {
            return result;
        }
        
        int minRow = 0;
        int maxRow = matrix.length - 1;
        int minCol = 0;
        int maxCol = matrix[0].length - 1;
        
        while(minRow <= maxRow && minCol <= maxCol) {
            // Traverse from left to right along the top row
            for(int i = minCol; i <= maxCol; i++) {
                result.add(matrix[minRow][i]);
            }
            minRow++;
            
            // Traverse from top to bottom along the right column
            for(int i = minRow; i <= maxRow; i++) {
                result.add(matrix[i][maxCol]);
            }
            maxCol--;
            
            if(minRow <= maxRow) {
                // Traverse from right to left along the bottom row
                for(int i = maxCol; i >= minCol; i--) {
                    result.add(matrix[maxRow][i]);
                }
            }
            maxRow--;
            
            if(minCol <= maxCol) {
                // Traverse from bottom to top along the left column
                for(int i = maxRow; i >= minRow; i--) {
                    result.add(matrix[i][minCol]);
                }
            }
            minCol++;
        }
        return result;
    }

    // Main method to take input from the user and invoke spiralOrder
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        // Read the number of columns
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        
        // Create the matrix
        int[][] matrix = new int[rows][cols];
        
        // Read the matrix elements
        System.out.println("Enter the matrix elements row by row:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        // Create an instance of Solution and get the spiral order
        SpiralMatrix spmat = new SpiralMatrix();
        List<Integer> result = spmat.spiralOrder(matrix);
        
        // Print the result
        System.out.println("Spiral order of the matrix is:");
        for(int num : result) {
            System.out.print(num + " ");
        }
    }
}
