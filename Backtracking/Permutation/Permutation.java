package Backtracking.Permutation;

/**
 * 📌 Important Notes – Permutations using Backtracking
 *
 * 1. Problem:
 *    - Given a string, print all possible permutations (arrangements) of its characters.
 *
 * 2. Concept:
 *    - Each position can take one of the remaining characters.
 *    - At each recursive level, we:
 *        ➤ Pick one character
 *        ➤ Recur for the remaining string
 *        ➤ Backtrack to explore all possibilities
 *
 * 3. Base Case:
 *      If str.length() == 0 → print the permutation (perm)
 *
 * 4. Recursive Logic:
 *      For every index i in the string:
 *         - Take the current character `currChar = str.charAt(i)`
 *         - Remaining string = str.substring(0, i) + str.substring(i + 1)
 *         - Recurse with newStr and perm + currChar
 *
 * 5. Example:
 *      Input: "ABC"
 *      Output:
 *         ABC
 *         ACB
 *         BAC
 *         BCA
 *         CAB
 *         CBA
 *
 * 6. Time Complexity:
 *      - O(n!) → total permutations
 * 7. Space Complexity:
 *      - O(n) → recursion depth
 */

public class Permutation {

    // Recursive function to print all permutations
    public static void printPermutation(String str, String perm, int idx) {

        // Base Case: when no characters are left
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }

        // Loop through the string and pick each character once
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);

            // Remaining string after removing currChar
            String newStr = str.substring(0, i) + str.substring(i + 1);

            // Recur for the remaining string (no need to modify idx)
            printPermutation(newStr, perm + currChar, idx + 1);
        }
    }

    // Driver function
    public static void main(String[] args) {
        String str = "ABC";
        printPermutation(str, "", 0);
    }
}
