package Arrays.Array_Search;

import java.util.Scanner;

/*
 ---------------- Problem Statement ----------------
 Take an array as input from the user.
 Search for a given number `x` and print 
 the index at which it occurs.
 
 Example:
 Input:
   size = 5
   numbers = 2 4 6 8 10
   x = 8

 Output:
   x found at index : 3
----------------------------------------------------
*/

public class ArraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input size of array
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // Step 2: Input elements
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Step 3: Number to search
        System.out.print("Enter number to search (x): ");
        int x = sc.nextInt();

        // Step 4: Search for x (Linear Search)
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("✅ " + x + " found at index: " + i);
                found = true;
                break; // stop at first occurrence
            }
        }

        // Step 5: If not found
        if (!found) {
            System.out.println("❌ " + x + " not found in the array.");
        }

        sc.close();
    }
}
