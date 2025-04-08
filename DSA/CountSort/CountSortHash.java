package CountSort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountSortHash {
    public static void countUsingHash(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        Map<Integer, Integer> countMap = new HashMap<>();

        // Populate the count map
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int index = 0;

        // Sort the array based on the count map
        for (int i = min; i <= max; i++) {
            int count = countMap.getOrDefault(i, 0);
            for (int j = 0; j < count; j++) {
                arr[index] = i;
                index++;  // Increment index to fill the next position
            }
        }
    }

}