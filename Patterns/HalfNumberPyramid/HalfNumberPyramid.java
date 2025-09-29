package Patterns.HalfNumberPyramid;

import java.util.Scanner;

/*
---------------- Example Output ----------------

Input: n = 5

1
12
123
1234
12345

-----------------------------------------------
Explanation:
- Outer loop (i) → controls the number of rows.
- Inner loop (j) → prints numbers from 1 to i.
*/

public class HalfNumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of rows
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        sc.close();

        // Generate Half Number Pyramid
        for (int i = 1; i <= n; i++) {
            // Print numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Move to next line
            System.out.println();
        }
    }
}
