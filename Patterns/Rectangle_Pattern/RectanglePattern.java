package Patterns.Rectangle_Pattern;

import java.util.Scanner;

/*
Example output for n = 4, m = 6:

Enter number of rows: 4
Enter number of columns: 6
Rectangle Star Pattern:
******
******
******
******

Explanation:
- Prints stars in a rectangular shape with n rows and m columns.
- Every row contains m stars.
*/

public class RectanglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for number of rows
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        // Prompt user for number of columns
        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

        System.out.println("Rectangle Star Pattern:");

        // Outer loop for each row
        for (int i = 1; i <= n; i++) {
            // Inner loop for printing stars in each column
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to next line after each row
        }

        sc.close(); // Close scanner to avoid resource leak
    }
}

