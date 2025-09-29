package Patterns.Pascals_Triangle;

import java.util.Scanner;

/*
---------------- Example Output ----------------

Input: n = 5

    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1

-----------------------------------------------
Explanation:
- Pascal’s Triangle is based on binomial coefficients.
- Each number is the sum of the two numbers directly above it.
- Formula: C(n, r) = n! / (r! * (n-r)!)
*/

public class PascalsTriangle {

    // ---------------- FACTORIAL METHOD ----------------
    // Calculates factorial of a number (e.g., 5! = 5*4*3*2*1)
    public static int fact(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    // ---------------- NCR METHOD ----------------
    // Calculates binomial coefficient nCr = n! / (r! * (n-r)!)
    public static int nCr(int n, int r) {
        return fact(n) / (fact(r) * fact(n - r));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of rows to print
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        sc.close();

        // ---------------- PRINT PASCAL'S TRIANGLE ----------------
        for (int row = 0; row < n; row++) {

            // Print leading spaces for proper alignment
            for (int space = 0; space < n - row; space++) {
                System.out.print(" ");
            }

            // Print values in the current row
            for (int col = 0; col <= row; col++) {
                System.out.print(nCr(row, col) + " ");
            }

            // Move to next row
            System.out.println();
        }
    }
}
