/*
2520. Count the Digits That Divide a Number
Given an integer num, return the number of digits in num that divide num.

An integer val divides nums if nums % val == 0.
Example 1:

Input: num = 7
Output: 1
Explanation: 7 divides itself, hence the answer is 1.

 */

import java.util.Scanner;

public class CountTheDigitsThatDivideANumber {
    public static int countNumber(int num) {
        int count = 0;
        int temp = num;
        while (temp > 0) {
            int rem = temp % 10;
            if (rem != 0 && num % rem == 0) { // Avoid division by zero
                count++;
            }
            temp /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = countNumber(num);
        System.out.println("Count of digits that divide the number: " + result);
        sc.close();
    }
}
