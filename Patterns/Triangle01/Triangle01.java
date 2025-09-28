package Patterns.Triangle01; 

import java.util.Scanner;

public class Triangle01 {
    /*
     * Qs ==> Print a 0-1 Triangle
     * 
     * Example (n = 5):
     * 
     * 1
     * 01
     * 101
     * 0101
     * 10101
     * 
     * Approach:
     * - Outer loop controls rows.
     * - Inner loop prints values based on (i + j).
     * - If (i + j) is even → print 1
     * - If (i + j) is odd  → print 0
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take number of rows
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        // Outer loop (rows)
        for (int i = 1; i <= n; i++) {

            // Inner loop (columns in each row)
            for (int j = 1; j <= i; j++) {
                int sum = i + j;

                if (sum % 2 == 0) {
                    System.out.print(1+" ");
                } else {
                    System.out.print(0+" ");
                }
            }

            // Move to next row
            System.out.println();
        }

        sc.close(); // Close scanner
    }
}
