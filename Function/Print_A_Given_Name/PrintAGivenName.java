package Function.Print_A_Given_Name;

import java.util.Scanner;

/*
---------------- Example Output ----------------

Input: Shreee
Output:
Shreee

-----------------------------------------------
Explanation:
- The method printMyName takes a String parameter 'name'.
- It prints the name using System.out.println().
- The main method reads input from the user and calls printMyName().
*/

public class PrintAGivenName {

    // Method to print the given name
    public static void printMyName(String name) {
        System.out.println(name);
        // 'return;' is optional here since the method is void
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // Read full line input
        sc.close();

        // Call the method to print the name
        printMyName(name);
    }
}
