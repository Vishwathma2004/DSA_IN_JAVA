//https://leetcode.com/problems/plus-one/description/
//66. Plus One
//You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

//Increment the large integer by one and return the resulting array of digits.




import java.util.Arrays;
import java.util.Scanner;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        if(digits[n-1]!=9){
            digits[n-1] +=1;
            return digits;
        }
        digits[n-1] = 0;
        for(int i=n-2;i>=0;i--){
            if(digits[i]!=9){
                digits[i]+=1;
                return digits;
            }
            digits[i] = 0;

        }
        int[] ans = new int[n+1];
        ans[0] = 1;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of digits in the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the number");
        int[] digits = new int[n];
        for (int i = 0; i < digits.length; i++) {
            digits[i]  = sc.nextInt();
        }
        int[] res = plusOne(digits);
        System.out.println("Answer is "+Arrays.toString(res));
        sc.close();
    }
}
