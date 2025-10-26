package array;

import java.util.Scanner;

public class ArraysOfNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Qs ==> Take an array of names as input from the user and print them.

        // Step 1: Ask for the size of array
        System.out.print("Enter Size of Array : ");
        int size = sc.nextInt();
        sc.nextLine(); // Clear buffer (important after nextInt)

        // Step 2: Create an array of String
        String[] names = new String[size];

        // Step 3: Input names
        for (int i = 0; i < size; i++) {
            System.out.print("Enter Name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        // Step 4: Print names
        System.out.println("\n--- Names Stored in Array ---");
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name " + (i + 1) + ": " + names[i]);
        }

        sc.close();
    }
}
