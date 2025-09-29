package Exercise1.Circumference_Of_A_Circle;

import java.util.Scanner;

/*
---------------- Example Output ----------------

Input: 7
Output:
Circumference of the circle is: 43.98226

-----------------------------------------------
Explanation:
- Circumference formula: C = 2 * π * r
- 'r' is the radius of the circle.
- π is approximated as 3.14159.
*/

public class CircumferenceOfACircle {

    // Method to calculate and print circumference
    public static void circumferenceOfACircle(int radius) {
        double pi = 3.14159;
        double circumference = 2 * pi * radius;

        System.out.println("Circumference of the circle is: " + circumference);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        int radius = sc.nextInt();
        sc.close();

        // Call the method
        circumferenceOfACircle(radius);
    }
}
