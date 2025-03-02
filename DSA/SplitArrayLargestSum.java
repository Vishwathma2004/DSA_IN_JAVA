//https://leetcode.com/problems/split-array-largest-sum/description/
public class SplitArrayLargestSum {

    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        int m = 2;
        System.out.println(splitArray(nums, m));
    }
    static int splitArray(int[] nums,int m){
        int start=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
            start=Math.max(start,nums[i]); //in the end of the loop this will contain the max item from the array
            end+=nums[i];
        }
        //binary search
        while(start<=end){
            //try for the middle for the potential answer
            int mid=start+(end-start)/2;
            //calculate how many pieces you can divide this in with this max sum
            int sum=0;
            int pieces=1;
            for(int num:nums){
                if(sum+num>mid){
                    //you cannot add this in this subarray,make new one
                    //say you add this num in new subarray,then sum=num
                    sum=num;
                    pieces++;
                
                }else{
                    sum+=num;
                }
            }

            if(pieces>m){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return end;
    }
}
// Solution
// class Solution {
//     public int splitArray(int[] nums, int m) {
//         int start = 0;
//         int end = 0;
//         for (int i = 0; i < nums.length; i++) {
//             start = Math.max(start, nums[i]); // max item from the array
//             end += nums[i]; // total sum of all items in the array
//         }
        
//         // Binary search
//         while (start < end) {  // Use '<' instead of '<=' for proper narrowing of search space
//             int mid = start + (end - start) / 2;
//             int sum = 0;
//             int pieces = 1;
            
//             for (int num : nums) {
//                 if (sum + num > mid) {
//                     // cannot add this num to the current subarray, make a new subarray
//                     sum = num;
//                     pieces++;
//                 } else {
//                     sum += num;
//                 }
//             }

//             if (pieces > m) {
//                 start = mid + 1;  // We need a larger sum since pieces are too many
//             } else {
//                 end = mid;  // We can try to reduce the sum
//             }
//         }
//         return start;  // start will be the minimal maximum sum when the loop ends
//     }
//}
