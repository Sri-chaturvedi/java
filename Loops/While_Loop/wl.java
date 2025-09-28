package Loops.While_Loop;

public class wl {
    public static void main(String[] args) {
        
        // Initialization of counter variable
        int i = 0;

        // while loop syntax:
        // while(condition) {
        //     // statements
        // }

        // Loop will run as long as i < 11
        while (i < 11) {
            System.out.println(i); // print the value of i
            i++; // increment i by 1 (i = i + 1)
        }

        // When i becomes 11, condition (i < 11) becomes false,
        // so the loop stops.
    }
}
