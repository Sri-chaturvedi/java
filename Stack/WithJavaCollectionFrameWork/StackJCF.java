/*
=====================================================================================
📘 PROGRAM NAME  : Stack Implementation using Java Collection Framework (JCF)
📂 PACKAGE       : WithJavaCollectionFrameWork
💡 TOPIC         : Data Structures – Stack in Java (Using java.util.Stack)
📅 DESCRIPTION   :
   This program demonstrates how to use Java’s built-in Stack class from the
   Collection Framework. Stack follows the LIFO (Last In, First Out) principle.
   It provides ready-made methods for common operations like push, pop, peek, etc.

=====================================================================================
🎯 STACK OPERATIONS:
1️⃣ push(E item)  → Add an element to the top of the stack  
2️⃣ pop()         → Remove and return the top element  
3️⃣ peek()        → Return (but don’t remove) the top element  
4️⃣ isEmpty()     → Check whether the stack is empty  
5️⃣ size()        → Get the total number of elements  

=====================================================================================
🧠 DRY RUN EXAMPLE:

Stack s = [ ]

push(1) → [1]  
push(2) → [1, 2]  
push(3) → [1, 2, 3]  
push(4) → [1, 2, 3, 4]

Now:
peek() → 4  
pop()  → remove 4 → [1, 2, 3]  
pop()  → remove 3 → [1, 2]  
pop()  → remove 2 → [1]  
pop()  → remove 1 → [ ]

✅ Output:
4  
3  
2  
1  

=====================================================================================
📊 TIME COMPLEXITY:
✔ push() → O(1)  
✔ pop()  → O(1)  
✔ peek() → O(1)  
✔ isEmpty() → O(1)

💾 SPACE COMPLEXITY:
O(N) → For N elements stored in the stack.

=====================================================================================
💡 NOTES:
✔ Part of Java’s Collection Framework → `java.util.Stack`  
✔ Internally implemented using a `Vector`.  
✔ Thread-safe (synchronized methods).  
✔ For modern use, `Deque` (like `ArrayDeque`) is preferred for stack operations  
  due to better performance in single-threaded environments.  

=====================================================================================
*/

package WithJavaCollectionFrameWork;

import java.util.Stack;

public class StackJCF {
    public static void main(String[] args) {
        // 🔹 Create a Stack of Integer type
        Stack<Integer> s = new Stack<>();

        // 🔹 Push elements onto the stack
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        // 🔹 Print stack elements (Top to Bottom)
        System.out.println("🧾 Stack Output (Top to Bottom):");
        while (!s.isEmpty()) {
            System.out.println("Top: " + s.peek());
            s.pop();
        }

        System.out.println("\n✅ Stack is now empty.");
    }
}
