package BitManipulation.updatebit;

import java.util.Scanner;

/**
 * UpdateBitExample.java
 *
 * Demonstrates how to update a bit at a given position:
 *  - oper = 1 → set the bit
 *  - oper = 0 → clear the bit
 */
public class UpdateBitExample{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5; // Binary: 0101
        int pos = 1; // position to update

        System.out.print("Enter operation (1 = Set, 0 = Clear): ");
        int oper = sc.nextInt();

        int bitmask = 1 << pos;

        if (oper == 1) {
            // Set the bit
            int newNumber = bitmask | n;
            System.out.println("After setting bit at position " + pos + " → " + newNumber);
        } else {
            // Clear the bit
            int newBitmask = ~bitmask;
            int newNumber = newBitmask & n;
            System.out.println("After clearing bit at position " + pos + " → " + newNumber);
        }

        sc.close();
    }
}
