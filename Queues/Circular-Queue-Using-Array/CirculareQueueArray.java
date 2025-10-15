/*
=====================================================================================
📘 PROGRAM NAME  : Circular Queue Implementation using Array
📂 PACKAGE       : Queues.CircularQueueArray
💡 TOPIC         : Data Structures – Circular Queue (FIFO)
📅 DESCRIPTION   :
   This program demonstrates how to implement a Circular Queue using an Array.
   Unlike a normal queue, the Circular Queue efficiently utilizes memory by
   reusing spaces freed by dequeued elements (using modulo arithmetic).

=====================================================================================
🎯 QUEUE OPERATIONS:
1️⃣ add()    → Enqueue element at the rear (circularly)
2️⃣ remove() → Dequeue element from the front
3️⃣ peek()   → Return front element without removing
4️⃣ isEmpty()→ Check if the queue is empty
5️⃣ isFull() → Check if the queue is full

=====================================================================================
🧠 DRY RUN (Example):
Queue size = 5  
add(1) → front=0, rear=0  
add(2) → front=0, rear=1  
add(3) → front=0, rear=2  
remove() → front moves to 1  
add(4) → rear=(2+1)%5=3  
add(5) → rear=(3+1)%5=4  
add(6) → rear=(4+1)%5=0 → wraps around! (Circular behavior)

=====================================================================================
⚙️ ALGORITHM / LOGIC FLOW:
- Maintain two pointers: `front` and `rear`.
- Use modulo (`% size`) to wrap around when the end of the array is reached.
- Queue is full when `(rear + 1) % size == front`.
- Queue is empty when `front == -1 && rear == -1`.

=====================================================================================
📊 TIME COMPLEXITY:
✔ add()    → O(1)
✔ remove() → O(1)
✔ peek()   → O(1)
✔ isEmpty()→ O(1)

💾 SPACE COMPLEXITY:
✔ O(n) – For the array of size n

=====================================================================================
💡 KEY ADVANTAGES OF CIRCULAR QUEUE:
✔ Efficient memory utilization (no shifting)
✔ Constant time insertion & deletion
✔ Ideal for buffering data streams or scheduling tasks

=====================================================================================
💡 SAMPLE OUTPUT:
1
2
3
4
5
6
7
=====================================================================================
*/

public class CirculareQueueArray {

    // 🔹 Inner static class implementing circular queue logic
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        // Constructor → Initialize queue with given size
        Queue(int n) {
            arr = new int[n];
            size = n;
        }

        // 🔸 Check if queue is empty
        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        // 🔸 Check if queue is full (circular condition)
        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // 🔸 Add element (Enqueue)
        public static void add(int data) {
            if (isFull()) {
                System.out.println("⚠️ Queue is Full (Overflow)");
                return;
            }

            // First element addition
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // 🔸 Remove element (Dequeue)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("⚠️ Queue is Empty (Underflow)");
                return -1;
            }

            int result = arr[front];
            // Only one element in queue
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        // 🔸 Peek front element
        public static int peek() {
            if (isEmpty()) {
                System.out.println("⚠️ Queue is Empty");
                return -1;
            }
            return arr[front];
        }
    }

    // 🔹 Main method to demonstrate functionality
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("Dequeued: " + q.remove());
        q.add(6); // Reuses space (circular)
        System.out.println("Dequeued: " + q.remove());
        q.add(7);

        System.out.println("\nRemaining Queue Elements (Front → Rear):");
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

        System.out.println("\n✅ All elements dequeued successfully.");
    }
}
