package Loops.Questions_Loop.SumOfNaturalNum;

import java.util.Scanner;

public class sonnn {
    public static void main(String[] args) {
        
        // Create Scanner object for taking input
        Scanner sc = new Scanner(System.in);

        // Ask user for the number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Variable to store the sum (initially 0)
        int sum = 0;

        // Loop from 1 to num
        for (int i = 1; i <= num; i++) {
            sum = sum + i; // add current i to sum
        }

        // Print the result
        System.out.println("Sum of first " + num + " natural numbers is: " + sum);

        sc.close(); // close the scanner (good practice)
    }
}
