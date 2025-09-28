package Patterns.Inverted_Half_Pyramid_with_Numbers;

import java.util.Scanner;

public class InvertedHalfPyramidWithNumbers {
    /*
     * Qs ==> Print an inverted half pyramid with numbers.
     * 
     * Example (n = 5):
     * 
     * 1 2 3 4 5
     * 1 2 3 4
     * 1 2 3
     * 1 2
     * 1
     * 
     * Approach:
     * 1. Outer loop: controls rows (start from n down to 1).
     * 2. Inner loop: prints numbers from 1 up to i for each row.
     * 3. After each row, move to the next line.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for number of rows
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        // Outer loop (rows from n down to 1)
        for (int i = n; i >= 1; i--) {

            // Inner loop (print numbers from 1 to i)
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Print a new line after each row
            System.out.println();
        }

        sc.close(); // Close scanner
    }
}
