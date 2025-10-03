package Recursion2.KeypadCombination;

/**
 * 📌 Important Notes – Keypad Combination using Recursion
 *
 * 1. Problem:
 *    - Given a string of digits (0–9), print all possible letter combinations
 *      based on a mobile keypad mapping.
 *
 * 2. Mapping:
 *    0 -> "."
 *    1 -> "abc"
 *    2 -> "def"
 *    3 -> "ghi"
 *    4 -> "jkl"
 *    5 -> "mno"
 *    6 -> "pqrs"
 *    7 -> "tu"
 *    8 -> "vwx"
 *    9 -> "yz"
 *
 * 3. Approach:
 *    - At each digit, map it to corresponding letters.
 *    - For each letter, recursively generate combinations with the rest of the digits.
 *
 * 4. Base Case:
 *    - If idx == str.length(), print the current combination.
 *
 * 5. Example:
 *    Input: "23"
 *    Output: dg, dh, di, eg, eh, ei, fg, fh, fi
 *
 * 6. Time Complexity: O(k^n)
 *    - n = length of digit string
 *    - k = average number of letters per digit
 *    Space Complexity: O(n) (recursion depth)
 */

public class keypadCom {
    // Keypad digit → letters mapping
    public static String[] keypad = {
        ".",    // 0
        "abc",  // 1
        "def",  // 2
        "ghi",  // 3
        "jkl",  // 4
        "mno",  // 5
        "pqrs", // 6
        "tu",   // 7
        "vwx",  // 8
        "yz"    // 9
    };

    // Recursive function to print combinations
    public static void printComb(int idx, String str, String combination) {
        // Base case: full digit string processed
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }

        // Current digit
        char currChar = str.charAt(idx);

        // Get corresponding letters from keypad mapping
        String mapping = keypad[currChar - '0'];

        // Try all possibilities
        for (int i = 0; i < mapping.length(); i++) {
            printComb(idx + 1, str, combination + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "23"; // Example input
        printComb(0, str, "");
    }
}
