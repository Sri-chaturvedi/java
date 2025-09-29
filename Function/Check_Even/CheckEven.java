package Function.Check_Even;

import java.util.Scanner;

/*
---------------- Example Output ----------------

Input: 6
Output: 6 is Even

Input: 7
Output: 7 is Not Even

-----------------------------------------------
Explanation:
- A number is even if it is divisible by 2 (n % 2 == 0).
- Method returns true for even numbers, false for odd numbers.
*/

public class CheckEven {

    // Method to check if a number is even
    public static boolean isEven(int n) {
        return n % 2 == 0; // true if divisible by 2
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        // Call isEven and print result
        if (isEven(n)) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Not Even");
        }
    }
}
