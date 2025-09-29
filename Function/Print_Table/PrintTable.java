package Function.Print_Table;

import java.util.Scanner;

/*
---------------- Example Output ----------------

Input: 5

Output:
Table of 5:
5 * 0 = 0
5 * 1 = 5
5 * 2 = 10
...
5 * 10 = 50

-----------------------------------------------
Explanation:
- The method printTable takes a number 'n' and prints its multiplication table from 0 to 10.
- The method does not return anything, it only prints the table.
*/

public class PrintTable {

    // Method to print multiplication table
    public static void printTable(int n) {
        System.out.println("Table of " + n + ":");
        for (int i = 0; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        // Call the method to print the table
        printTable(n);
    }
}
