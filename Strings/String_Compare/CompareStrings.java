package Strings.String_Compare;

/**
 * This program demonstrates how to compare two strings in Java.
 * Using compareTo():
 *  - Returns 0 if strings are equal
 *  - Returns positive if first string > second string
 *  - Returns negative if first string < second string
 */
public class CompareStrings {
    public static void main(String[] args) {

        String name1 = "Sri";
        String name2 = "Chaturvedi";

        int comparisonResult = name1.compareTo(name2);

        if (comparisonResult == 0) {
            System.out.println("Strings are equal");
        } else if (comparisonResult > 0) {
            System.out.println("First string is greater than second string");
        } else {
            System.out.println("First string is smaller than second string");
        }
    }
}
