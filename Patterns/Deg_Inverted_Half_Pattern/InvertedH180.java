package Patterns.Deg_Inverted_Half_Pattern;

import java.util.Scanner;

public class InvertedH180 {
    /*
     * Qs ==> Print a 180° rotated half pyramid pattern of stars.
     * 
     * Example (n = 5):
     * 
     *     *
     *    **
     *   ***
     *  ****
     * *****
     * 
     * Approach:
     * 1. Outer loop runs for rows (1 to n).
     * 2. First inner loop prints spaces (n - i).
     * 3. Second inner loop prints stars (i).
     * 4. After each row, move to next line.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for number of rows
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {

            // Inner loop for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Inner loop for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to next line after finishing one row
            System.out.println();
        }

        sc.close(); // Always close Scanner
    }
}
