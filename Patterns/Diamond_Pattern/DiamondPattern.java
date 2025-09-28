package Patterns.Diamond_Pattern;

import java.util.Scanner;

/*
Example output for n = 5:

Enter the number of rows for the diamond's height: 5
        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        *

How to read this output:
- The upper part forms the expanding triangle (top half of the diamond).
- The lower part forms the shrinking triangle (bottom half).
- Each row uses spaces for alignment so stars are centered, creating a diamond shape.
*/

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for the number of rows
        System.out.print("Enter the number of rows for the diamond's height: ");
        int n = sc.nextInt();

        // Upper part of the diamond
        for (int i = 1; i <= n; i++) {
            // Print leading spaces for alignment
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Print stars for the current row
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("* ");
            }
            // Move to the next row
            System.out.println();
        }

        // Lower part of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces for alignment
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Print stars for the current row
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("* ");
            }
            // Move to the next row
            System.out.println();
        }

        sc.close();
    }
}
