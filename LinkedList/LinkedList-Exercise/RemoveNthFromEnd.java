/*
=====================================================================================
📘 PROGRAM NAME  : Remove Nth Node From End of a Linked List
📂 PACKAGE       : LinkedList
💡 TOPIC         : Linked List – Deletion Operation (LeetCode Style)
📅 DESCRIPTION   :
   This program demonstrates how to remove the Nth node from the end of a 
   singly linked list using a single traversal logic (two-pointer technique).

   ✅ Given a linked list, remove the node which is the Nth from the end of the list
   and return its head.

=====================================================================================
🎯 EXAMPLE:

Input  : 1 -> 2 -> 3 -> 4 -> 5,  n = 3  
Output : 1 -> 2 -> 4 -> 5  

Explanation:
- The 3rd node from the end is node 3.
- After deletion, list becomes [1, 2, 4, 5].

=====================================================================================
🧠 DRY RUN:

List : 1 → 2 → 3 → 4 → 5
n    : 3

Step 1 → Count nodes → size = 5  
Step 2 → indexToSearch = size - n = 2  
Step 3 → Move `prev` to node at index 2 (value 2)
Step 4 → Skip next node: prev.next = prev.next.next  
Result → 1 → 2 → 4 → 5  

=====================================================================================
⚙️ ALGORITHM / LOGIC FLOW:

1️⃣ Traverse the linked list to calculate its total size.  
2️⃣ If `n == size`, remove the head node.  
3️⃣ Otherwise, find the `(size - n)`th node from the start.  
4️⃣ Change pointers to skip the target node.  
5️⃣ Return the head of the modified list.

=====================================================================================
📊 TIME COMPLEXITY:
   O(N) → Single traversal to find size + one partial traversal to delete node

💾 SPACE COMPLEXITY:
   O(1) → In-place deletion, no extra space used

=====================================================================================
💡 KEY POINTS:
✔ Handles edge cases like deleting the head node  
✔ Efficient O(N) solution without additional data structures  
✔ Demonstrates pointer manipulation in a singly linked list  
✔ Common interview problem (LeetCode #19)

=====================================================================================
*/

public class RemoveNthFromEnd {

    // 🔹 Node Definition (Inner Static Class)
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // 🔹 Function to Remove Nth Node from End
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;

        // Step 1: Find size of list
        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            size++;
            curr = curr.next;
        }

        // Step 2: If removing the first (head) node
        if (n == size) {
            return head.next;
        }

        // Step 3: Traverse to (size - n)th node
        int indexToSearch = size - n;
        ListNode prev = head;
        int i = 1;
        while (i < indexToSearch) {
            prev = prev.next;
            i++;
        }

        // Step 4: Remove target node
        prev.next = prev.next.next;

        // Step 5: Return updated list head
        return head;
    }

    // 🔹 Utility Function to Print the Linked List
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // 🔹 MAIN FUNCTION
    public static void main(String[] args) {

        // Step 1: Create Linked List: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        printList(head);

        // Step 2: Remove 3rd node from end
        head = removeNthFromEnd(head, 3);

        System.out.println("\nAfter Removing 3rd Node from End:");
        printList(head);
    }
}
