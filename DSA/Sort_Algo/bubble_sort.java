package Sort_Algo;

public class bubble_sort {
    public static void bubbleSort(int[] arr){

        int n = arr.length;
        int i,j,temp;
        boolean swapped = false;
        for(i=0;i<n-1;i++){
            swapped = false;
            for(j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp  = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped==false){
                break;
            }
        }
    }
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {64,34,25,12,22,11,90};
        System.out.println("Before sorting: ");
        printArray(arr);
        bubbleSort(arr);
        System.out.println("After sorting: ");
        printArray(arr);
    }
}
