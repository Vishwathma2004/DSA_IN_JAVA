//1295 -  https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class EvenDigits {
    public static void main(String args[]){
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    
    }
    static int findNumbers(int[] nums){
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numOfDigits=digits(num);
        if(numOfDigits%2==0){
            return true;
        }
        return false;
    }
    static int digits(int num){
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }
}
//Time Complexity 0ms answer

// public class Solution {
//     public int findEvenNumbers(int[] nums){
//         int ans=0;
//         for(int i:nums){
//             if(((int)(Math.log10(i)) & 1)==1){
//                 ans++;
//             }
//         }
//         return ans;
//     }
//     public static void main(String args[]){
//         int[] nums={12,345,2,6,7896};
//         Solution solution=new Solution();
//         int evenNum=solution.findEvenNumbers(nums);
//         System.out.println(evenNum);
//     }
// }
