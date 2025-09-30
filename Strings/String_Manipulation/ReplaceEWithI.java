package Strings.String_Manipulation;

import java.util.Scanner;

/**
 * This program takes a string input from the user
 * and creates a new string called 'result' in which
 * every occurrence of letter 'e' is replaced with 'i'.
 * 
 * Examples:
 * original = "eabcdef" -> result = "iabcdif"
 * original = "xyz"     -> result = "xyz"
 */
public class ReplaceEWithI {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter a string: ");
        String original = sc.nextLine();

        // Initialize result string
        String result = "";

        // Loop through each character of original string
        for (int i = 0; i < original.length(); i++) {
            char ch = original.charAt(i);

            // Replace 'e' with 'i'
            if (ch == 'e') {
                result += 'i';
            } else {
                result += ch;
            }
        }

        // Display results
        System.out.println("Original: " + original);
        System.out.println("Result: " + result);

        sc.close();
    }
}
