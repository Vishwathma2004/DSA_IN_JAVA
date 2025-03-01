//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class RotatedBinarySearch{
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
    }
    static int search(int[] nums, int target) {
        int pivot=findPivot(nums);

        //if you dont have pivots then it means array is not rotated
        if(pivot==-1){
            //just do normal  binary search
            return binarySearch(nums, target, 0, nums.length-1);
        }
        //if target is present in first half
        if(target>=nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }
        //if target is present in second half
        return binarySearch(nums, target, pivot+1, nums.length-1);
            

    }
    static int binarySearch(int[] array,int target,int left,int right){
        while(left<=right){
            //int mid=(left+right)/2; there is possibility that start+end may exceed the range of integer
            int mid = left + (right - left) / 2;
            if(target<array[mid]){
                right=mid-1;
            }

            else if(target>array[mid]){
                left=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
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
}
