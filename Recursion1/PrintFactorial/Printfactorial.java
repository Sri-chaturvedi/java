package Recursion1.PrintFactorial;

/**
 * Program: PrintFactorial
 * Description: Prints the factorial of a given number using recursion.
 */

public class PrintFactorial {

    /**
     * Recursively calculates and prints the factorial of n.
     *
     * @param n    number to calculate factorial for
     * @param fact accumulated factorial value
     */
    public static void printFact(int n, int fact) {
        if (n == 0) {  // Base case: factorial of 0 reached
            System.out.println("Factorial: " + fact);
            return;
        }
        printFact(n - 1, fact * n);  // Recursive call with updated factorial
    }

    public static void main(String[] args) {
        int n = 5;  // Change this value to calculate factorial of a different number
        printFact(n, 1);
    }
}

/*
Notes:
- Base Case: n == 0 → stops recursion and prints factorial.
- Recursive Case: multiply current n with accumulated factorial and call for n-1.
- Time & Space Complexity: O(n)
*/
