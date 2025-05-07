//https://leetcode.com/problems/happy-number/description/

//202. Happy Number
//Write an algorithm to determine if a number n is happy.

//A happy number is a number defined by the following process:

//Starting with any positive integer, replace the number by the sum of the squares of its digits.
//Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
//Those numbers for which this process ends in 1 are happy.
//Return true if n is a happy number, and false if not



import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        boolean ans = findHappy(n);
        if(ans){
            System.out.println("The number is Happy number");
        }
        else{
            System.out.println("The number is not happy number");
        }
        sc.close();
    }
    public static boolean findHappy(int n){
        int slow = n;
        int fast = n;
        do{
            slow = findSqaure(slow);
            fast = findSqaure(findSqaure(fast));
        }while(slow!=fast);
        if(slow==1){
            return true;
        }
        return false;
    }
    private static int findSqaure(int n){
        int ans = 0;
        while(n>0){
            int rem = n%10;
            ans +=(rem*rem);
            n = n/10;
        }
        return ans;
    }
}
