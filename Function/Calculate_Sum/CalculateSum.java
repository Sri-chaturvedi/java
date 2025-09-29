package Function.Calculate_Sum;

import java.util.Scanner;

/*
---------------- Example Output ----------------

Input: 
5 7
Output:
Sum of 2 numbers is: 12

-----------------------------------------------
Explanation:
- The method calculateSum takes two integers as parameters.
- It calculates their sum and returns it.
- The main method reads two integers from the user and calls calculateSum().
*/

public class CalculateSum {

    // Method to calculate the sum of two numbers
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum; // Return the sum to the caller
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        sc.close();

        // Call the method and store the result
        int sum = calculateSum(a, b);

        // Print the result
        System.out.println("Sum of 2 numbers is: " + sum);
    }
}
