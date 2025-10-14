/*
=====================================================================================
📘 PROGRAM NAME  : Check if Linked List is Palindrome
📂 PACKAGE       : LinkedList
💡 TOPIC         : Linked List – Palindrome Check using Two-Pointer Technique
📅 DESCRIPTION   :
   This program checks whether a singly linked list is a palindrome or not.

   ✅ A palindrome linked list reads the same forward and backward.
   Example: 1 → 2 → 3 → 2 → 1 → TRUE

=====================================================================================
🎯 EXAMPLE:
Input  : 1 → 2 → 3 → 2 → 1  
Output : TRUE  

Input  : 1 → 2 → 2 → 3  
Output : FALSE  

=====================================================================================
🧠 APPROACH:
1️⃣ Find the middle node using slow (turtle) and fast (hare) pointers.  
2️⃣ Reverse the second half of the list.  
3️⃣ Compare first and reversed second half node by node.  
4️⃣ If all corresponding nodes match → Palindrome.  
5️⃣ Optional: Reverse the second half again to restore the original list.

=====================================================================================
⚙️ ALGORITHM / LOGIC FLOW:

Step 1 → Find middle using two pointers  
Step 2 → Reverse the second half  
Step 3 → Compare both halves  
Step 4 → Return true if all elements match  

=====================================================================================
📊 TIME COMPLEXITY:
   O(N) → Single traversal (find middle, reverse, compare)

💾 SPACE COMPLEXITY:
   O(1) → In-place reversal (no extra space)

=====================================================================================
💡 KEY POINTS:
✔ Uses slow & fast pointer technique  
✔ Works for both even and odd length lists  
✔ Reversal is done only on the second half  
✔ Efficient and common interview question

=====================================================================================
*/

public class FindPalindromic {

    // 🔹 Definition of Node
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // 🔹 Function to reverse a linked list
    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    // 🔹 Function to find the middle of the list
    public static ListNode findMiddle(ListNode head) {
        ListNode hare = head;
        ListNode turtle = head;

        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }

        return turtle; // middle node
    }

    // 🔹 Function to check if the list is palindrome
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: Find middle
        ListNode middle = findMiddle(head);

        // Step 2: Reverse second half
        ListNode secondHalfStart = reverse(middle.next);

        // Step 3: Compare both halves
        ListNode firstHalfStart = head;
        while (secondHalfStart != null) {
            if (firstHalfStart.val != secondHalfStart.val) {
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }

        return true;
    }

    // 🔹 Helper to print the list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // 🔹 MAIN METHOD
    public static void main(String[] args) {
        // Create Linked List: 1 → 2 → 3 → 2 → 1
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        System.out.println("Linked List:");
        printList(head);

        // Check if palindrome
        boolean result = isPalindrome(head);

        System.out.println("\nIs Palindrome? " + result);
    }
}
