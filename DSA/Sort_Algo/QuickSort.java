public class QuickSort {
    private int[] arr;

    QuickSort(int[] arr) {
        this.arr = arr;
    }

    void sort() {
        quicksort(0, arr.length - 1);
    }

    void quicksort(int left, int right) {
        if (left < right) {
            int s = partition(left, right);
            quicksort(left, s - 1);
            quicksort(s + 1, right);
        }
    }

    int partition(int left, int right) {
        int pivot = arr[left];
        int i = left + 1;
        int j = right;

        while (i <= j) {
            while (i <= right && arr[i] < pivot) {
                i++;
            }
            while (j >= left && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                swap(i, j);
                i++;
                j--;
            }
        }
        swap(left, j);
        return j;
    }

    private void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2, 7, 1, 10};
        QuickSort qs = new QuickSort(arr);
        qs.sort();

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
