/*
=====================================================================================
📘 PROGRAM NAME  : Detect Cycle in Linked List (Floyd’s Cycle Detection Algorithm)
📂 PACKAGE       : LinkedList
💡 TOPIC         : Linked List – Detecting Loops
📅 DESCRIPTION   :
   This program detects whether a linked list contains a cycle (loop)
   using Floyd’s Cycle Detection Algorithm (also called Hare-Turtle method).

=====================================================================================
🎯 EXAMPLE:
Input  : 1 → 2 → 3 → 4 → 2 (cycle back to node 2)
Output : true

Input  : 1 → 2 → 3 → 4 → NULL
Output : false

=====================================================================================
🧠 APPROACH:
1️⃣ Use two pointers – `hare` (fast) and `turtle` (slow).
2️⃣ Move hare by 2 steps, turtle by 1 step.
3️⃣ If they ever meet → a cycle exists.
4️⃣ If hare reaches NULL → no cycle.

=====================================================================================
📊 TIME COMPLEXITY:
   O(N) → Traverses list only once

💾 SPACE COMPLEXITY:
   O(1) → Constant space, no extra data structures

=====================================================================================
💡 KEY POINTS:
✔ Fast & efficient cycle detection  
✔ Does not modify the list  
✔ Common interview question (Amazon, Google, Meta)

=====================================================================================
*/

public class LinkedListCycle {

    // 🔹 Node structure (Static inner class)
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // 🔹 Function to detect a cycle using Floyd's algorithm
    public static boolean hasCycle(Node head) {
        if (head == null) return false;

        Node hare = head;
        Node turtle = head;

        while (hare != null && hare.next != null) {
            hare = hare.next.next;   // move 2 steps
            turtle = turtle.next;    // move 1 step

            if (hare == turtle) {    // collision => cycle detected
                return true;
            }
        }

        return false; // no cycle found
    }

    // 🔹 Function to print list safely (stops after limited nodes to avoid infinite loop)
    public static void printList(Node head) {
        Node temp = head;
        int count = 0;

        while (temp != null && count < 15) { // prevent infinite print if loop exists
            System.out.print(temp.data + " -> ");
            temp = temp.next;
            count++;
        }

        System.out.println("NULL (or Cycle...)");
    }

    // 🔹 MAIN METHOD
    public static void main(String[] args) {
        // Step 1: Create Linked List: 1 → 2 → 3 → 4 → 5 → NULL
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original Linked List:");
        printList(head);

        // Step 2: Check without cycle
        System.out.println("\nCycle Present? " + hasCycle(head));

        // Step 3: Create a cycle manually (5 -> 2)
        head.next.next.next.next.next = head.next;

        // Step 4: Check again after creating cycle
        System.out.println("\nAfter Creating a Cycle:");
        System.out.println("Cycle Present? " + hasCycle(head));
    }
}
