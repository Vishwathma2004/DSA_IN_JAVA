import java.util.Scanner;
import java.util.Arrays;
public class SearchIn2DArray {
    public static void main(String args[]){
        int[][] arr={
            {23,4,1},
            {18,12,3,9},
            {78,79,80,81}
        };
        int target = 34;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
        
    }
    public static int[] search(int[][] arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    //return 1;
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}

//Time Complexity: O(n*m)
//Space Complexity: O(1)
