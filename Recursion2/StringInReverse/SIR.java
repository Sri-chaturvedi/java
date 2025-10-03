package Recursion2.StringInReverse;

/**
 * 📌 Important Notes – Print String in Reverse using Recursion
 *
 * 1. The idea is to print characters from the last index to the first.
 *    - Start from str.length() - 1
 *    - Move backward until index 0
 *
 * 2. Base Case:
 *    - When index = 0, print the first character and return.
 *
 * 3. Recursive Case:
 *    - Print the current character.
 *    - Call the function again with (idx - 1).
 *
 * 4. Example:
 *    Input: "abcd"
 *    Output: "dcba"
 *
 * 5. Time Complexity: O(n)
 *    - Each character is visited once.
 *    Space Complexity: O(n)
 *    - Due to recursive call stack.
 */

public class SIR {
    public static void printRev(String str, int idx) {
        // Base case
        if (idx == 0) {
            System.out.print(str.charAt(idx)); // ✅ changed println → print
            return;
        }

        // Print current character
        System.out.print(str.charAt(idx));

        // Recursive call for remaining string
        printRev(str, idx - 1);
    }

    public static void main(String[] args) {
        String str = "abcd";
        printRev(str, str.length() - 1);
    }
}
