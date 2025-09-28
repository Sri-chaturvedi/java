package Loops.Questions_Loop.Table_of_Number;

import java.util.Scanner;

public class ton {
    public static void main(String[] args) {
        
        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user for the number
        System.out.print("Enter the number to print its table: ");
        int n = sc.nextInt();

        System.out.println("Table of " + n + ":");

        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            int mul = n * i; // multiply number with current i
            System.out.println(n + " x " + i + " = " + mul); // print in table format
        }

        sc.close(); 
    }
}
