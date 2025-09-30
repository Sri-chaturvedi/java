/*
📌 Question:
Write a Java program to take input of a 2D array (matrix) from the user 
and print it in matrix form.

- The program should first take the number of rows and columns.
- Then it should take elements row by row.
- Finally, print the 2D array in a matrix format.

Example:
Input:
2 3
1 2 3
4 5 6

Output:
1 2 3
4 5 6
*/

package Arrays.Two_D_Array.Two_D_Arrays;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Declare a 2D array
        int[][] numbers = new int[rows][cols];

        // Input array elements
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        // Print the 2D array in matrix format
        System.out.println("The 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println(); // move to next line after each row
        }
    }
}
