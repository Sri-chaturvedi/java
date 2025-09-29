package Patterns.Inverted_Half_Number_Pyramid;

import java.util.Scanner;

/*
---------------- Example Output ----------------

Input: n = 5

11111
2222
333
44
5

-----------------------------------------------
Explanation:
- Outer loop (i) → controls the row number (also the number to print).
- Inner loop (j) → prints the same number 'i' (n - i + 1) times.
*/

public class InvertedHalfNumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of rows
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        sc.close();

        // Generate Inverted Half Number Pyramid with same numbers
        for (int i = 1; i <= n; i++) {
            // Print the number 'i' (n - i + 1) times
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
