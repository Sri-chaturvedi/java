package Function.Check_Prime_Number;

import java.util.Scanner;

/*
---------------- Example Output ----------------

Input: 7
Output: 7 is a prime number

Input: 12
Output: 12 is not a prime number

-----------------------------------------------
Explanation:
- Prime number: A number greater than 1 that has no divisors other than 1 and itself.
- Check divisibility from 2 to sqrt(n) for efficiency.
*/

public class CheckPrimeNumber {

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // numbers <=1 are not prime
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // divisible by a number other than 1 and itself
            }
        }

        return true; // no divisors found → prime
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        // Call isPrime and print result
        if (isPrime(n)) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }
}
