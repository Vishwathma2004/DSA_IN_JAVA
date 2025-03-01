public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(countRotation(arr));
    }
    public static int countRotation(int[] arr){
        int pivot=findPivot(arr);
        return pivot+1;

    }
    //for non duplicate array
    //this function will find the pivot element
    //pivot element is the smallest element in the array
    //after rotation
    //time complexity O(logn)
    //space complexity O(1)
    static int findPivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end &&arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1; 
    }
    //for duplicate array
    //this function will find the pivot element
    //pivot element is the smallest element in the array
    //after rotation
    //time complexity O(n) in worst case
    //space complexity O(1)
    static int findPivotWithDuplicate(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end &&arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            //if arr[mid]==arr[start] and arr[mid]==arr[end] then we can't say anything
            //so we will skip the duplicates
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                start++;
                end--;
            }
            else if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return -1;
    }
}
