package Patterns.Number_Pyramid;

import java.util.Scanner;

public class NumberPyramid {
    /*
     * Qs ==> Print a Number Pyramid
     *
     * Example (n = 5):
     *
     *     1
     *    2 2
     *   3 3 3
     *  4 4 4 4
     * 5 5 5 5 5
     *
     * Approach:
     * - Outer loop (i): controls the row number (1 to n).
     * - First inner loop: prints spaces (n - i).
     * - Second inner loop: prints the row number 'i' with a space.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for size of pyramid
        System.out.print("Enter the size of Pyramid: ");
        int n = sc.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {

            // Print spaces before numbers (for alignment)
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print numbers (row number 'i', repeated 'i' times)
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            // Move to next line after each row
            System.out.println();
        }

        sc.close();
    }
}
