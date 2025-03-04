package Tribonacci;

import java.util.Scanner;

public class tribonacci_rec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("Tribonacci of "+n+"th number is:");
        System.out.println(tribonacci(n));
    }
    static int tribonacci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1|n==2){
            return 1;
        }
        else{
            return tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
        }
    }
}
