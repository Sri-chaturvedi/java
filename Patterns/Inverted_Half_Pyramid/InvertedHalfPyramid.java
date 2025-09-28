package Patterns.Inverted_Half_Pyramid;

import java.util.Scanner;

/*
Example output for input 5:

Enter number of rows: 5
Inverted Half Pyramid Pattern:
*****
****
***
**
*

Explanation:
- Starts with n stars in the first row, decreasing by 1 star each row.
- Forms a left-aligned inverted half pyramid.
*/

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of rows
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.println("Inverted Half Pyramid Pattern:");

        // Outer loop for rows from n down to 1
        for (int i = n; i >= 1; i--) {
            // Inner loop to print stars equal to current row number
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to next line after each row
        }

        sc.close(); // Close scanner to avoid resource leak
    }
}
