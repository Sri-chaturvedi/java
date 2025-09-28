package Patterns.Palindromic_Number_Pyramid;

import java.util.Scanner;

public class PalindromicNumberPyramid {
    /*
     * Qs ==> Print a Palindromic Number Pyramid
     *
     * Example (n = 5):
     *
     *     1
     *    121
     *   12321
     *  1234321
     * 123454321
     *
     * Approach:
     * - Outer loop (i): controls rows (1 to n)
     * - First inner loop: prints spaces (n - i)
     * - Second inner loop: prints ascending numbers (1 to i)
     * - Third inner loop: prints descending numbers (i-1 down to 1)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for number of rows
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {

            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print ascending numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }

            // Print descending numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j+" ");
            }

            // Move to next line after each row
            System.out.println();
        }

        sc.close();
    }
}
