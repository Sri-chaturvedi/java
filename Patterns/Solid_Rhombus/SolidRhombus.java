package Patterns.Solid_Rhombus;

import java.util.Scanner;

public class SolidRhombus {
    /*
     * Qs ==> Print a Solid Rhombus pattern
     * 
     * Example (n = 5):
     * 
     *     *****
     *    *****
     *   *****
     *  *****
     * *****
     * 
     * Approach:
     * - Outer loop (i): controls rows (1 to n).
     * - First inner loop: prints spaces (n - i).
     * - Second inner loop: prints stars (n times).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for size of rhombus
        System.out.print("Enter the size of rhombus: ");
        int n = sc.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {

            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            // Next line after each row
            System.out.println();
        }

        sc.close();
    }
}
