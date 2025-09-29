import java.util.Scanner;

/*
---------------- Example Output ----------------

Input: 5 10 15
Output: 10.0

-----------------------------------------------
Explanation:
- The method printAverage takes three integers as parameters.
- Calculates the average as a double: (a + b + c) / 3.0
- Prints the average.
*/

public class PrintAverage {

    // Method to calculate and print the average of three numbers
    public static void printAverage(int a, int b, int c) {
        double average = (a + b + c) / 3.0; // Use 3.0 to get decimal average
        System.out.println("Average: " + average);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        // Call the method to print the average
        printAverage(a, b, c);
    }
}
