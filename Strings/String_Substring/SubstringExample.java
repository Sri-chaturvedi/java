package Strings.String_Substring;

/**
 * This program demonstrates how to extract substrings
 * from a string using the substring() method.
 */
public class SubstringExample {
    public static void main(String[] args) {

        String sentence = "My name is Sri";

        // Extract substring from index 11 to end
        String name = sentence.substring(11); 
        System.out.println("Extracted name: " + name);

        String fullName = "SriChaturvedi";

        // Extract substring from index 3 to end
        String lastPart = fullName.substring(3);
        System.out.println("Last part of name: " + lastPart);
    }
}
