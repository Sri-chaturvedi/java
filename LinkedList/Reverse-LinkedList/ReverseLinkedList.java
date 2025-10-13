/*
=====================================================================================
📘 PROGRAM NAME  : Reverse a Linked List (3 Approaches)
📂 PACKAGE       : LinkedList
💡 TOPIC         : Data Structures – Linked List
📅 DESCRIPTION   :
   Demonstrates three methods to reverse a singly linked list in Java:
   1️⃣ Iterative Method (No extra space)
   2️⃣ Recursive Method (Elegant recursion)
   3️⃣ Collections Method (Using Java's built-in Collections utility)

=====================================================================================
⚙️ APPROACHES:
1️⃣ **Iterative Method**
    ➤ Traverse through the list, reverse links one by one.
    ➤ Time Complexity  : O(n)
    ➤ Space Complexity : O(1)

2️⃣ **Recursive Method**
    ➤ Recurse till the end and reverse pointers while returning.
    ➤ Time Complexity  : O(n)
    ➤ Space Complexity : O(n) (stack recursion)

3️⃣ **Collections.reverse()**
    ➤ Works with Java’s built-in LinkedList.
    ➤ Time Complexity  : O(n)
    ➤ Space Complexity : O(1)

=====================================================================================
*/

import java.util.*;

public class ReverseLinkedList {

    // Node class for Linked List
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of Linked List
    Node head;

    // Add node at the end
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    // Print Linked List
    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("NULL");
    }

    // ===============================================
    // 🔹 1. ITERATIVE METHOD
    // ===============================================
    public void reverseListIterative() {
        if (head == null || head.next == null)
            return;

        Node prevNode = head;
        Node currNode = head.next;

        while (currNode != null) {
            Node nextNode = currNode.next; // store next
            currNode.next = prevNode;      // reverse link
            prevNode = currNode;           // move prev forward
            currNode = nextNode;           // move curr forward
        }

        head.next = null; // old head becomes tail
        head = prevNode;  // new head
    }

    // ===============================================
    // 🔹 2. RECURSIVE METHOD
    // ===============================================
    public Node reverseListRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    // ===============================================
    // 🔹 3. COLLECTIONS METHOD
    // ===============================================
    public static void reverseUsingCollections() {
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println("Before Reversing (Collections): " + list2);

        Collections.reverse(list2);
        System.out.println("After Reversing (Collections):  " + list2);
    }

    // ===============================================
    // 🔹 MAIN METHOD
    // ===============================================
    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();

        // Add elements
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        System.out.println("Original Linked List:");
        list.printList();

        // Iterative Reversal
        list.reverseListIterative();
        System.out.println("\nAfter Iterative Reverse:");
        list.printList();

        // Recursive Reversal
        list.head = list.reverseListRecursive(list.head);
        System.out.println("\nAfter Recursive Reverse:");
        list.printList();

        // Collections Method
        System.out.println("\nUsing Collections.reverse():");
        reverseUsingCollections();
    }
}
