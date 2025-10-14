/*
=====================================================================================
📘 PROGRAM NAME  : Push Element at the Bottom of Stack (Using Recursion)
📂 PACKAGE       : Stack / Recursion / WithJavaCollectionFrameWork
💡 TOPIC         : Stack + Recursion
✍️ AUTHOR        : Shree Chaturvedi
📅 DESCRIPTION   :
   This program demonstrates how to insert an element at the bottom of a Stack
   using recursion — without using any extra data structures.

   The idea is to recursively pop all elements, insert the new element when
   the stack becomes empty, and then push all elements back in the same order.

=====================================================================================
🎯 QUESTION:
Given a stack, insert an element at the **bottom** using recursion.

Example:
Input Stack  : [Top → 3, 2, 1]
Insert Value : 4
Output Stack : [Top → 3, 2, 1, 4]   // 4 is at the bottom now

=====================================================================================
🧠 DRY RUN EXAMPLE:

Initial Stack → [Top → 3, 2, 1]
pushAtBottom(4)

Step 1️⃣: pop(3) → [2, 1]
Step 2️⃣: pop(2) → [1]
Step 3️⃣: pop(1) → []
✅ Stack is empty → push(4)
Now → [4]
Step 4️⃣: push(1)
Step 5️⃣: push(2)
Step 6️⃣: push(3)
Final Stack → [Top → 3, 2, 1, 4]

=====================================================================================
⚙️ ALGORITHM / LOGIC FLOW:
1️⃣ Base Case → If stack is empty → push(data) → return  
2️⃣ Otherwise:
     - Pop top element
     - Recurse until stack becomes empty
     - Push the element back after recursion returns

=====================================================================================
📊 TIME COMPLEXITY:
✔ O(N) → Each element is popped and pushed once  
💾 SPACE COMPLEXITY:
✔ O(N) → Due to recursion call stack  

=====================================================================================
💡 NOTES:
✔ Excellent example of recursion + stack manipulation  
✔ No extra data structure is used (only call stack)  
✔ Order of elements is preserved after insertion  
✔ Concept used in many advanced problems (e.g. stack reversal, expression parsing)

=====================================================================================
*/

import java.util.Stack;

public class PushAtBottom {

    // 🔹 Function to push element at the bottom of the stack
    public static void pushAtBottom(int data, Stack<Integer> s) {
        // Base Case
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        // Pop top element
        int top = s.pop();

        // Recursive call
        pushAtBottom(data, s);

        // Push back the popped element
        s.push(top);
    }

    // 🔹 Main method to test
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("🧾 Original Stack (Top → Bottom): " + s);
        pushAtBottom(4, s);
        System.out.println("✅ After Inserting 4 at Bottom: " + s);

        System.out.println("\nPrinting Stack Top to Bottom:");
        while (!s.isEmpty()) {
            System.out.println("Top: " + s.peek());
            s.pop();
        }
    }
}
