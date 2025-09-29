package Function.Multiply_Numbers;

import java.util.Scanner;

/*
---------------- Example Output ----------------

Input: 
5 7
Output:
Multiplication of 5 and 7 is: 35

-----------------------------------------------
Explanation:
- The method calculateProduct takes two integers as parameters.
- It calculates their product and returns it.
- The main method reads two integers from the user and calls calculateProduct().
*/

public class MultiplyNumbers {

    // Method to calculate the product of two numbers
    public static int calculateProduct(int a, int b) {
        int product = a * b;
        return product; // Return the result to the caller
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        sc.close();

        // Call the method and store the result
        int multiply = calculateProduct(a, b);

        // Print the result
        System.out.println("Multiplication of " + a + " and " + b + " is: " + multiply);
    }
}
