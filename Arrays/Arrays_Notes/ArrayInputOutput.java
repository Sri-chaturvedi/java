package Arrays.Arrays_Notes;

import java.util.Scanner;

/*
 Input and Output in Arrays
*/

public class ArrayInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int numbers[] = new int[size];

        // Input elements
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Output elements
        System.out.println("You entered:");
        for (int i = 0; i < size; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        sc.close();
    }
}
