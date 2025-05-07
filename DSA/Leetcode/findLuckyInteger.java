

import java.util.Scanner;


public class findLuckyInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Lucky Integer is");
        System.out.println(luckyInteger(arr));
        sc.close();
    }
    public static int luckyInteger(int[] arr){
        int[] freq = new int[501];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        int ans = -1;
        for (int i = 1; i < freq.length; i++) {
            if(freq[i]==i){
                ans = i;
            }
        }
        return ans;
    }
}
