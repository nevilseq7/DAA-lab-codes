import java.util.Arrays;

public class SelectionSortBestCase {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // One by one move the boundary of the unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted array
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int n = 10000;
        int[] arr = new int[n];

        // Generate sorted elements
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        System.out.println("Original array:");
        Arrays.toString(arr);

        // Measure the time before sorting
        long startTime = System.nanoTime();

        // Sort the array using selection sort
        selectionSort(arr);

        // Measure the time after sorting
        long endTime = System.nanoTime();

        // Calculate the elapsed time
        long elapsedTime = endTime - startTime;

        System.out.println("Sorted array:");
        Arrays.toString(arr);

        System.out.println("Time elapsed for sorting: " + elapsedTime + " nanoseconds");
    }
}
