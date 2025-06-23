public class KthSmallestElement {
    static int partition(int[] arr,int l,int r){
        int x = arr[r];
        int i = l;
        for(int j=l;j<=r-1;j++){
            if(arr[j]<=x){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;
    }
    
}
