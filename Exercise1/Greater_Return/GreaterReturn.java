package Exercise1.Greater_Return;

import java.util.Scanner;

/*
---------------- Example Output ----------------

Input: 5 8
Output: 8

Explanation:
- The method returnGreater takes two integers as input.
- It compares them and returns the greater number.
*/

public class GreaterReturn {

    // Method to return the greater of two numbers
    public static int returnGreater(int a, int b) {
        if (a > b) {
            return a; // a is greater
        } else {
            return b; // b is greater or equal
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        sc.close();

        // Call the method and print the result
        int greater = returnGreater(a, b);
        System.out.println("Greater number is: " + greater);
    }
}
