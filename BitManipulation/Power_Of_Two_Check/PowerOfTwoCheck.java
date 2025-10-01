package BitManipulation.Power_Of_Two_Check;

import java.util.Scanner;

/**
 * PowerOfTwoCheck.java
 *
 * This program checks whether a given number is a power of 2 using bit manipulation.
 *
 * Concept:
 * - A number that is a power of 2 has only ONE bit set in its binary representation.
 *   Example:
 *      1 -> 0001 (power of 2)
 *      2 -> 0010 (power of 2)
 *      4 -> 0100 (power of 2)
 *      5 -> 0101 (not a power of 2, has 2 bits set)
 *
 * - Formula:
 *   If n > 0 and (n & (n - 1)) == 0 → n is a power of 2
 */
public class PowerOfTwoCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check if power of 2
        if (n > 0 && (n & (n - 1)) == 0) {
            System.out.println(n + " is a power of 2 ✅");
        } else {
            System.out.println(n + " is NOT a power of 2 ❌");
        }

        sc.close();
    }
}
