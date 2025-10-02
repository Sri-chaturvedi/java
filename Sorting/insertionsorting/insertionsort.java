package Sorting.InsertionSorting;

/**
 * InsertionSort.java
 *
 * Insertion Sort Algorithm:
 * - Builds the sorted array one element at a time.
 * - Picks the next element and inserts it into its correct position
 *   in the already sorted part of the array.
 *
 * Time Complexity:
 *   - Worst case: O(n^2)
 *   - Best case: O(n) (already sorted)
 * Space Complexity: O(1) → In-place sorting 
 */
public class InsertionSort {

    // Utility function to print the array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2};

        // Insertion Sort
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i]; // element to be placed in sorted part
            int j = i - 1;

            // Shift elements of the sorted part to the right to make space
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place current element in its correct position
            arr[j + 1] = current;
        }

        // Print sorted array
        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
