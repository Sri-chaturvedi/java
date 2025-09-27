package Lecture2;

import java.util.Scanner;

public class HW {

    // ---------------------------
    // Q1: Meaningful variable declaration
    // ---------------------------
    public static void question1() {
        String name = "Sri";       // String for text
        int age = 24;              // int for whole number
        double height = 5.9;       // double for decimal values

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " feet");
    }

    // ---------------------------
    // Q2: Program to calculate area of a circle
    // ---------------------------
    public static void question2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        int radius = sc.nextInt();

        double area = Math.PI * radius * radius; // Using Math.PI for accuracy

        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);

        // Do not close here, since we may use scanner again in Q3
    }

    // ---------------------------
    // Q3: Print table of a number
    // ---------------------------
    public static void question3() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number for table: ");
        int num = sc.nextInt();

        System.out.println("Multiplication Table of " + num + ":");
        System.out.println(num + " x 1 = " + (num * 1));
        System.out.println(num + " x 2 = " + (num * 2));
        System.out.println(num + " x 3 = " + (num * 3));
        System.out.println(num + " x 4 = " + (num * 4));
        System.out.println(num + " x 5 = " + (num * 5));
        System.out.println(num + " x 6 = " + (num * 6));
        System.out.println(num + " x 7 = " + (num * 7));
        System.out.println(num + " x 8 = " + (num * 8));
        System.out.println(num + " x 9 = " + (num * 9));
        System.out.println(num + " x 10 = " + (num * 10));

        sc.close();
    }

    // ---------------------------
    // Main method
    // ---------------------------
    public static void main(String[] args) {
        System.out.println("=== Question 1 ===");
        question1();

        System.out.println("\n=== Question 2 ===");
        question2();

        System.out.println("\n=== Question 3 ===");
        question3();
    }
}
