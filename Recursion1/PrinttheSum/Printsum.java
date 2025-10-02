package Recursion1.PrinttheSum;

/**
 * Program: PrintSum
 * Description: Prints the sum of first n natural numbers using recursion.
 */

public class PrintSum {

    /**
     * Recursively calculates and prints the sum of numbers from i to n.
     *
     * @param i   starting number
     * @param n   ending number
     * @param sum accumulated sum
     */
    public static void printTheSum(int i, int n, int sum) {
        if (i > n) {  // Base case: all numbers added
            System.out.println("Sum of first " + n + " natural numbers: " + sum);
            return;
        }
        printTheSum(i + 1, n, sum + i);  // Recursive call with updated sum
    }

    public static void main(String[] args) {
        int n = 7;  // Change n to sum first 'n' numbers
        printTheSum(1, n, 0);
    }
}

/*
Notes:
- Base Case: i > n → stops recursion and prints sum.
- Recursive Case: Calls printTheSum(i+1, n, sum+i) until all numbers are added.
- Time & Space Complexity: O(n)
*/