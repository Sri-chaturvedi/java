package Recursion2.Subsequences;

public class Subsequences {
    public static void findSeq(int idx, String str, String newString ){
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        //to be choosen
        findSeq(idx+1, str, newString+currChar);
        //not to be choosen
        findSeq(idx+1, str, newString);

    }
    public static void main(String[] args) {
        String str = "abc";
        findSeq(0, str, "");
    }
}
