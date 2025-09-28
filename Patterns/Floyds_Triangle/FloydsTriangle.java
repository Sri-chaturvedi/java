package Patterns.Floyds_Triangle;

import java.util.Scanner;

public class FloydsTriangle {
    /*
     * Qs ==> Print Floyd's Triangle
     * 
     * Example (n = 5):
     * 
     * 1
     * 2 3
     * 4 5 6
     * 7 8 9 10
     * 11 12 13 14 15
     * 
     * Approach:
     * 1. Keep a counter (number) starting from 1.
     * 2. Outer loop: controls the number of rows.
     * 3. Inner loop: prints numbers for the current row.
     * 4. Increment number after printing.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for number of rows
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        int number = 1; // Starting number

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {

            // Inner loop for numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }

            // Move to the next line after each row
            System.out.println();
        }

        sc.close(); // Close scanner
    }
}
