package Patterns.Hollow_Butterfly;

import java.util.Scanner;

/*
---------------- Example Output ----------------

Input: n = 5

*        *
**      **
* *    * *
*  *  *  *
*   **   *
*   **   *
*  *  *  *
* *    * *
**      **
*        *

-----------------------------------------------
Explanation:
- Stars are printed only at the borders of each wing (j == 1 or j == i).
- Spaces fill the hollow part.
- The top half builds the wings increasing, the bottom half mirrors them.

*/

public class HollowButterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input: size of half of the butterfly wings
        // Example: if n = 5, total height = 2*n = 10 rows
        int n = sc.nextInt();
        sc.close();

        // ---------------- TOP HALF ----------------
        for (int i = 1; i <= n; i++) {
            // Left wing
            for (int j = 1; j <= i; j++) {
                // Print '*' at first and last position, else space
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Middle gap (spaces between wings)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right wing (mirror of left wing)
            for (int j = i; j >= 1; j--) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Move to the next row
            System.out.println();
        }

        // ---------------- BOTTOM HALF ----------------
        for (int i = n; i >= 1; i--) {
            // Left wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Middle gap
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right wing
            for (int j = i; j >= 1; j--) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Move to next row
            System.out.println();
        }
    }
}
