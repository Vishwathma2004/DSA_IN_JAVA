//https://leetcode.com/problems/find-in-mountain-array/description/
public class SearchInMountain{
    public static void main(String args[]){
    
    }
    int search(int[] arr,int target){
        int peak=peakIndexInMountainArray(arr);
        int firstTry = OrderAgnosticBS(arr, target, peak+1, arr.length-1 );
        if(firstTry!=-1){
            return firstTry;
        }
        return OrderAgnosticBS(arr, target,0, peak);
    }
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    static int OrderAgnosticBS(int[] arr, int target,int start,int end) {
        // Check if the array is empty
        if (arr.length == 0) {
            return -1; // Array is empty, return -1
        }

        // Determine if the array is sorted in ascending or descending order
        boolean asc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // If the element is found at mid
            if (target == arr[mid]) {
                return mid;
            }

            if (asc) {
                // If the array is in ascending order
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                // If the array is in descending order
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1; // Element not found
    }
}