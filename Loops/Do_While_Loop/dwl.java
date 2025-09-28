package Loops.Do_While_Loop;

public class dwl {
    public static void main(String[] args) {
        
        // Initialization of counter variable
        int i = 0;

        // do-while loop syntax:
        // do {
        //     // statements
        // } while (condition);

        // The statements inside 'do' block will run AT LEAST once,
        // even if the condition is false.
        do {
            System.out.println(i); // print the value of i
            i++; // increment i by 1 (i = i + 1)
        } while (i < 11); // loop will continue as long as i < 11

        // Output: numbers from 0 to 10 (11 numbers total)
    }
}
