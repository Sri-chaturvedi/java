package BitManipulation.clearbit;

/**
 * ClearBitExample.java
 *
 * Demonstrates how to clear (turn OFF) a bit at a given position.
 */
public class ClearBitExample {
    public static void main(String[] args) {
        int n = 5; // Binary: 0101
        int pos = 2; // position to clear

        int bitmask = 1 << pos;
        int notBitmask = ~bitmask;
        int newNumber = notBitmask & n;

        System.out.println("Original number: " + n + " (Binary: 0101)");
        System.out.println("After clearing bit at position " + pos + " → " + newNumber);
    }
}

