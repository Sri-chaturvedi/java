

/**
 * GetBitExample.java
 *
 * Demonstrates how to check if a bit at a specific position is 0 or 1.
 */
public class GetBitExample {
    public static void main(String[] args) {
        int n = 5; // Binary: 0101
        int pos = 2; // position to check (0-based index)

        int bitmask = 1 << pos;

        if ((bitmask & n) == 0) {
            System.out.println("Bit at position " + pos + " was 0");
        } else {
            System.out.println("Bit at position " + pos + " was 1");
        }
    }
}

