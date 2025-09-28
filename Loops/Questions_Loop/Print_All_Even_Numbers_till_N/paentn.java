package Loops.Questions_Loop.Print_All_Even_Numbers_till_N;

import java.util.Scanner;

public class paentn {
    public static void main(String[] args) {
        
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Ask user for the upper limit
        System.out.print("Enter the number up to which you want even numbers: ");
        int n = sc.nextInt();

        System.out.println("Even numbers from 0 to " + n + " are:");

        // Loop from 0 to n
        for (int i = 0; i <= n; i++) {
            // Check if the number is even
            if (i % 2 == 0) {
                System.out.println(i); // print the even number
            }
        }

        sc.close(); // close scanner
    }
}
