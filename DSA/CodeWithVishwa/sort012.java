import java.util.Scanner;

public class sort012 {
    static void Sort012(int[] arr){
        int n = arr.length;
        int c0=0,c1=0,c2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                c0++;
            }
            else if(arr[i]==1){
                c1++;
            }
            else if(arr[i]==2){
                c2++;
            }
        }
        int idx = 0;
        for(int i=0;i<c0;i++){
            arr[idx++] = 0;
        }
        for(int i=0;i<c1;i++){
            arr[idx++] = 1;
        }
        for(int i=0;i<c2;i++){
            arr[idx++] = 2;
        }
        System.out.println("Sorted array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Sort012(arr);
    }
}
