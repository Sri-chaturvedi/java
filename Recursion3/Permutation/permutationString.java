package Recursion3.Permutation;

/**
 * 📌 Important Notes – String Permutations using Recursion
 *
 * 1. Problem:
 *    - Print all possible permutations of a given string.
 *    - Example: For "abc" → "abc", "acb", "bac", "bca", "cab", "cba".
 *
 * 2. Approach:
 *    - Pick each character one by one.
 *    - Remove it from the string and recursively find permutations
 *      of the remaining substring.
 *    - Append the picked character to the current permutation.
 *
 * 3. Base Case:
 *    - When the input string becomes empty (length = 0),
 *      print the accumulated permutation.
 *
 * 4. Formula (Number of permutations):
 *    - For a string of length n → total permutations = n!
 *
 * 5. Time Complexity:
 *    - O(n × n!) → because for each recursive call,
 *      a new string is formed and printed.
 *
 * 6. Space Complexity:
 *    - O(n) → recursion depth.
 *
 * 7. Example:
 *    Input: "abc"
 *    Output:
 *      abc
 *      acb
 *      bac
 *      bca
 *      cab
 *      cba
 */

public class permutationString {

    // Recursive function to print all permutations of a string
    public static void printPerm(String str, String permutation) {
        // Base case: all characters used
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }

        // Recursive case: pick each character
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);

            // Exclude current character and form the remaining substring
            String newStr = str.substring(0, i) + str.substring(i + 1);

            // Recursive call with reduced string and updated permutation
            printPerm(newStr, permutation + currChar);
        }
    }

    // Driver function
    public static void main(String[] args) {
        String str = "abc";
        printPerm(str, "");
    }
}
