/*
=====================================================================================
📘 PROGRAM NAME  : Stack Implementation using ArrayList
📂 PACKAGE       : WithArrayList
💡 TOPIC         : Data Structures – Stack (ArrayList Implementation)
📅 DESCRIPTION   :
   This program demonstrates how to implement a Stack using Java’s ArrayList.
   Stack is a LIFO (Last In, First Out) data structure where the most recently added
   element is removed first.

=====================================================================================
🎯 STACK OPERATIONS:
1️⃣ push()  → Add element to top of stack  
2️⃣ pop()   → Remove top element  
3️⃣ peek()  → View top element  
4️⃣ isEmpty() → Check if the stack is empty  

=====================================================================================
🧠 DRY RUN EXAMPLE:

push(1) → [1]  
push(2) → [1, 2]  
push(3) → [1, 2, 3]  
peek()  → 3  
pop()   → removes 3 → [1, 2]

Output:
3  
2  
1  

=====================================================================================
📊 TIME COMPLEXITY:
✔ push() → O(1) (amortized)  
✔ pop()  → O(1)  
✔ peek() → O(1)  
✔ isEmpty() → O(1)

💾 SPACE COMPLEXITY:
O(N) → For N elements stored in the ArrayList.

=====================================================================================
💡 NOTES:
✔ Internally uses dynamic arrays for storage.  
✔ Easy to implement and resizes automatically.  
✔ Great for practice before using built-in `Stack` or `Deque` classes.  

=====================================================================================
*/

package WithArrayList;

import java.util.ArrayList;

public class StackArrayList {

    // 🔹 Stack implementation using ArrayList
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        // Check if stack is empty
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // Push element onto stack
        public static void push(int data) {
            list.add(data);
        }

        // Pop (remove) element from stack
        public static int pop() {
            if (isEmpty()) {
                System.out.println("⚠️ Stack Underflow - Empty Stack!");
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // Peek (view) top element
        public static int peek() {
            if (isEmpty()) {
                System.out.println("⚠️ Stack is Empty!");
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    // 🔹 MAIN METHOD
    public static void main(String[] args) {
        Stack s = new Stack();

        // Push elements
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        // Pop all elements and display
        System.out.println("🧾 Stack Output (Top to Bottom):");
        while (!s.isEmpty()) {
            System.out.println("Top: " + s.peek());
            s.pop();
        }

        System.out.println("\n✅ Stack is now empty.");
    }
}
