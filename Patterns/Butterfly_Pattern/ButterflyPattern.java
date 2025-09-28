package Patterns.Butterfly_Pattern;

import java.util.Scanner;

/*
Example output for n = 5:

Enter the number of rows for the butterfly wings: 5
*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *

How to read this output:
- The first 5 rows form the upper half of the butterfly: stars increase and spaces decrease.
- The next 5 rows form the lower half: stars decrease and spaces increase.
- Each row has stars on both sides, with spaces separating them in the center.
*/

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for size of the butterfly pattern
        System.out.print("Enter the number of rows for the butterfly wings: ");
        int n = sc.nextInt();

        // Upper half of Butterfly
        for (int i = 1; i <= n; i++) {
            // Print left wing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Print spaces between the two wings
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Print right wing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to the next row
            System.out.println();
        }

        // Lower half of Butterfly
        for (int i = n; i >= 1; i--) {
            // Print left wing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Print spaces between the two wings
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Print right wing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to the next row
            System.out.println();
        }

        sc.close();
    }
}
