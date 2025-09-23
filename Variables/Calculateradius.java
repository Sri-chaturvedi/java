package Variables;

import java.util.Scanner;

public class Calculateradius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pi = 3.141592653589793;

        System.out.println("Enter the radius of the circle");

        // read the radiou given by the user
        double radius = sc.nextDouble();

        // calculate the area of the circle
        double area = pi * radius * radius;

        System.out.println("The radius of the circle is :" + radius);
        System.out.println("The area of the circle is :" + area);

        sc.close();
    }
}