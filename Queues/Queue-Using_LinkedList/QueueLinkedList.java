/*
=====================================================================================
📘 PROGRAM NAME  : Queue Implementation using Linked List
📂 PACKAGE       : Queues.QueueLinkedList
💡 TOPIC         : Data Structures – Queue (FIFO) using Linked List
📅 DESCRIPTION   :
   This program demonstrates the implementation of a Queue using a Linked List.
   Unlike an array-based queue, this approach dynamically allocates memory,
   allowing efficient insertions and deletions at runtime without a fixed size.

=====================================================================================
🎯 QUEUE OPERATIONS:
1️⃣ add()    → Enqueue element at the end (tail)
2️⃣ remove() → Dequeue element from the front (head)
3️⃣ peek()   → Return front element without removing
4️⃣ isEmpty()→ Check if the queue is empty

=====================================================================================
⚙️ ALGORITHM / LOGIC FLOW:
- Maintain two pointers: `head` (front) and `tail` (rear)
- For `add()` → link new node at the tail and move the tail forward
- For `remove()` → move head forward, and handle empty case
- If both head & tail are `null` → Queue is empty

=====================================================================================
📊 TIME COMPLEXITY:
✔ add()    → O(1)
✔ remove() → O(1)
✔ peek()   → O(1)
✔ isEmpty()→ O(1)

💾 SPACE COMPLEXITY:
✔ O(n) – Dynamic memory for each node

=====================================================================================
🧠 DRY RUN:
Queue q = [ ]  
add(1) → [1]  
add(2) → [1,2]  
remove() → returns 1, queue becomes [2]  
peek() → returns 2  

=====================================================================================
💡 SAMPLE OUTPUT:
1
2
3
4
5
=====================================================================================
*/

public class QueueLinkedList {

    // 🔹 Node class – represents one element in the queue
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // 🔹 Queue implementation using linked list
    static class Queue {
        static Node head = null;
        static Node tail = null;

        // ✅ Check if queue is empty
        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        // ✅ Add element (enqueue)
        public static void add(int data) {
            Node newNode = new Node(data);
            if (tail == null) {  // Empty queue
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;  // Move tail to new node
        }

        // ✅ Remove element (dequeue)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("⚠️ Queue is Empty (Underflow)");
                return -1;
            }

            int front = head.data;
            if (head == tail) { // Only one element
                head = tail = null;
            } else {
                head = head.next;
            }
            return front;
        }

        // ✅ Peek front element
        public static int peek() {
            if (isEmpty()) {
                System.out.println("⚠️ Queue is Empty");
                return -1;
            }
            return head.data;
        }
    }

    // 🔹 Driver Code
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

        System.out.println("\n✅ All elements dequeued successfully.");
    }
}
