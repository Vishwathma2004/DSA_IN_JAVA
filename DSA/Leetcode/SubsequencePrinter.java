
import java.util.*;

public class SubsequencePrinter {

    public static void printSubsequences(int[] arr) {
        List<Integer> current = new ArrayList<>();
        helper(arr, current, 0);
    }

    private static void helper(int[] arr, List<Integer> current, int index) {
        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        // Include current element
        current.add(arr[index]);
        helper(arr, current, index + 1);

        // Backtrack: remove the last element and exclude current element
        current.remove(current.size() - 1);
        helper(arr, current, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println("Subsequences of the array: " + Arrays.toString(arr));
        printSubsequences(arr);
    }
}
//List<Integer> current = new ArrayList<>();
//helper(arr,current,0);
//private static void helper(int[] arr,List<Integer> current,int index){
/*
    if(index==current.length){
    sout(current);
    return;
    }
    current.add(arr[index]);
    helper(arr,current,index+1);

    current.remove(current.size()-1);
    helper(arr,current,index+1);
 */
//}
