package Recursion2.Subsequences;

/**
 * 📌 Important Notes – Generate Subsequences using Recursion
 *
 * 1. Definition:
 *    - A subsequence of a string is a sequence derived by deleting
 *      zero or more characters, without changing the relative order
 *      of remaining characters.
 *
 *    Example: "abc"
 *      Subsequences → "", "a", "b", "c", "ab", "ac", "bc", "abc"
 *
 * 2. Approach (Recursion):
 *    - For each character, we have two choices:
 *         a) Include the character in the subsequence
 *         b) Exclude the character
 *    - Explore both choices recursively.
 *
 * 3. Base Case:
 *    - If idx == str.length(), print the subsequence formed so far.
 *
 * 4. Number of Subsequences:
 *    - For a string of length n → 2^n subsequences.
 *
 * 5. Time Complexity: O(2^n)
 *    - Each character has 2 choices → total subsequences = 2^n
 *    Space Complexity: O(n)
 *    - Due to recursive call stack.
 */

public class Subsequences {
    public static void subsequences(int idx, String str, String newString) {
        // Base case: reached end of string
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        // Current character
        char currChar = str.charAt(idx);

        // Choice 1: Include current character
        subsequences(idx + 1, str, newString + currChar);

        // Choice 2: Exclude current character
        subsequences(idx + 1, str, newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        subsequences(0, str, "");
    }
}
