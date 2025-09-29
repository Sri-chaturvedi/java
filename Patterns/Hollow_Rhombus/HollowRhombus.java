package Patterns.Hollow_Rhombus;

import java.util.Scanner;

/*
---------------- Example Output ----------------

Input: n = 5

*****
*   *
*   *
*   *
*****

Shifted to look like a rhombus:

    *****
   *   *
  *   *
 *   *
*****

-----------------------------------------------
Explanation:
- Outer loop controls rows.
- First inner loop prints leading spaces (n - i).
- Second inner loop prints the rhombus:
    * Print '*' when on the boundary:
        - first row (i == 1)
        - last row (i == n)
        - first column (j == 1)
        - last column (j == n)
    * Else print space ' '.
*/

public class HollowRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        // Loop through each row
        for (int i = 1; i <= n; i++) {

            // Print leading spaces to shift the rhombus
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars and spaces for the rhombus body
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n) {
                    System.out.print("*"); // Border
                } else {
                    System.out.print(" "); // Hollow part
                }
            }

            // Next line
            System.out.println();
        }
    }
}
