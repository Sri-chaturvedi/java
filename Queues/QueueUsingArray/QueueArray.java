/*
=====================================================================================
📘 PROGRAM NAME  : Queue Implementation using Array
📂 PACKAGE       : Queues.QueueUsingArray
💡 TOPIC         : Queue Data Structure (FIFO – First In First Out)
📅 DESCRIPTION   :
   This program demonstrates how to implement a Queue using an array in Java.
   A Queue follows the FIFO principle — elements are added at the rear and
   removed from the front.

=====================================================================================
🎯 QUEUE OPERATIONS:
1️⃣ add()    → Enqueue element at the rear  
2️⃣ remove() → Dequeue element from the front  
3️⃣ peek()   → Get the front element without removing it  
4️⃣ isEmpty()→ Check if queue is empty  

=====================================================================================
⚙️ ALGORITHM / LOGIC FLOW:
- Use an integer array `arr[]` of fixed size.
- Maintain a pointer `rear` to track the end of the queue.
- Initially, `rear = -1` (empty queue).
- When adding an element:
     - Check for overflow (rear == size - 1)
     - Increment rear and insert at arr[rear]
- When removing an element:
     - Shift all elements left to remove the front element (O(n) operation)
- When peeking:
     - Return arr[0] (front of the queue)

=====================================================================================
📊 TIME COMPLEXITY:
✔ add()    → O(1)
✔ remove() → O(n) (due to element shifting)
✔ peek()   → O(1)
✔ isEmpty()→ O(1)

💾 SPACE COMPLEXITY:
✔ O(n) – For the array storage

=====================================================================================
💡 EXAMPLE OUTPUT:
Input  : Enqueue 1, 2, 3
Process: Dequeue all elements
Output : 123

=====================================================================================
*/

package Queues.QueueUsingArray;

public class QueueArray {

    // 🔹 Queue Implementation using Static Inner Class
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;

        // Constructor → Initialize queue
        Queue(int n) {
            arr = new int[n];
            size = n;
        }

        // 🔸 Check if Queue is Empty
        public static boolean isEmpty() {
            return rear == -1;
        }

        // 🔸 Add element to Queue (Enqueue)
        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("⚠️ Queue is Full (Overflow)");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // 🔸 Remove element from Queue (Dequeue)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("⚠️ Queue is Empty (Underflow)");
                return -1;
            }

            int front = arr[0];
            // Shift elements one position left
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        // 🔸 Get front element without removing (Peek)
        public static int peek() {
            if (isEmpty()) {
                System.out.println("⚠️ Queue is Empty");
                return -1;
            }
            return arr[0];
        }
    }

    // 🔹 Main method for demonstration
    public static void main(String[] args) {
        Queue q = new Queue(5);

        // Enqueue elements
        q.add(1);
        q.add(2);
        q.add(3);

        // Dequeue and print
        System.out.println("Queue Output (Front → Rear):");
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
        System.out.println("\n✅ All elements dequeued successfully.");
    }
}
