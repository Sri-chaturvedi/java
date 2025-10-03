package Recursion2.UniqueSubsequences;

import java.util.HashSet;

/**
 * 📌 Important Notes – Unique Subsequences using Recursion
 *
 * 1. Definition:
 *    - A subsequence is a sequence formed by deleting zero or more characters
 *      from the original string without changing the relative order.
 *    - Example: For "aaa", subsequences include "", "a", "aa", "aaa".
 *      But duplicates must be avoided → Unique subsequences = {"", "a", "aa", "aaa"}.
 *
 * 2. Approach:
 *    - Use recursion to explore two choices for each character:
 *         a) Include the character
 *         b) Exclude the character
 *    - Use a HashSet to store subsequences (ensures uniqueness).
 *
 * 3. Base Case:
 *    - When idx == str.length(), check if newString is already in set:
 *         → If not, print it and add to set.
 *
 * 4. Example:
 *    Input: "aaa"
 *    Output: "", "a", "aa", "aaa"
 *
 * 5. Number of Unique Subsequences:
 *    - At most 2^n subsequences (if all characters are unique).
 *    - HashSet ensures duplicates are removed.
 *
 * 6. Time Complexity: O(2^n)
 *    - Each character has 2 choices → total subsequences explored = 2^n.
 *    Space Complexity: O(2^n) (for storing subsequences in HashSet).
 */

public class USubsequences {
    public static void uniqueSubsequences(String str, int idx, String newString, HashSet<String> set) {
        // Base case: reached end of string
        if (idx == str.length()) {
            if (!set.contains(newString)) {
                System.out.println(newString);
                set.add(newString);
            }
            return;
        }

        char currChar = str.charAt(idx);

        // Choice 1: Include current character
        uniqueSubsequences(str, idx + 1, newString + currChar, set);

        // Choice 2: Exclude current character
        uniqueSubsequences(str, idx + 1, newString, set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        uniqueSubsequences(str, 0, "", set);
    }
}
