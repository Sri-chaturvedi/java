package Strings.Email_Username_Extractor;

import java.util.Scanner;

/**
 * Program to extract the username part from an email address.
 * The username is the portion of the email before the '@' character.
 *
 * Example:
 * email    = "srichaturvedijava@gmail.com"  →  username = "srichaturvedijava"
 * email    = "helloWorld123@yahoo.com"    →  username = "helloWorld123"
 * email    = "noAtSymbolHere"             →  username = "noAtSymbolHere"
 */
public class EmailUsernameExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input email from user
        System.out.print("Enter your email: ");
        String email = sc.nextLine().trim();

        // Use StringBuilder for efficiency (instead of repeated string concatenation)
        StringBuilder username = new StringBuilder();

        // Loop through characters until '@'
        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);
            if (ch == '@') {
                break; // stop when '@' is found
            }
            username.append(ch); // add characters before '@'
        }

        // If no '@' is found, whole string is username
        if (username.length() == email.length()) {
            System.out.println("⚠️ No '@' found, treating full input as username.");
        }

        // Output result
        System.out.println("👤 Username: " + username);

        sc.close();
    }
}
