package Sorting.Bubblesorting;

/**
 * BubbleSort.java
 *
 * Bubble Sort Algorithm:
 * - Repeatedly compare adjacent elements and swap them if out of order.
 * - After each pass, the largest element moves (or "bubbles") to the end.
 *
 * Time Complexity:
 *   Worst Case: O(n^2)
 *   Best Case:  O(n)  (when already sorted)
 * Space Complexity: O(1) → In-place sorting
 */
public class BubbleSort {

    // Utility function to print the array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {9, 5, 7, 2, 4, 6, 1};

        // Bubble Sort Algorithm
        for (int i = 0; i < arr.length - 1; i++) {      // n-1 passes
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        System.out.print("Sorted Array: ");
        printArray(arr);
    }
}
