package Recursion2.FindSortedArray;

/**
 * 📌 Important Notes – Check if Array is Sorted using Recursion
 *
 * 1. Problem:
 *    - Given an integer array, check whether it is sorted in strictly increasing order.
 *
 * 2. Approach:
 *    - Compare each element with the next one.
 *    - If arr[idx] >= arr[idx+1], return false.
 *    - Otherwise, continue checking recursively.
 *
 * 3. Base Case:
 *    - If we reach the last index (idx == arr.length - 1), return true.
 *
 * 4. Example:
 *    Input: [1, 2, 3, 4, 5]
 *    Output: true
 *
 *    Input: [1, 3, 2, 4]
 *    Output: false
 *
 * 5. Time Complexity: O(n)
 *    Space Complexity: O(n) (due to recursion stack)
 */

public class FSA {
    public static boolean isSorted(int arr[], int idx) {
        // Base case: reached last element
        if (idx == arr.length - 1) {
            return true;
        }

        // If current element is smaller than next → continue checking
        if (arr[idx] < arr[idx + 1]) {
            return isSorted(arr, idx + 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7};
        int arr2[] = {1, 3, 2, 4, 5};

        System.out.println(isSorted(arr1, 0)); // true
        System.out.println(isSorted(arr2, 0)); // false
    }
}
