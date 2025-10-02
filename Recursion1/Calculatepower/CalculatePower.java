package Recursion1.Calculatepower;

/**
 * Program: CalculatePower
 * Description: Calculates x^n using recursion.
 */

public class CalculatePower {

    /**
     * Recursively calculates x raised to the power n.
     *
     * @param x base number
     * @param n exponent
     * @return x^n
     */
    public static int calculatePower(int x, int n) {
        if (n == 0) {  // Base case: x^0 = 1
            return 1;
        }
        if (x == 0) {  // Base case: 0^n = 0 (for n > 0)
            return 0;
        }

        // Recursive call: x^n = x * x^(n-1)
        return x * calculatePower(x, n - 1);
    }

    public static void main(String[] args) {
        int x = 2;  // Base
        int n = 5;  // Exponent

        int ans = calculatePower(x, n);
        System.out.println(x + "^" + n + " = " + ans);
    }
}

/*
Notes:
- Base Cases:
   1. n == 0 → returns 1
   2. x == 0 → returns 0 (for n > 0)
- Recursive Case: multiply x with x^(n-1)
- Time Complexity: O(n)
- Space Complexity: O(n) due to recursion stack
*/
