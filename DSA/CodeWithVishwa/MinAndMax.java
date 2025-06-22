import java.util.Scanner;
//Using for Loop
public class MinAndMax {
    public static int min(int[] arr,int n){
        int min_ele = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min_ele){
                min_ele = arr[i];
            }
        }
        return min_ele;
    }
    static int max(int[] arr,int n){
        int max_ele = Integer.MIN_VALUE;
        for(int ele:arr){
            if(ele>max_ele){
                max_ele = ele;
            }
        }
        return max_ele;
    }

//Using Sorting
class Pair{
    public int min;
    public int max;
}
class MinAndMax{
    static Pair getMinMax(int[] arr,int n){
        Pair minmax = new Pair();
        if(n==1){
            minmax.max = arr[0];
            minmax.min = arr[0];
            return minmax;
        }
        if(arr[0]>arr[1]){
            minmax.max = arr[0];
            minmax.min = arr[1];
        }else{
            minmax.max = arr[1];
            minmax.min = arr[0];
        }
        for(int i=2;i<n;i++){
            if(arr[i]>minmax.max){
                minmax.max = arr[i];
            }else if(arr[i]<minmax.min){
                minmax.min = arr[i];
            }
        }
        return minmax;
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The max element is: "+max(arr,n));
        System.out.println("The min element is: "+min(arr,n));
        sc.close();
    }
}
