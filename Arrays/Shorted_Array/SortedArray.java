package Arrays.Shorted_Array;

import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        // Input array elements
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Assume array is sorted in ascending order
        boolean isAscending = true;

        // Check if the array is sorted
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                isAscending = false;
                break; // no need to check further
            }
        }

        // Display result
        if (isAscending) {
            System.out.println(" The array is sorted in ascending order.");
        } else {
            System.out.println(" The array is not sorted.");
        }
    }
}
