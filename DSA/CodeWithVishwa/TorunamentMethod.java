import java.util.Scanner;

class MinMax {
    int min;
    int max;
} 
public class TorunamentMethod {
    public static MinMax getMinMax(int[] arr,int low,int high){
        MinMax result = new MinMax();
        if(low==high){
            result.min=result.max=arr[low];
            return result;
        }
        if(high==low+1){
            if(arr[low]>arr[high]){
                result.min = arr[high];
                result.max = arr[low];
            }
            else{
                result.min = arr[low];
                result.max = arr[high];
            }
            return result;
        }
        int mid = low + (high-low)/2;
        MinMax left = getMinMax(arr, low, mid);
        MinMax right = getMinMax(arr, mid+1, high);
        result.min = Math.min(left.min,right.min);
        result.max = Math.max(left.max,right.max);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        MinMax result = getMinMax(arr,0,arr.length-1);
        System.out.println("Minimum number is "+result.min);
        System.out.println("Max number is "+result.max);
    }
}
