/*
=====================================================================================
📘 PROGRAM NAME  : Queue Implementation using Java Collection Framework (JCF)
📂 PACKAGE       : Queues.QueueJavaCollection
💡 TOPIC         : Data Structures – Queue Interface in Java
📅 DESCRIPTION   :
   This program demonstrates how to use the Queue interface provided by the
   Java Collection Framework (JCF). Java’s Queue is part of the `java.util`
   package and can be implemented using:
     ➤ LinkedList  – allows nulls, slower but more flexible
     ➤ ArrayDeque  – faster and does NOT allow nulls (recommended)

=====================================================================================
🎯 QUEUE OPERATIONS:
1️⃣ add(E e)      → Inserts the specified element into the queue  
2️⃣ remove()      → Removes the head (front) of the queue  
3️⃣ peek()        → Retrieves, but does not remove, the head of this queue  
4️⃣ isEmpty()     → Checks if the queue is empty  

=====================================================================================
💡 QUEUE INTERFACE IMPLEMENTATIONS IN JAVA:
✔ LinkedList     → Doubly Linked List (can work as both Queue & Deque)  
✔ ArrayDeque     → Resizable array implementation (recommended for Queue)  
✔ PriorityQueue  → Orders elements based on priority  

=====================================================================================
⚙️ ALGORITHM / LOGIC FLOW:
1️⃣ Create a Queue object using either:
      Queue<Integer> q = new LinkedList<>();
   or
      Queue<Integer> q = new ArrayDeque<>();
2️⃣ Add elements using `add()`
3️⃣ Process (peek/remove) elements until the queue is empty
=====================================================================================
📊 TIME COMPLEXITY:
✔ add()    → O(1)
✔ remove() → O(1)
✔ peek()   → O(1)
✔ isEmpty()→ O(1)

💾 SPACE COMPLEXITY:
✔ O(n) – Space required to store n elements

=====================================================================================
🧠 DRY RUN:
Queue q = [ ]  
add(1) → [1]  
add(2) → [1,2]  
add(3) → [1,2,3]  
peek() → 1  
remove() → [2,3]  
...
Until queue becomes empty.

=====================================================================================
💡 SAMPLE OUTPUT:
12345
=====================================================================================
*/

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueJavaCollection {
    public static void main(String[] args) {

        // 🔸 You can choose one of the following implementations:
        // Queue<Integer> q = new LinkedList<>();   // Doubly Linked List
        Queue<Integer> q = new ArrayDeque<>();      // Faster ArrayDeque (recommended)

        // 🔹 Add elements (enqueue)
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("Queue Elements (Front → Rear):");

        // 🔹 Process and remove elements (FIFO order)
        while (!q.isEmpty()) {
            System.out.print(q.peek()); // Access front
            q.remove();                 // Remove front
        }

        System.out.println("\n\n✅ All elements dequeued successfully using Java Collection Framework Queue.");
    }
}
