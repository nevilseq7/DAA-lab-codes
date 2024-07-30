import java.util.Random;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped by inner loop, then break
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[10000];
        Random rand = new Random();

        // Fill the array with random integers
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10000); // Random integers between 0 and 9999
        }

        System.out.println("Unsorted array:");
        for (int i = 0; i < 100; i++) { // Print only the first 100 elements for brevity
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        long startTime = System.currentTimeMillis();
        bubbleSort(arr);
        long endTime = System.currentTimeMillis();

        System.out.println("Sorted array:");
        for (int i = 0; i < 100; i++) { // Print only the first 100 elements for brevity
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Time taken to sort: " + (endTime - startTime) + " milliseconds");
    }
}
