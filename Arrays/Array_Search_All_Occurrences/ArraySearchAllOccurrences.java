package Arrays.Array_Search_All_Occurrences;

import java.util.Scanner;

/*
 Program: Search for a number in array
 and print all indices where it occurs.
*/

public class ArraySearchAllOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // Input elements
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Input number to search
        System.out.print("Enter number to search (x): ");
        int x = sc.nextInt();

        // Search and print all occurrences
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("✅ " + x + " found at index: " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("❌ " + x + " not found in the array.");
        }

        sc.close();
    }
}
