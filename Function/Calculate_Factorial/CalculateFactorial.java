package Function.Calculate_Factorial;

import java.util.Scanner;

/*
---------------- Example Output ----------------

Input: 5
Output:
Factorial of 5 is: 120

Input: -3
Output:
Invalid number

-----------------------------------------------
Explanation:
- The method calculateFactorial calculates the factorial of a non-negative integer.
- For negative numbers, it returns -1 and prints "Invalid Number".
- Factorial formula: n! = 1*2*3*...*n
*/

public class CalculateFactorial {

    // Method to calculate factorial
    public static int calculateFactorial(int n) {
        if (n < 0) {
            System.out.println("Invalid Number");
            return -1; // return -1 for invalid input
        }

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i; // multiply factorial with current number
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        // Call the method
        int factorial = calculateFactorial(n);

        if (factorial != -1) {
            System.out.println("Factorial of " + n + " is: " + factorial);
        }
    }
}
