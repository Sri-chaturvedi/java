package Recursion2.RemoveDuplicate;

/**
 * 📌 Important Notes – Remove Duplicates from String using Recursion
 *
 * 1. Problem:
 *    - Given a string, remove all duplicate characters while keeping
 *      only the first occurrence of each character.
 *
 * 2. Approach:
 *    - Use a boolean map[26] to track visited characters (only lowercase letters).
 *    - Traverse string recursively:
 *         → If char is already visited, skip it.
 *         → Else, add char to new string and mark visited.
 *
 * 3. Base Case:
 *    - When idx == str.length(), print the final string.
 *
 * 4. Example:
 *    Input:  "aabbcaadaaeebedff"
 *    Output: "abcde f"  (without spaces → "abcdef")
 *
 * 5. Time Complexity: O(n)
 *    - Each character processed once.
 *    Space Complexity: O(n + 26) ≈ O(n)
 *    - Recursion stack + boolean map.
 */

public class RemoveDup {
    // Boolean map to track if a character (a-z) has been seen
    public static boolean[] map = new boolean[26];

    public static void removeDup(String str, int idx, String newString) {
        // Base case: reached end of string
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        // Current character
        char currChar = str.charAt(idx);

        // If already seen → skip
        if (map[currChar - 'a']) {
            removeDup(str, idx + 1, newString);
        } else {
            // Otherwise, include and mark visited
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDup(str, idx + 1, newString);
        }
    }

    public static void main(String[] args) {
        String str = "aabbcaadaaeebedff";
        removeDup(str, 0, "");
    }
}
