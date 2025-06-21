import java.util.Arrays;
import java.util.Scanner;
public class reverseArray {
    static void reverse(int[] arr){
        int n = arr.length;
        int[] temp = new int[n];
        for(int i=0;i<n;i++){
            temp[i] = arr[n-i-1];
        }
        for(int i=0;i<n;i++){
            arr[i] = temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }

    //Using Two pointer approach
    public void twoPointer(int[] arr){
        int left = 0,right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }


    //swapping the half elements
    static void halfElementSwap(int[] arr){
        int n = arr.length;
        for(int i=0;i<n/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
    }

    //reverse through recursion
    static void recursionReverse(int[] arr,int l,int r){
        if(l>=r){
            return;
        }
        int temp = arr[l];
        arr[l]=  arr[r];
        arr[r] = temp;
        recursionReverse(arr,l+1,r-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Before reversing: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        System.out.println("After reversing: ");
        reverse(arr);
    }
}
