//https://leetcode.com/problems/find-peak-element/description/
public class FindPeakInMountain{
    public static void main(String args[]){

    }
    public int findPeakElement(int[] arr) {
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
}