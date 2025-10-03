package Sorting.SelectionSorting;

/**
 * SelectionSort.java
 *
 * Selection Sort Algorithm:
 * - Repeatedly find the smallest element from unsorted part
 * the beginning.
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(1) → In-place sorting
 */
public class SelectionSort {

    // Utility function to print the array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2};

        // Selection Sort
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;

            // Find the smallest element in the unsorted part
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }

            // Swap the found smallest element with the first element of unsorted part
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        // Print sorted array
        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
