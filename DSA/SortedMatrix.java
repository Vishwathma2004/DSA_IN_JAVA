import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr={
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
        };
        System.out.println(Arrays.toString(search(arr, 33)));
    }
    //search in the provided between the cols provided
    static int[] binarySearch(int[][] matrix,int row,int cStart,int cEnd,int target){
        while(cStart<=cEnd){
            int mid=cStart + (cEnd-cStart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid]<target){
                cStart = mid+1;
            }
            else{
                cEnd = mid-1;
            }
        }
        return new int[]{-1,-1};

    }
    static int[] search(int[][] matrix,int target)
    {
        int row = matrix.length;
        int columns  = matrix[0].length;
        if(row==1){
            return binarySearch(matrix, 0, 0, columns-1, target); 
        }
        int rStart = 0;
        int rEnd = row-1;
        int cMid = (columns-1)/2;
        //run the loop till rows are remaining
        while(rStart<(rEnd-1)){//while this is true it will have more than 2 rows
            int mid = rStart + (rEnd-rStart)/2;
            if(matrix[mid][cMid]==target){
                return new int[] {mid,cMid};
            }
            if(matrix[mid][cMid]<target){
                rStart = mid;
            }
            else{
                rEnd = mid;
            }
        }
        //now we have 2 rows
        //check whether the target is in the col of 2 rows
        if(matrix[rStart][cMid]==target){
            return new int[] {rStart,cMid};
        }
        if(matrix[rStart+1][cMid]==target){
            return new int[] {rStart+1,cMid};
        }
        //search in the remaining 2 rows
        //search in 1st half
        if(target<=matrix[rStart][cMid]){
            return binarySearch(matrix, rStart, 0, cMid, target);
        }
        
        //search in 2nd  half
        if(target>=matrix[rStart][cMid+1] && target<=matrix[rStart][columns-1]){
            return binarySearch(matrix, rStart, cMid+1, columns-1, target);
        }
        //search in 3rd half
        if(target>=matrix[rStart+1][0] && target<=matrix[rStart+1][cMid]){
            return binarySearch(matrix, rStart+1, 0, cMid, target);
        }
        //search in 4th half
        else{
            return binarySearch(matrix, rStart+1, cMid+1, columns-1, target); 
        }
    }
}
