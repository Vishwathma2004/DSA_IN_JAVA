//https://leetcode.com/problems/island-perimeter/description/?envType=problem-list-v2&envId=array
/*
463. Island Perimeter

You are given row x col grid representing a map where grid[i][j] = 1 represents land and grid[i][j] = 0 represents water.

Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).

The island doesn't have "lakes", meaning the water inside isn't connected to the water around the island. One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100.
Determine the perimeter of the island.
 */

import java.util.Scanner;

public class IslandPerimeter {
    public static int perimeter(int[][] grid){
        int r = grid.length;
        int c = grid[0].length;
        int perimeter = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    perimeter+=4;
                }
                if(i>0 && grid[i-1][j]==1){
                    perimeter-=2;
                }
                if(j>0 && grid[i][j-1]==1){
                    perimeter-=2;
                }
            }
        }
        return perimeter;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int c = sc.nextInt();
        int[][] grid = new int[r][c];
        System.out.println("Enter the elements of the grid:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                grid[i][j] = sc.nextInt();
            }
        }
        System.out.println("The perimeter of the island is: "+perimeter(grid));
        sc.close();
    }
}
