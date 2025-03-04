package Tribonacci;

import java.util.Scanner;

public class tribonacci_optimised {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n =sc.nextInt();
        System.out.println("The tribonacci of "+n+"th term is ");
        System.out.println(tribonacci(n));
    }
    static int tribonacci(int n){
        int ft = 0;
        int st = 1;
        int tt = 1;
        int fot =0;
        for(int i=3;i<=n;i++){
            fot = ft +st + tt;
            ft = st;
            st = tt;
            tt = fot;
        }
        return fot;
    }
}