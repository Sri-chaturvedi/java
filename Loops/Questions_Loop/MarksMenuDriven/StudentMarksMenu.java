package Loops.Questions_Loop.MarksMenuDriven;

import java.util.Scanner;

public class StudentMarksMenu {

    /*
     * Menu-driven program:
     * User enters 1 to input marks or 0 to stop.
     * Marks >= 90 -> "This is Good"
     * Marks 60-89 -> "This is also Good"
     * Marks 0-59 -> "This is Good as well"
     * Marks outside 0-100 -> "Invalid Number"
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;

        do {
            // Ask user whether to continue or stop
            System.out.print("Enter 1 to input marks or 0 to stop: ");
            input = sc.nextInt();

            if (input == 1) {
                // Take marks input
                System.out.print("Enter marks (0-100): ");
                int marks = sc.nextInt();

                // Check marks range and print appropriate message
                if (marks >= 90 && marks <= 100) {
                    System.out.println("This is Good");
                } else if (marks >= 60 && marks <= 89) {
                    System.out.println("This is also Good");
                } else if (marks >= 0 && marks <= 59) {
                    System.out.println("This is Good as well");
                } else {
                    System.out.println("Invalid Number");
                }
            } else if (input != 0) {
                // Handle invalid menu input
                System.out.println("Invalid choice! Enter 1 to continue or 0 to stop.");
            }

        } while (input == 1); // loop continues only if user enters 1

        System.out.println("Program stopped. Thank you!");
        sc.close();
    }
}
