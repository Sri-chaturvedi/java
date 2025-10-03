package Recursion2.MoveAllX;

/**
 * 📌 Important Notes – Move All 'x' to the End using Recursion
 *
 * 1. Problem:
 *    - Given a string, move all occurrences of 'x' to the end
 *      while maintaining the relative order of other characters.
 *
 * 2. Approach:
 *    - Traverse string character by character.
 *    - If char == 'x' → increase count, don’t add to new string.
 *    - Else → add char to new string.
 *    - At the end, append 'x' count times.
 *
 * 3. Base Case:
 *    - When idx == str.length(), append all remaining 'x' and print result.
 *
 * 4. Example:
 *    Input:  "axbxxcxd"
 *    Output: "abcdxxxx"
 *
 * 5. Time Complexity: O(n)
 *    - Every character is visited once.
 *    Space Complexity: O(n)
 *    - Due to recursion + new string building.
 */

public class MoveAllX {
    public static void moveAllx(String str, int idx, int count, String newString) {
        // Base case
        if (idx == str.length()) {
            // Append all 'x' at the end
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }

        // Current character
        char currChar = str.charAt(idx);

        // If 'x', increment count
        if (currChar == 'x') {
            moveAllx(str, idx + 1, count + 1, newString);
        } 
        // Else, add to new string
        else {
            moveAllx(str, idx + 1, count, newString + currChar);
        }
    }

    public static void main(String[] args) {
        String str = "axbxxcxd";
        moveAllx(str, 0, 0, "");
    }
}
