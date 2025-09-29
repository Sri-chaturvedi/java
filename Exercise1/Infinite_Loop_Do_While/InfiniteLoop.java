package Exercise1.Infinite_Loop_Do_While;

/*
---------------- Important Note ----------------
- This loop will never terminate on its own.
- You must manually stop the program (e.g., Ctrl + C in console) to exit.
------------------------------------------------

---------------- Example Output ----------------

Output (repeats infinitely):
Stop it
Stop it
Stop it
...

-----------------------------------------------
Explanation:
- A do-while loop executes the block at least once before checking the condition.
- Using 'while(true)' creates an infinite loop.
*/

public class InfiniteLoop {
    public static void main(String[] args) {

        // Infinite loop using do-while
        do {
            System.out.println("Stop it"); // Message will print repeatedly
        } while (true); // Condition always true → infinite loop
    }
}
