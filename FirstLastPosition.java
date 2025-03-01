//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

import java.util.Scanner;
public class FirstLastPosition{
    public static void main(String args[]){

    }
    public int[] searchRange(int[] nums,int target){
        int[] ans={-1,-1};
        //check for first occurence if target first

        int start=search(nums,target,true);
        int end=search(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;  // If target is not found, return the index where the target could be inserted
    } 
    int search(int[] nums,int target,boolean firstStartIndex){
        int ans=-1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            // Calculate the mid index safely to avoid overflow
            int mid = left + (right - left) / 2;
            if (target < nums[mid]) {
                right = mid - 1;
            } else if(target>nums[mid]){
                left = mid + 1;
            }
            else{
                ans=mid;
                if(firstStartIndex==true){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
        }
        return ans;
    }
}