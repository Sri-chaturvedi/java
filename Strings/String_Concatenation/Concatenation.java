package Strings.String_Concatenation;

/**
 * This program demonstrates string concatenation using '+'
 * operator to combine two or more strings.
 */
public class Concatenation {
    public static void main(String[] args) {

        String firstName = "Srii";
        String lastName = "Chaturvedi";

        // Combine strings using '+'
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        // Concatenate with a special character
        String taggedName = firstName + "@" + lastName;
        System.out.println("Tagged Name: " + taggedName);
    }
}
