package Strings.String_Declaration;

import java.util.Scanner;

/**
 * This program demonstrates different ways to declare strings
 * and take string input from the user.
 */
public class StringDeclaration {
    public static void main(String[] args) {

        // 1. String declaration using literals
        String name = "Sri";
        String fullName = "Sri Chaturvedi";
        String sentence = "My Name is Sri Chaturvedi";

        System.out.println("Name: " + name);
        System.out.println("Full Name: " + fullName);
        System.out.println("Sentence: " + sentence);

        // 2. Taking string input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = sc.nextLine(); // Reads the whole line input
        System.out.println("Your name is: " + userName);

        sc.close();
    }
}
