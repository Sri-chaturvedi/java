/*
=====================================================================================
📘 PROGRAM NAME  : Reverse a Stack using Recursion
📂 PACKAGE       : Stack / Recursion / WithJavaCollectionFrameWork
💡 TOPIC         : Stack + Recursion
✍️ AUTHOR        : Shree Chaturvedi
📅 DESCRIPTION   :
   This program reverses a stack using recursion without using any extra 
   data structure (only the call stack).

   It uses a helper function `pushAtBottom()` that inserts an element at the 
   bottom of the stack recursively. Then, we pop all elements one by one and 
   insert them at the bottom, effectively reversing the order.

=====================================================================================
🎯 QUESTION:
Reverse a given stack using recursion (without loops or extra data structure).

Example:
Input Stack  : [Top → 3, 2, 1]
Output Stack : [Top → 1, 2, 3]

=====================================================================================
🧠 DRY RUN EXAMPLE:

Stack = [Top → 3, 2, 1]

Step 1️⃣: pop(3) → reverse([2, 1])
Step 2️⃣: pop(2) → reverse([1])
Step 3️⃣: pop(1) → reverse([]) → returns
Step 4️⃣: pushAtBottom(1) → [1]
Step 5️⃣: pushAtBottom(2) → [2, 1]
Step 6️⃣: pushAtBottom(3) → [3, 2, 1]

✅ Final Stack (Reversed): [Top → 1, 2, 3]

=====================================================================================
⚙️ ALGORITHM / LOGIC FLOW:
1️⃣ Base Case → If stack is empty → return  
2️⃣ Pop the top element and hold it  
3️⃣ Recurse to reverse the remaining stack  
4️⃣ Insert the held element at the bottom using `pushAtBottom()`  

=====================================================================================
📊 TIME COMPLEXITY:
✔ O(N²) → Because for each element, `pushAtBottom()` takes O(N)  
💾 SPACE COMPLEXITY:
✔ O(N) → Due to recursion call stack  

=====================================================================================
💡 NOTES:
✔ No extra data structure is used  
✔ Uses recursion stack as an implicit helper  
✔ `pushAtBottom()` is key for reordering  
✔ This concept is widely used in stack-based algorithm problems  

=====================================================================================
*/

import java.util.Stack;

public class ReverseAStack {

    // 🔹 Push element at the bottom of stack (helper function)
    public static void pushAtBottom(int data, Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    // 🔹 Function to reverse the stack recursively
    public static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverse(s);
        pushAtBottom(top, s);
    }

    // 🔹 Driver Code
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("🧾 Original Stack (Top → Bottom): " + s);

        reverse(s);

        System.out.println("✅ Reversed Stack (Top → Bottom): " + s);

        System.out.println("\nPrinting Stack from Top to Bottom:");
        while (!s.isEmpty()) {
            System.out.println("Top: " + s.peek());
            s.pop();
        }
    }
}
