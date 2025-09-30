package Arrays.Find_Min_Max;

import java.util.Scanner;

public class FindMiniMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take size of array from user
        System.out.print("Enter the size of Array : ");
        int size = sc.nextInt();

        int[] numbers = new int[size]; // create an array of given size

        // Step 2: Take array elements as input
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Step 3: Initialize min and max with extreme values
        int mini = Integer.MAX_VALUE; // smallest possible "starting point"
        int maxi = Integer.MIN_VALUE; // largest possible "starting point"

        // Step 4: Loop through array to find min & max
        for (int i = 0; i < size; i++) {
            if (numbers[i] < mini) {   // check for smaller number
                mini = numbers[i];
            }
            if (numbers[i] > maxi) {   // check for larger number
                maxi = numbers[i];
            }
        }

        // Step 5: Print results
        System.out.println("Maximum value in the array is : " + maxi);
        System.out.println("Minimum value in the array is : " + mini);
    }
}
