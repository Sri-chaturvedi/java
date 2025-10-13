public class RemoveNthFromEnd {

    // ✅ Static inner class for ListNode
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // ✅ Function to remove Nth node from end
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;

        // Count size of the list
        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            size++;
            curr = curr.next;
        }

        // If deleting the head node
        if (n == size) {
            return head.next;
        }

        // Traverse to (size - n)th node
        int indexToSearch = size - n;
        ListNode prev = head;
        int i = 1;
        while (i < indexToSearch) {
            prev = prev.next;
            i++;
        }

        // Remove the node
        prev.next = prev.next.next;
        return head;
    }

    // ✅ Helper to print list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // ✅ Main function
    public static void main(String[] args) {
        // Build linked list manually: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        printList(head);

        // Remove 3rd node from end
        head = removeNthFromEnd(head, 3);

        System.out.println("\nAfter Removing 3rd Node from End:");
        printList(head);
    }
}
