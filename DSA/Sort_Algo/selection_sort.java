package Sort_Algo;

public class selection_sort {
    public static void selectionsort(int[] arr){
        int n = arr.length;
        for(int i=0;i<arr.length-1;i++){
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {64,25,12,22,11};
        System.out.println("Before sorting: ");
        printArray(arr);
        selectionsort(arr);
        System.out.println("After sorting: ");
        printArray(arr);
    }
}
