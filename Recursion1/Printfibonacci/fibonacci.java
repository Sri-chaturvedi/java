package Recursion1.Printfibonacci;

/**
 * Program: Fibonacci
 * Description: Prints the first 'n' numbers of the Fibonacci sequence using recursion.
 */

public class Fibonacci {

    /**
     * Recursively prints the next 'n' Fibonacci numbers.
     *
     * @param a current Fibonacci number
     * @param b next Fibonacci number
     * @param n how many more numbers to print
     */
    public static void printFibonacci(int a, int b, int n) {
        if (n == 0) {  // Base case: no more numbers to print
            return;
        }
        int c = a + b;
        System.out.println(c);
        printFibonacci(b, c, n - 1);  // Recursive call for remaining numbers
    }

    public static void main(String[] args) {
        int a = 0, b = 1;  // First two Fibonacci numbers
        int n = 7;         // Total numbers to print

        System.out.println("Fibonacci sequence:");
        System.out.println(a);
        System.out.println(b);

        printFibonacci(a, b, n - 2);  // n-2 because first two numbers are already printed
    }
}

/*
Notes:
- Base Case: n == 0 → stops recursion.
- Recursive Case: prints next Fibonacci number and decrements n.
- Complexity: O(n) time & O(n) space due to recursion stack.
*/
