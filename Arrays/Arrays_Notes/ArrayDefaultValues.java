package Arrays.Arrays_Notes;

import java.util.Scanner;

/*
 Important:
 - When we create an array of a given size, 
   Java automatically assigns default values.

 Default values:
 - int → 0
 - double → 0.0
 - boolean → false
 - String/Objects → null
*/

public class ArrayDefaultValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int numbers[] = new int[size];  // array of given size

        // Printing default values
        System.out.println("Default values in array:");
        for (int i = 0; i < size; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        sc.close();
    }
}
