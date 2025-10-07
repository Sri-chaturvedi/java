package QuickSorting;

/**
 * 🧠 IMPORTANT NOTES — QUICK SORT ALGORITHM
 * ----------------------------------------
 * 🔹 QuickSort is a "Divide and Conquer" algorithm.
 * 🔹 It picks a pivot element and partitions the array around it.
 * 🔹 After partitioning:
 *       → Elements smaller than pivot go to the left
 *       → Elements greater than pivot go to the right
 * 🔹 Then, it recursively sorts both sides.
 *
 * 📘 REAL-LIFE EXAMPLE:
 * Imagine arranging books by size —
 * pick one book (pivot), move smaller ones to left, bigger to right,
 * and then repeat this process for each side.
 *
 * ⚙️ HOW IT WORKS:
 *  1️⃣ Select a pivot element (usually the last element).
 *  2️⃣ Rearrange (partition) the array so:
 *      - Elements < pivot are on the left
 *      - Elements > pivot are on the right
 *  3️⃣ Recursively sort the left and right parts.
 *
 * ⏱ TIME COMPLEXITY:
 *      • Best Case: O(n log n)
 *      • Average Case: O(n log n)
 *      • Worst Case: O(n²) — happens when array is already sorted
 *
 * 💾 SPACE COMPLEXITY:
 *      • O(1) → In-place sorting (no extra array used)
 *
 * ⚔️ COMPARISON WITH MERGE SORT:
 *      • Merge Sort uses extra space (O(n)) but is stable.
 *      • QuickSort is faster on average and uses less space, but not stable.
 *
 * 🧩 DRY RUN EXAMPLE:
 * ----------------------------------------
 *   Input → [6, 3, 9, 5, 2, 8]
 *
 *   Step 1️⃣ → Choose pivot = 8
 *   Partition → [6, 3, 5, 2] | 8 | [9]
 *   Pivot index = 4
 *
 *   Step 2️⃣ → Left side [6, 3, 5, 2], pivot = 2
 *   After partition → [2] | 3, 5, 6
 *
 *   Step 3️⃣ → Recursively sort left & right sides
 *   Final Output → [2, 3, 5, 6, 8, 9]
 *
 * 💡 WHY USE QUICK SORT?
 * → Very fast in practice for large datasets.
 * → Works well with memory cache (in-place).
 * → Used in real-world libraries like C’s stdlib and Python’s sort (hybrid version).
 */

public class QuickSort {

    /**
     * ⚙️ Partition Function:
     * ----------------------
     * Chooses the pivot (last element),
     * rearranges the array so smaller elements are on left,
     * and returns the correct index of the pivot.
     */
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high]; // Choose pivot element
        int i = low - 1;       // Pointer for smaller elements

        // Traverse and rearrange elements
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {  // If current element is smaller than pivot
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot at its correct sorted position
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;

        return i; // Return pivot index
    }

    /**
     * 🔁 Recursive QuickSort Function:
     * -------------------------------
     * - Divides array into subarrays around pivot.
     * - Sorts each half recursively until fully sorted.
     */
    public static void quicksort(int arr[], int low, int high) {
        if (low < high) {
            int pidx = partition(arr, low, high); // Get pivot index

            // Recursively sort elements before and after pivot
            quicksort(arr, low, pidx - 1);   // Left subarray
            quicksort(arr, pidx + 1, high);  // Right subarray
        }
    }

    /**
     * 🚀 Main Method (Driver Code)
     */
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        int n = arr.length;

        System.out.println("🟡 Original Array:");
        for (int num : arr) System.out.print(num + " ");
        System.out.println("\n");

        quicksort(arr, 0, n - 1);

        System.out.println("🟢 Sorted Array:");
        for (int num : arr) System.out.print(num + " ");
        System.out.println("\n✅ Sorting Complete!");
    }
}
