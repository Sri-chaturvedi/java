package BitManipulation.setbit;

/**
 * SetBitExample.java
 *
 * Demonstrates how to set (turn ON) a bit at a given position.
 */
public class SetBitExample {
    public static void main(String[] args) {
        int n = 5; // Binary: 0101
        int pos = 1; // position to set

        int bitmask = 1 << pos;
        int newNumber = bitmask | n;

        System.out.println("Original number: " + n + " (Binary: 0101)");
        System.out.println("After setting bit at position " + pos + " → " + newNumber);
    }
}
