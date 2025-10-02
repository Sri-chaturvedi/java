package Recursion1.Printnumber1to5;

/**
 * Program: PrintNum
 * Description: Prints numbers from 1 to 5 using recursion.
 */

public class PrintNum {

    /**
     * Recursively prints numbers from n to 5.
     *
     * @param n starting number
     */
    public static void printNum(int n) {
        if (n > 5) {  // Base case: stop recursion
            return;
        }
        System.out.println(n);
        printNum(n + 1);  // Recursive call
    }

    public static void main(String[] args) {
        int n = 1;  // Start number
        System.out.println("Numbers from 1 to 5:");
        printNum(n);
    }
}

/*
Notes:
- Base Case: Stops recursion when n > 5.
- Recursive Case: Calls printNum(n + 1) until base case is reached.
- Complexity: O(n) time & O(n) space (recursion stack).
*/
