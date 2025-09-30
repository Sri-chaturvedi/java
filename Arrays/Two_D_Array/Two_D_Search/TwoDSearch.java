/*
📌 Question:
Write a Java program to search for an element in a 2D array (matrix).
- The program should take the number of rows and columns as input.
- Then it should take all elements of the 2D array as input.
- After that, take a number 'x' as input.
- The program should search for 'x' inside the matrix.
- If found, print the index (row, column) where it occurs.
- If not found, print "x not found in the matrix."

Example:
Input:
3 3
1 2 3
4 5 6
7 8 9
5

Output:
5 found at index (1, 1)
*/

package Arrays.Two_D_Search;

import java.util.Scanner;

public class TwoDSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();

        // Declare matrix
        int[][] matrix = new int[rows][columns];

        // Input matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Input element to search
        System.out.print("Enter the number to search: ");
        int x = sc.nextInt();

        // Flag to check if found
        boolean found = false;

        // Search in the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == x) {
                    System.out.println("✅ " + x + " found at index (" + i + ", " + j + ")");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("❌ " + x + " not found in the matrix.");
        }
    }
}
