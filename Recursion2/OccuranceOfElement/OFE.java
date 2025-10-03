package Recursion2.OccuranceOfElement;

/**
 * 📌 Important Notes – Find First & Last Occurrence of Character using Recursion
 *
 * 1. Problem Statement:
 *    - Given a string and a character, find the first and last index where the character occurs.
 *
 * 2. Approach (Recursive):
 *    - Traverse the string recursively using index (idx).
 *    - If current character matches the target element:
 *         → If 'first' is -1, set 'first = idx'
 *         → Otherwise, update 'last = idx'
 *    - Continue until idx reaches the end of string.
 *
 * 3. Base Case:
 *    - When idx == str.length(), recursion ends and results are printed.
 *
 * 4. Example:
 *    Input: str = "abcaadbaj", element = 'a'
 *    Output:
 *       First occurrence = 0
 *       Last occurrence  = 8
 *
 * 5. Time Complexity: O(n)   (we check each character once)
 *    Space Complexity: O(n)  (recursion call stack)
 */

public class OFE {
    public static int first = -1;  // store first index
    public static int last = -1;   // store last index

    public static void findOccurance(String str, int idx, char element) {
        // Base case: end of string reached
        if (idx == str.length()) {
            System.out.println("First occurrence = " + first);
            System.out.println("Last occurrence  = " + last);
            return;
        }

        // Current character
        char currChar = str.charAt(idx);

        // If character matches the element
        if (currChar == element) {
            if (first == -1) {
                first = idx;   // first occurrence found
            } else {
                last = idx;    // update last occurrence
            }
        }

        // Recursive call for next character
        findOccurance(str, idx + 1, element);
    }

    public static void main(String[] args) {
        findOccurance("abcaadbaj", 0, 'a');
    }
}
