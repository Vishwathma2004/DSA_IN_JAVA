import java.util.Arrays;
import java.util.Scanner;

public class DutchNationalFalgAlgo {
    static void sort012(int[] arr){
        int lo=0;
        int n = arr.length-1;
        int high = n;
        int mid = 0;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,lo,mid);
                mid++;
                lo++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }
    }
    static void swap(int[] arr,int low,int high){
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sort012(arr);
        System.out.println(Arrays.toString(arr));
    }
}
