package BitManipulation.Toggle_Bit;

import java.util.Scanner;

/**
 * ToggleBitExample.java
 *
 * A program to toggle (flip) a bit at a given position in a number.
 * 
 * Toggle means:
 *   - If the bit is 0 → change it to 1
 *   - If the bit is 1 → change it to 0
 *
 * Example:
 *   Input: n = 5 (binary 0101), pos = 1
 *   Output: 7 (binary 0111)
 */
public class ToggleBitExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Input position
        System.out.print("Enter bit position to toggle: ");
        int pos = sc.nextInt();

        // Step 1: Create bitmask by left-shifting 1
        int bitmask = 1 << pos;

        // Step 2: Toggle using XOR
        int newNumber = n ^ bitmask;

        // Output
        System.out.println("\n--- Result ---");
        System.out.println("Original number (decimal): " + n);
        System.out.println("Original number (binary) : " + Integer.toBinaryString(n));
        System.out.println("After toggling at pos " + pos + " => " + newNumber);
        System.out.println("New number (binary)      : " + Integer.toBinaryString(newNumber));

        sc.close();
    }
}
