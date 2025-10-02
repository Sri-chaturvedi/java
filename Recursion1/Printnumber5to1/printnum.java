package Recursion1.Printnumber5to1;

import java.util.Scanner;

/**
 * Program Name: PrintNum
 * Description: This program demonstrates the use of recursion to print numbers from a given number down to 1.
 /*
======================== Important Notes ========================
1. Recursion Basics:
   - Every recursive function must have a base case to prevent infinite recursion.
   - Recursive call should move towards the base case.

2. Time & Space Complexity:
   - Time Complexity: O(n) → The function is called 'n' times.
   - Space Complexity: O(n) → Due to the recursion stack.

3. Advantages of Recursion:
   - Simple and clean code for problems like factorial, Fibonacci, tree traversal, etc.
   
4. Disadvantages:
   - Higher memory usage due to recursion stack.
   - May lead to StackOverflowError for very large 'n'.

5. Key Tip:
   - Always ensure that the recursive call progresses towards the base case to avoid infinite recursion.
==================================================================
*/

 /* Key Concept: Recursion
 * - Recursion is a process in which a method calls itself to solve a problem.
 * - Base Case: Condition under which the recursion stops.
 * - Recursive Case: The part where the method calls itself.
 */

public class PrintNum {

    /**
     * Recursive method to print numbers from n down to 1.
     *
     * @param n the starting number
     */
    public static void printNum(int n) {
        // Base Case: Stop recursion when n reaches 0
        if (n == 0) {
            return;
        }

        // Print current number
        System.out.println(n);

        // Recursive Call: Move towards the base case
        printNum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to print from: ");
        int n = sc.nextInt();  // User input for flexibility

        System.out.println("Printing numbers from " + n + " to 1:");
        printNum(n);  // Call recursive method

        sc.close();
    }
}
