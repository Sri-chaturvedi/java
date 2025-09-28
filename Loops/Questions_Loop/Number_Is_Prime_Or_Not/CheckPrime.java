package Loops.Questions_Loop.Number_Is_Prime_Or_Not;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true; // assume number is prime initially

        // 0 and 1 are not prime
        if (num <= 1) {
            isPrime = false;
        } else {
            // Check divisibility from 2 to num/2
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false; // found a factor, not prime
                    break;
                }
            }
        }

        // Print result
        if (isPrime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is NOT a Prime Number.");
        }

        sc.close();
    }
}
