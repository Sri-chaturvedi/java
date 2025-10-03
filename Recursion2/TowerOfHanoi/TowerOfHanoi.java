package Recursion2.TowerOfHanoi;

/**
 * 📌 Important Notes – Tower of Hanoi Problem
 *
 * 1. Tower of Hanoi is a **classic recursion problem**.
 * 2. Rules of the game:
 *    - Only one disk can be moved at a time.
 *    - A disk can only be placed on top of a larger disk (never on a smaller one).
 *    - All disks start on the Source rod and must end up on the Destination rod.
 *
 * 3. Recurrence relation:
 *    - To move `n` disks from Source → Destination:
 *         Step 1: Move (n-1) disks Source → Helper
 *         Step 2: Move 1 disk (largest) Source → Destination
 *         Step 3: Move (n-1) disks Helper → Destination
 *
 * 4. Minimum number of moves required = 2^n – 1
 *    Example: For n = 3 → 2³ - 1 = 7 moves.
 *
 * 5. Time Complexity = O(2^n)
 *    - The number of recursive calls grows exponentially.
 *
 * ✅ This program demonstrates how recursion is used to break a large problem
 *    into smaller subproblems until the base case (n = 1).
 */

public class TowerOfHanoi {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        // Base case
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }

        // Move (n-1) disks from src → helper
        towerOfHanoi(n - 1, src, dest, helper);

        // Move nth disk from src → dest
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);

        // Move (n-1) disks from helper → dest
        towerOfHanoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 5; // Number of disks
        towerOfHanoi(n, "S", "H", "D");
    }
}
