//https://leetcode.com/problems/row-with-maximum-ones/description/?envType=problem-list-v2&envId=array
/*
2643. Row With Maximum Ones

Given a m x n binary matrix mat, find the 0-indexed position of the row that contains the maximum count of ones, and the number of ones in that row.
In case there are multiple rows that have the maximum count of ones, the row with the smallest row number should be selected.
Return an array containing the index of the row, and the number of ones in it.

Example 1:
Input: mat = [[0,1],[1,0]]
Output: [0,1]
Explanation: Both rows have the same number of 1's.
So we return the index of the smaller row, 0, and the maximum count of ones (1). So, the answer is [0,1]. 
 */
import java.util.Scanner;

public class RowWithMaximumOnes {
    public int[] rowAndMaximumOnes(int[][] mat){
        int max_count = -1,row_idx = -1;
        int r = mat.length;
        int c = mat[0].length;
        for(int i=0;i<r;i++){
            int count = 0;
            for(int j=0;j<c;j++){
                count+=mat[i][j];
            }
            if(count>max_count){
                max_count = count;
                row_idx = i;
            }

        }
        return new int[]{row_idx,max_count};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows and columns");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        System.out.println("Enter the elements");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        RowWithMaximumOnes obj = new RowWithMaximumOnes();
        int[] res = obj.rowAndMaximumOnes(mat); 
        System.out.println("The result is:");
        System.out.println(res[0]+" "+res[1]);
    }
}