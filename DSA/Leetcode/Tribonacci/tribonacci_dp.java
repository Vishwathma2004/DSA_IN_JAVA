package Tribonacci;

import java.util.Scanner;

class tribonacci_dp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("The tribonacci of "+n+"th term is ");
        System.out.println(tribonacci(n));
    }
    static int tribonacci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1||n==2){
            return 1;
        }
        int[] trib = new int[n+1];
        trib[0]=0;
        trib[1]=1;
        trib[2]=1;
        for(int i=3;i<=n;i++){
            trib[i] = trib[i-1]+trib[i-2]+trib[i-3];
        }
        return trib[n];
    }
}