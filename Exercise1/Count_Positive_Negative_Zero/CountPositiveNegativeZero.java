package Exercise1.Count_Positive_Negative_Zero;

import java.util.Scanner;

/*
---------------- Example Run ----------------

Enter 1 for adding more numbers and 0 for stop: 1
Enter number: 5
Enter 1 for adding more numbers and 0 for stop: 1
Enter number: -3
Enter 1 for adding more numbers and 0 for stop: 1
Enter number: 0
Enter 1 for adding more numbers and 0 for stop: 0
Thanks

----Result----
Count of positive numbers: 1
Count of negative numbers: 1
Count of zeros: 1
*/

public class CountPositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int zero = 0;

        System.out.println("Enter 1 to add a number or 0 to stop: ");
        int input = sc.nextInt();

        while (input == 1) {
            System.out.print("Enter a number: ");
            double n = sc.nextDouble();

            if (n > 0) {
                positive++;
            } else if (n < 0) {
                negative++;
            } else {
                zero++;
            }

            System.out.println("Enter 1 to add a number or 0 to stop: ");
            input = sc.nextInt(); // Update the same variable
        }

        System.out.println("Thanks");

        // Print final result
        System.out.println("----Result----");
        System.out.println("Count of positive numbers: " + positive);
        System.out.println("Count of negative numbers: " + negative);
        System.out.println("Count of zeros: " + zero);

        sc.close();
    }
}
