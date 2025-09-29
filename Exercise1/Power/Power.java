package Exercise1.Power;

import java.util.Scanner;

/*
---------------- Example Output ----------------

Input: 
2 3
Output: 
2 raised to 3 is: 8

-----------------------------------------------
Explanation:
- getPower(x, n) calculates x raised to the power n using a loop.
- Multiplies 'x' by itself 'n' times.
*/

public class Power {

    // Method to calculate x raised to the power n
    public static int getPower(int x, int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= x; // multiply result by x, n times
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base (x): ");
        int x = sc.nextInt();

        System.out.print("Enter exponent (n): ");
        int n = sc.nextInt();
        sc.close();

        int power = getPower(x, n);
        System.out.println(x + " raised to " + n + " is: " + power);
    }
}
