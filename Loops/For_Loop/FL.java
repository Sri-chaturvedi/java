package Loops.For_Loop;

public class FL {
    public static void main(String[] args) {

        // for loop syntax:
        // for(initialization; condition; increment/decrement) { ... }

        // i++ means i = i + 1 (increment i by 1 each time)
        // System.out.print(i + " "); --> prints horizontally in one line
        // System.out.println(i); --> prints each number on a new line (vertical)

        // This loop will run from i = 0 to i = 10 (total 11 times)
        for (int i = 0; i < 11; i++) {
            System.out.println(i); // print i on a new line
        }
    }
}
