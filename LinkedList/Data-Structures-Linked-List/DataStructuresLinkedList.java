/*
=====================================================================================
📘 PROGRAM NAME  : Singly Linked List Implementation in Java
📂 PACKAGE       : LinkedList
💡 TOPIC         : Data Structures – Linked List
📅 DESCRIPTION   : 
   This program demonstrates the core operations on a Singly Linked List in Java.
   A Linked List is a linear data structure in which elements (nodes) are connected 
   using references (pointers). Each node contains data and the address of the next node.

=====================================================================================
🎯 OPERATIONS COVERED:
1️⃣ Add an element at the beginning (addFirst)
2️⃣ Add an element at the end (addLast)
3️⃣ Delete an element from the beginning (deleteFirst)
4️⃣ Delete an element from the end (deleteLast)
5️⃣ Print all elements (printList)
6️⃣ Get the size of the linked list (getSize)

=====================================================================================
🧠 DRY RUN EXAMPLE:

Steps:
addFirst("a") → a -> NULL  
addFirst("is") → is -> a -> NULL  
addLast("list") → is -> a -> list -> NULL  
deleteFirst() → a -> list -> NULL  
deleteLast() → a -> NULL  

Final Output:
a -> NULL  
Size = 1

=====================================================================================
⚙️ ALGORITHM / LOGIC FLOW:
1️⃣ Create a `Node` class with two attributes: `data` and `next`.
2️⃣ Maintain a `head` pointer to the first node of the list.
3️⃣ For insertion:
    ➤ If list is empty → head = newNode
    ➤ Else traverse to the end and link the new node.
4️⃣ For deletion:
    ➤ Adjust the `head` pointer for deleting the first node.
    ➤ Traverse till second last node to remove the last node.
5️⃣ Keep track of total nodes using `size` variable.
=====================================================================================
📊 TIME COMPLEXITY:
✅ Add First     → O(1)
✅ Add Last      → O(n)
✅ Delete First  → O(1)
✅ Delete Last   → O(n)
✅ Print List    → O(n)

💾 SPACE COMPLEXITY:
O(n) → for storing all nodes in the list

=====================================================================================
💡 KEY POINTS:
✔ Dynamic size – unlike arrays  
✔ Insertion/Deletion at ends are easy  
✔ Traversal requires O(n) time  
✔ Base structure for Stack, Queue, Graph, etc.  

=====================================================================================
*/


public class DataStructuresLinkedList {
    Node head; // head node of the list
    private int size; // to keep track of number of nodes

    // Constructor initializes size to zero
    DataStructuresLinkedList() {
        this.size = 0;
    }

    // Inner class representing each node
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // 🔹 Add element at the beginning
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // 🔹 Add element at the end
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // 🔹 Print all nodes
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("NULL");
    }

    // 🔹 Delete the first node
    public void deleteFirst() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        size--;
        head = head.next;
    }

    // 🔹 Delete the last node
    public void deleteLast() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    // 🔹 Return the size of the linked list
    public int getSize() {
        return size;
    }

    // 🔹 Main function to demonstrate LinkedList operations
    public static void main(String[] args) {
        DataStructuresLinkedList list = new DataStructuresLinkedList();

        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("This");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println("Current Size: " + list.getSize());
        list.addFirst("This");
        list.printList();
        System.out.println("Updated Size: " + list.getSize());
    }
}
