package Recursion3.Findsubset;

import java.util.ArrayList;

/**
 * 📌 Important Notes – Find All Subsets (Recursion)
 *
 * 1. Problem:
 *    - Print all possible subsets of numbers from 1 to n.
 *    - Each element can either be:
 *         ➤ Included in the subset
 *         ➤ Excluded from the subset
 *
 * 2. Concept:
 *    - This is a **power set** generation problem.
 *    - Total subsets = 2ⁿ (each number has 2 choices → include/exclude)
 *
 * 3. Recursive Relation:
 *      For a number `n`:
 *         - Include `n` → findSubsets(n-1, subset)
 *         - Exclude `n` → findSubsets(n-1, subset)
 *
 *      ✅ Steps:
 *        - If n == 0 → print current subset
 *        - Else:
 *            1️⃣ Add n to subset → call for (n-1)
 *            2️⃣ Remove n → call for (n-1)
 *
 * 4. Example:
 *      n = 3
 *      Subsets:
 *      []
 *      [1]
 *      [2]
 *      [3]
 *      [1, 2]
 *      [1, 3]
 *      [2, 3]
 *      [1, 2, 3]
 *
 * 5. Time Complexity:
 *      - O(2ⁿ)
 * 6. Space Complexity:
 *      - O(n) (recursion + subset storage)
 */

public class findSubset {

    // Function to print the subset
    public static void printSubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    // Recursive function to generate all subsets
    public static void findSubsets(int n, ArrayList<Integer> subset) {

        // Base Case
        if (n == 0) {
            printSubset(subset);
            return;
        }

        // ✅ Include current element (n)
        subset.add(n);
        findSubsets(n - 1, subset);

        // ❌ Exclude current element (backtrack)
        subset.remove(subset.size() - 1);
        findSubsets(n - 1, subset);
    }

    // Driver function
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);
    }
}
