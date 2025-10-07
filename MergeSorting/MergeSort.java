/*
=====================================================================================
📘 PROGRAM NAME  : Merge Sort Algorithm (Divide and Conquer)
📂 PACKAGE       : MergeSorting
💡 TOPIC         : Sorting Algorithm – Recursion + Merge Concept

📅 DESCRIPTION   : 
   Merge Sort is a highly efficient, stable sorting algorithm based on the 
   Divide and Conquer approach. It recursively divides the array into two halves, 
   sorts each half, and then merges them back together in sorted order.

=====================================================================================
🎯 QUESTION:
Write a program to sort an array using the **Merge Sort** algorithm.

Example:
Input  → [6, 3, 9, 5, 2, 8]  
Output → [2, 3, 5, 6, 8, 9]

=====================================================================================
🧠 DRY RUN (Concept Example):

Given: [6, 3, 9, 5, 2, 8]

➡ Divide into halves until single elements remain:
   [6, 3, 9]  and  [5, 2, 8]
   → [6] [3, 9] → [3, 6, 9]
   → [5] [2, 8] → [2, 5, 8]

➡ Conquer (Merge Sorted Halves):
   Merge [3, 6, 9] and [2, 5, 8]
   → [2, 3, 5, 6, 8, 9]

=====================================================================================
⚙️ ALGORITHM / LOGIC FLOW:
1️⃣ **Divide** the array into two halves recursively until each sub-array has one element.
2️⃣ **Conquer (Merge)** two sorted sub-arrays into one sorted array.
3️⃣ Repeat merging until the entire array is sorted.

Functions:
- `divide(arr, si, ei)` → Recursively divides array into two halves.
- `conquer(arr, si, mid, ei)` → Merges two sorted halves.

=====================================================================================
📊 TIME COMPLEXITY:
   🔹 Best Case:   O(n log n)
   🔹 Average:     O(n log n)
   🔹 Worst Case:  O(n log n)

💾 SPACE COMPLEXITY:
   🔹 O(n) (temporary merged array)

=====================================================================================
💡 KEY POINTS:
✔ Stable Sorting Algorithm  
✔ Works well with large datasets  
✔ Based on Divide and Conquer strategy  
✔ Time complexity is consistent for all cases  

=====================================================================================
*/

package MergeSorting;

public class MergeSort {

    // Time Complexity = O(n log n)
    // 🧩 "Conquer" step – merge two sorted halves
    public static void conquer(int arr[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];

        int idx1 = si;       // Pointer for left subarray
        int idx2 = mid + 1;  // Pointer for right subarray
        int x = 0;           // Index for merged array

        // Compare elements from both halves and merge in sorted order
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        // Copy remaining elements from left half
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        // Copy remaining elements from right half
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        // Copy merged elements back to original array
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    // 🧠 "Divide" step – split the array recursively
    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return; // Base case: single element
        }

        int mid = si + (ei - si) / 2; // Prevents overflow
        divide(arr, si, mid);         // Left half
        divide(arr, mid + 1, ei);     // Right half

        conquer(arr, si, mid, ei);    // Merge sorted halves
    }

    // 🧾 Main method to test Merge Sort
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;

        divide(arr, 0, n - 1);

        // Print sorted array
        System.out.println("✅ Sorted Array using Merge Sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
