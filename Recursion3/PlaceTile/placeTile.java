package Recursion3.PlaceTile;

/**
 * 📌 Important Notes – Tiling Problem (Recursion)
 *
 * 1. Problem:
 *    - You are given a floor of size n × m and tiles of size m × 1.
 *    - You must count the total number of ways to fill the floor completely
 *      using these tiles.
 *    - You can place each tile either:
 *         ➤ Vertically (takes 1 column)
 *         ➤ Horizontally (takes m columns)
 *
 * 2. Base Cases:
 *    - If n < m:
 *         → Only one way (place all tiles vertically).
 *    - If n == m:
 *         → Two ways:
 *              (a) Place all tiles vertically.
 *              (b) Place all tiles horizontally.
 *
 * 3. Recursive Relation:
 *      totalWays(n) = ways when placing vertically + ways when placing horizontally
 *      ➜ f(n) = f(n - m) + f(n - 1)
 *
 *      Where:
 *         - f(n - m): remaining floor when one tile placed horizontally
 *         - f(n - 1): remaining floor when one tile placed vertically
 *
 * 4. Example:
 *      n = 4, m = 2
 *
 *      ➜ Ways = f(4) = f(2) + f(3)
 *      f(2) = 2, f(3) = 3 → total = 5 ways
 *
 * 5. Time Complexity:
 *      - O(2^n) (recursive calls)
 *      - Can be optimized using DP or memoization.
 *
 * 6. Space Complexity:
 *      - O(n) (recursion stack)
 */

public class placeTile {

    // Recursive function to count number of ways to place tiles
    public static int placeTiles(int n, int m) {

        // Base Case 1: Floor smaller than tile
        if (n < m) {
            return 1;
        }

        // Base Case 2: Floor size equal to tile size
        if (n == m) {
            return 2;
        }

        // Place tile vertically → reduce height by 1
        int verticalPlacements = placeTiles(n - 1, m);

        // Place tile horizontally → reduce height by m
        int horizontalPlacements = placeTiles(n - m, m);

        // Total ways = vertical + horizontal
        return verticalPlacements + horizontalPlacements;
    }

    // Driver function
    public static void main(String[] args) {
        int n = 4, m = 2;
        System.out.println("Total ways to place tiles: " + placeTiles(n, m));
    }
}
