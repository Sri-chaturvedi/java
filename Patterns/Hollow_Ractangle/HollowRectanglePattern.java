package Patterns.Hollow_Ractangle;

import java.util.Scanner;

/*
Example output for n = 4, m = 6:

Enter number of rows: 4
Enter number of columns: 6
Hollow Rectangle Pattern:
******
*    *
*    *
******

Explanation:
- Stars are printed for the border rows and columns.
- Spaces are printed inside to make the rectangle hollow.
*/

public class HollowRectanglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter number of rows
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        // Prompt user to enter number of columns
        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

        System.out.println("Hollow Rectangle Pattern:");

        // Outer loop iterating through each row
        for (int i = 1; i <= n; i++) {
            // Inner loop iterating through each column
            for (int j = 1; j <= m; j++) {
                // Print star if current position is on border else spaces
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to next row after each row completes
        }

        // Close the scanner to avoid resource leak
        sc.close();
    }
}
