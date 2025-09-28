package Patterns.Half_Pyramid_with_Numbers;

import java.util.Scanner;

public class HalfPyramidWithNumbers {
    /*
     * Qs ==> Print a half pyramid with numbers.
     * 
     * Example (n = 5):
     * 
     * 1
     * 12
     * 123
     * 1234
     * 12345
     * 
     * Approach:
     * 1. Outer loop controls the rows (1 to n).
     * 2. Inner loop prints numbers from 1 to current row index.
     * 3. Move to the next line after finishing each row.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for number of rows
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {

            // Inner loop for numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }

            // Move to the next line
            System.out.println();
        }

        sc.close(); // Close scanner
    }
}
