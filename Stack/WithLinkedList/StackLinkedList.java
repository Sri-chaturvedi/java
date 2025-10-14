/*
=====================================================================================
📘 PROGRAM NAME  : Stack Implementation using Linked List
📂 PACKAGE       : WithLinkedList
💡 TOPIC         : Data Structures – Stack (Linked List Implementation)
📅 DESCRIPTION   :
   This program demonstrates how to implement a Stack using a Linked List in Java.
   Stack is a LIFO (Last In, First Out) data structure, where the most recently added
   element is removed first.

=====================================================================================
🎯 STACK OPERATIONS:
1️⃣ push()  → Add element to the top of the stack  
2️⃣ pop()   → Remove element from the top  
3️⃣ peek()  → View the top element without removing it  
4️⃣ isEmpty() → Check if the stack is empty  

=====================================================================================
🧠 EXAMPLE DRY RUN:
Stack s = [ ]

push(1) → [1]  
push(2) → [2, 1]  
push(3) → [3, 2, 1]  
peek()  → 3  
pop()   → removes 3 → [2, 1]  

Output:  
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
O(N) → For N stack elements stored in linked nodes.

=====================================================================================
💡 KEY POINTS:
✔ Stack built using Linked List avoids overflow (like in arrays).  
✔ Efficient memory use — grows dynamically.  
✔ Common interview topic for data structure fundamentals.

=====================================================================================
*/

package WithLinkedList;

public class StackLinkedList {

    // 🔹 Node class for Linked List
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // 🔹 Stack class built using Linked List
    static class Stack {
        private static Node head; // top of the stack

        // Check if the stack is empty
        public static boolean isEmpty() {
            return head == null;
        }

        // Push an element onto the stack
        public static void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head; // link new node to current top
            head = newNode;      // make new node the new top
        }

        // Pop (remove) an element from the top
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow ⚠️");
                return -1;
            }
            int top = head.data;
            head = head.next; // move top pointer down
            return top;
        }

        // Peek (view) the top element
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty ⚠️");
                return -1;
            }
            return head.data;
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

        // Pop and print all elements (LIFO order)
        System.out.println("🧾 Stack Output (Top to Bottom):");
        while (!s.isEmpty()) {
            System.out.println("Top: " + s.peek());
            s.pop();
        }

        System.out.println("\n✅ Stack is now empty.");
    }
}
