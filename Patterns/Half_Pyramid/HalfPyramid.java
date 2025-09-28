package Patterns.Half_Pyramid;

import java.util.Scanner;

/*
Example output for input 5:

Enter number of rows: 5
Half Pyramid Pattern:
*
**
***
****
*****

Explanation:
- Prints stars starting with 1 star at the first row, increasing by 1 star each next row.
- Forms a left-aligned half pyramid with height equal to the number of rows.
*/

public class HalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of rows for the half pyramid
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.println("Half Pyramid Pattern:");

        // Outer loop for each row from 1 to n
        for (int i = 1; i <= n; i++) {
            // Inner loop to print stars equal to the current row number
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Print star without moving to next line
            }
            System.out.println(); // Move to the next line after each row
        }

        // Close the scanner to avoid resource leaks
        sc.close();
    }
}
