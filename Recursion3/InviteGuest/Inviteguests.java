package Recursion3.InviteGuest;

/**
 * 📌 Important Notes – Friends Pairing Problem (Invite Guests)
 *
 * 1. Problem:
 *    - There are `n` guests.
 *    - Each guest can either:
 *        ➤ come alone, OR
 *        ➤ come as a pair with any other guest.
 *    - You need to find the total number of ways to invite all guests.
 *
 * 2. Base Cases:
 *    - If n == 1 → only 1 way (the guest comes alone)
 *    - If n == 0 → 1 way (no guest)
 *
 * 3. Recursive Relation:
 *      For each guest, we have two choices:
 *        ➤ Choice 1: Come alone → f(n-1)
 *        ➤ Choice 2: Pair up with (n-1) others → (n-1) * f(n-2)
 *
 *      ✅ Total ways:
 *         f(n) = f(n - 1) + (n - 1) * f(n - 2)
 *
 * 4. Example:
 *      For n = 3:
 *          → f(3) = f(2) + 2 * f(1)
 *                 = 2 + 2*1 = 4 ways
 *
 * 5. Time Complexity:
 *      - O(2^n) (recursive)
 *      - Can be optimized using DP or memoization to O(n)
 *
 * 6. Space Complexity:
 *      - O(n) (recursion stack)
 *
 * 🧠 Tip:
 *    This is similar to Fibonacci logic, but each term is weighted by (n-1).
 */

public class Inviteguests {

    // Recursive function to count total ways to invite guests
    public static int callGuest(int n) {
        // Base Case: no guest or single guest
        if (n <= 1) {
            return 1;
        }

        // Option 1 → guest comes alone
        int ways1 = callGuest(n - 1);

        // Option 2 → guest pairs up with any of (n-1) others
        int ways2 = (n - 1) * callGuest(n - 2);

        // Total ways = single + pair
        return ways1 + ways2;
    }

    // Driver function
    public static void main(String[] args) {
        int n = 4;
        System.out.println("Total ways to invite " + n + " guests: " + callGuest(n));
    }
}
