public class Solution {
    public int findEvenNumbers(int[] nums){
        int ans=0;
        for(int i:nums){
            if(((int)(Math.log10(i)) & 1)==1){
                ans++;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int[] nums={12,345,2,6,7896};
        Solution solution=new Solution();
        int evenNum=solution.findEvenNumbers(nums);
        System.out.println(evenNum);
    }
}
