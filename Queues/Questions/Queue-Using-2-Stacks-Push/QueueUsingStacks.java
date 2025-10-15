/*
=====================================================================================
📘 PROGRAM NAME  : Queue Implementation Using Two Stacks
📂 PACKAGE       : Queues.QueueUsingStacks
💡 TOPIC         : Data Structures – Queue from Stacks
📅 DESCRIPTION   :
   This program demonstrates how to implement a Queue (FIFO order)
   using two Stacks (which naturally work in LIFO order).

   We use two stacks:
     ➤ s1 – main stack that always keeps the front of the queue on top  
     ➤ s2 – temporary stack used during enqueue operation

=====================================================================================
🎯 QUEUE OPERATIONS IMPLEMENTED:
1️⃣ add(int data)   → Enqueue an element into the queue  
2️⃣ remove()        → Dequeue (remove) an element from the front  
3️⃣ peek()          → View the front element  
4️⃣ isEmpty()       → Check if queue is empty  

=====================================================================================
⚙️ LOGIC / ALGORITHM:

🔹 ADD (enqueue)
   Step 1: Move all elements from s1 → s2
   Step 2: Push new element into s1
   Step 3: Move all elements back from s2 → s1
   ✅ This ensures the newest element is always at the bottom,
      so the oldest element stays on top (FIFO behavior).

🔹 REMOVE (dequeue)
   Step 1: Simply pop the top of s1
   Step 2: That top represents the front of the queue.

🔹 PEEK
   Step 1: Return top element of s1 (front of the queue).

=====================================================================================
📊 TIME COMPLEXITY:
✔ add()   → O(n) because of stack transfers  
✔ remove() → O(1)  
✔ peek()   → O(1)  
✔ isEmpty()→ O(1)

💾 SPACE COMPLEXITY:
✔ O(n) for storing n elements across two stacks

=====================================================================================
🧠 DRY RUN:
Let’s say we add: 1, 2, 3

Initially: s1 = [ ] , s2 = [ ]
--------------------------------
add(1): s1 = [1]
add(2): move 1→s2 → s2=[1], push 2→s1=[2], move back → s1=[2,1]
add(3): move s1→s2=[1,2], push 3→s1=[3], move back → s1=[3,2,1]

Now Queue Front → Rear = 1 → 2 → 3

remove(): pop s1 → returns 1  
peek(): returns s1.peek() → 2  

=====================================================================================
💡 SAMPLE OUTPUT:
1  
2  
3  
4  
5  

✅ Queue implemented successfully using two stacks.
=====================================================================================
*/

import java.util.*;

public class QueueUsingStacks {

    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        // 🔹 Check if queue is empty
        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        // 🔹 Enqueue operation (O(n))
        public static void add(int data) {
            // Move all elements from s1 → s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            // Push new element to s1
            s1.push(data);

            // Move back elements from s2 → s1
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // 🔹 Dequeue operation (O(1))
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.pop();
        }

        // 🔹 Peek operation (O(1))
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.peek();
        }
    }

    // 🔹 Main driver method
    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("Queue Elements (Front → Rear):");
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

        System.out.println("\n✅ All queue elements processed successfully!");
    }
}
