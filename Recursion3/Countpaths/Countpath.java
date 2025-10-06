package Recursion3.Countpaths;

/**
 * 📌 Important Notes – Count Paths in a Grid (Recursion)
 *
 * 1. Problem:
 *    - Count the total number of unique paths from the top-left cell (0,0)
 *      to the bottom-right cell (n-1, m-1) in an n×m grid.
 *    - You can only move:
 *         ➡ Right  (j + 1)
 *         ⬇ Down   (i + 1)
 *
 * 2. Base Cases:
 *    - If we reach the destination (i == n-1 && j == m-1):
 *         → return 1  (1 valid path found)
 *    - If we move out of the grid (i == n || j == m):
 *         → return 0  (no valid path)
 *
 * 3. Recursive Relation:
 *    - Total paths from current cell =
 *         paths by moving right + paths by moving down
 *      ➜ countPaths(i, j) = countPaths(i+1, j) + countPaths(i, j+1)
 *
 * 4. Example:
 *      Grid: 3 x 4
 *      Output: 10 total paths
 *
 *      Possible movement grid visualization:
 *      (0,0) → (0,1) → (0,2) → ... → (2,3)
 *
 * 5. Time Complexity:
 *      - O(2^(n+m)) → exponential (many overlapping subproblems)
 *      - Can be optimized using DP or combinatorics: C(n+m-2, n-1)
 *
 * 6. Space Complexity:
 *      - O(n+m) → due to recursion depth
 *
 * 🧠 Formula (Combinatorial Shortcut):
 *    Total unique paths = (n+m-2)! / ((n-1)! * (m-1)!)
 *    Example: 3x4 grid → (5)! / (2! * 3!) = 10
 */

public class Countpath {

    // Recursive function to count total paths
    public static int countPaths(int i, int j, int n, int m) {
        // Base Case 1: Out of bounds
        if (i == n || j == m) {
            return 0;
        }

        // Base Case 2: Reached destination
        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        // Move downwards
        int downPaths = countPaths(i + 1, j, n, m);

        // Move rightwards
        int rightPaths = countPaths(i, j + 1, n, m);

        // Total possible paths
        return downPaths + rightPaths;
    }

    // Driver function
    public static void main(String[] args) {
        int n = 3, m = 4;
        int totalPaths = countPaths(0, 0, n, m);
        System.out.println("Total Paths: " + totalPaths);
    }
}