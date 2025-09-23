package Recursion2.OccuranceOfElement;

public class OFE {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str, char element, int idx) {
        if (idx == str.length()) {
            System.out.println("First Occurance of " + element + ": " + first);
            System.out.println("Last Occurance of " + element + ": " + last);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        findOccurance(str, element, idx + 1);
    }

    public static void main(String[] args) {
        String str = "abaanaabcaad";
        findOccurance(str, 'b',0 );
    }
}
