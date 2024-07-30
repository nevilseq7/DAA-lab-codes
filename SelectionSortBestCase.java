import java.util.Arrays;

public class SelectionSortBestCase {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int n = 10000;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        System.out.println("Original array:");
        Arrays.toString(arr);

        long startTime = System.nanoTime();

        selectionSort(arr);

        long endTime = System.nanoTime();

        long elapsedTime = endTime - startTime;

        System.out.println("Sorted array:");
        Arrays.toString(arr);

        System.out.println("Time elapsed for sorting: " + elapsedTime + " nanoseconds");
    }
}
