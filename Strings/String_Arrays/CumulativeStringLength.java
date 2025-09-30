package Strings.String_Arrays;

import java.util.Scanner;

/**
 * This program takes an array of strings as input from the user
 * and calculates the cumulative (combined) length of all the strings.
 */
public class CumulativeStringLength {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take size of the array
        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] strings = new String[n];

        // Take input for each string
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = sc.nextLine();
        }

        // Calculate cumulative length using normal for-loop
        int cumulativeLength = 0;
        for (int i = 0; i < strings.length; i++) {
            cumulativeLength += strings[i].length();
        }

        System.out.println("Cumulative length of all strings: " + cumulativeLength);

        sc.close();
    }
}
