package Strings.String_Length_CharAt;

/**
 * This program demonstrates the use of String methods:
 * - length(): returns the number of characters in a string
 * - charAt(): returns the character at a specific index
 */
public class LengthAndCharAt {
    public static void main(String[] args) {

        String fullName = "SriiChaturvedi";

        // 1. Length of string
        int length = fullName.length();
        System.out.println("Length of string: " + length);

        // 2. Access each character using charAt()
        System.out.println("Characters in the string:");
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println("Character at index " + i + ": " + fullName.charAt(i));
        }
    }
}
