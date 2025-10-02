package Recursion1.ClaculateLogn;

/**
 * Program: CalculatePowerLog
 * Description: Calculates x^n efficiently using recursion (O(log n) approach).
 */

public class CalculatePowerLog {

    /**
     * Recursively calculates x^n using divide-and-conquer.
     *
     * @param x base number
     * @param n exponent
     * @return x^n
     */
    public static int calculatePowerLog(int x, int n) {
        if (n == 0) {  // Base case: x^0 = 1
            return 1;
        }
        if (x == 0) {  // Base case: 0^n = 0 for n > 0
            return 0;
        }

        int halfPower = calculatePowerLog(x, n / 2);

        // If n is even: x^n = (x^(n/2))^2
        // If n is odd:  x^n = x * (x^(n/2))^2
        if (n % 2 == 0) {
            return halfPower * halfPower;
        } else {
            return halfPower * halfPower * x;
        }
    }

    public static void main(String[] args) {
        int x = 2;  // Base
        int n = 5;  // Exponent

        int ans = calculatePowerLog(x, n);
        System.out.println(x + "^" + n + " = " + ans);
    }
}

/*
Notes:
- Base Cases:
   1. n == 0 → returns 1
   2. x == 0 → returns 0 (for n > 0)
- Recursive Case: Divide-and-conquer approach:
   - Even n: multiply halfPower by itself
   - Odd n: multiply halfPower by itself and then by x
- Time Complexity: O(log n)
- Space Complexity: O(log n) due to recursion stack
*/
