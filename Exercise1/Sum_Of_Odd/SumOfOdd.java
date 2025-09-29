package Exercise1.Sum_Of_Odd;

import java.util.Scanner;

/*
---------------- Example Output ----------------

Input: 10
Output:
Sum of odd numbers up to 10 is: 25

Explanation:
- Odd numbers up to 10 are 1, 3, 5, 7, 9
- Their sum: 1 + 3 + 5 + 7 + 9 = 25
*/

public class SumOfOdd {

    // Method to calculate sum of odd numbers up to n
    public static void sumOfOdd(int n) {
        if (n <= 0) {
            System.out.println("Invalid Number");
            return; // exit method for invalid input
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) { // check if number is odd
                sum += i; // add odd number to sum
            }
        }

        System.out.println("Sum of odd numbers up to " + n + " is: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        sumOfOdd(n);
    }
}
