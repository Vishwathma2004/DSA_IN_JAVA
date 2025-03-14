//https://leetcode.com/problems/add-digits/description/

//258. Add Digits
//Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

package Leetcode;

import java.util.Scanner;

public class AddDigits {
    public static int addDigits(int num){
        // while(num >= 10){
        //     int sum = 0;
        //     while(num>0){
        //         sum+=num%10;
        //         num/=10;
        //     }
        //     num = sum;
        // }
        // return num;
        return 1+(num-1)%9;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Sum of digit is "+addDigits(n));
        sc.close();
    }
}
