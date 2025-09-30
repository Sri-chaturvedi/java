/*
📌 Question:
Write a Java program to print a 2D array (matrix) in spiral order.

Requirements:
1. Take the number of rows and columns as input from the user.
2. Take all elements of the 2D array as input.
3. Print the elements in spiral order starting from the top-left corner and moving clockwise.

Example:
Input:
3 3
1 2 3
4 5 6
7 8 9

Output:
Spiral Order: 1 2 3 6 9 8 7 4 5
*/

package Arrays.Spiral_Order;

import java.util.Scanner;

public class SpiralOrder {
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
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Initialize boundaries
        int top = 0, bottom = rows - 1;
        int left = 0, right = columns - 1;

        System.out.print("Spiral Order: ");

        // Loop until all elements are printed
        while (top <= bottom && left <= right) {
            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            // Traverse from top to bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // Traverse from right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            // Traverse from bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }
}
