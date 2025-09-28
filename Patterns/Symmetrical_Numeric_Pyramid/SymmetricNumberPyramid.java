package Patterns.Symmetrical_Numeric_Pyramid;

import java.util.Scanner;

/*
Example output for input 5:

Enter number of rows: 5
        1 
      2 1 2 
    3 2 1 2 3 
  4 3 2 1 2 3 4 
5 4 3 2 1 2 3 4 5 

Explanation:
- Prints a pyramid where each row prints descending numbers from i to 1,
  then ascending numbers from 2 to i, forming a symmetric numeric pyramid.
- Leading spaces in each row align the pyramid centrally.
*/

public class SymmetricNumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter number of rows
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        // Loop through each row from 1 to n
        for (int i = 1; i <= n; i++) {

            // Print leading spaces for alignment
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print descending numbers from i down to 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Print ascending numbers from 2 up to i
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Move to next row
            System.out.println();
        }

        sc.close();
    }
}
