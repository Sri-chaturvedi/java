package BitManipulation.Number_System_Conversion;

import java.util.Scanner;

/**
 * NumberSystemConversion.java
 *
 * Demonstrates conversion between Decimal and Binary using
 * two functions:
 *   1. decimalToBinary(int n) -> String
 *   2. binaryToDecimal(String binary) -> int
 *
 * Includes both:
 *   - Built-in Java methods
 *   - Manual logic (for learning purpose)
 */
public class NumberSystemConversion {

    /**
     * Converts a decimal number to its binary representation (built-in method).
     *
     * @param n decimal number
     * @return binary string
     */
    public static String decimalToBinary(int n) {
        return Integer.toBinaryString(n); // shortcut method
    }

    /**
     * Converts a binary string to its decimal value (built-in method).
     *
     * @param binary binary string (e.g. "1011")
     * @return decimal integer
     */
    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2); // radix = 2 for binary
    }

    /**
     * Manual method: Converts decimal to binary without using built-in functions.
     *
     * @param n decimal number
     * @return binary string
     */
    public static String decimalToBinaryManual(int n) {
        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            int remainder = n % 2;      // get last binary digit
            binary.insert(0, remainder); // add digit at the front
            n = n / 2;                  // divide number by 2
        }
        return binary.toString();
    }

    /**
     * Manual method: Converts binary string to decimal without using built-in functions.
     *
     * @param binary binary string
     * @return decimal integer
     */
    public static int binaryToDecimalManual(String binary) {
        int decimal = 0;
        int power = 1; // 2^0 initially

        // Traverse from right to left
        for (int i = binary.length() - 1; i >= 0; i--) {
            char bit = binary.charAt(i);
            if (bit == '1') {
                decimal += power; // add 2^position if bit is 1
            }
            power *= 2; // move to next power of 2
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Decimal → Binary
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        System.out.println("Binary (built-in) : " + decimalToBinary(decimal));
        System.out.println("Binary (manual)   : " + decimalToBinaryManual(decimal));

        // Binary → Decimal
        System.out.print("\nEnter a binary number: ");
        String binaryInput = sc.next();
        System.out.println("Decimal (built-in): " + binaryToDecimal(binaryInput));
        System.out.println("Decimal (manual)  : " + binaryToDecimalManual(binaryInput));

        sc.close();
    }
}
