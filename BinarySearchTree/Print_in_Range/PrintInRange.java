/*
=====================================================================================
📘 PROGRAM NAME  : Print Nodes in a Range in BST
📂 PACKAGE       : BinarySearchTree.Print_in_Range
💡 TOPIC         : Binary Search Tree | Recursion | Range Query
📅 DESCRIPTION   :
   This program prints all nodes of a Binary Search Tree (BST) whose values lie
   within a given range [X, Y]. The nodes are printed in ascending order (inorder).

=====================================================================================
🎯 OBJECTIVE:
Efficiently print all BST nodes in the range [X, Y] using recursion.

Example Input:
BST Inorder: 1 3 4 5 6 8 10 11 14
Range: [6, 10]

✅ Output: 6 8 10

=====================================================================================
⚙️ LOGIC / RECURSION FLOW:

1️⃣ Base Case:
   - If current node is null → return

2️⃣ Check current node value:
   - If node.data in [X, Y] → 
       • Recurse left
       • Print node
       • Recurse right
   - If node.data < X → recurse right (ignore left subtree)
   - If node.data > Y → recurse left (ignore right subtree)

=====================================================================================
📊 TIME COMPLEXITY  : O(n) → worst case, n = number of nodes
📊 SPACE COMPLEXITY : O(h) → recursion stack, h = height of BST
=====================================================================================
*/

package BinarySearchTree.Print_in_Range;

public class PrintInRange {

    // 🔹 Node structure for BST
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // 🔹 Insert a value in BST
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else if (root.data < val) {
            root.right = insert(root.right, val);
        }

        return root;
    }

    // 🔹 Inorder traversal (prints BST in sorted order)
    public static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // 🔹 Print nodes in range [X, Y]
    public static void printInRange(Node root, int X, int Y) {
        if (root == null) return;

        // Case 1: Node within range
        if (root.data >= X && root.data <= Y) {
            printInRange(root.left, X, Y);
            System.out.print(root.data + " ");
            printInRange(root.right, X, Y);
        }
        // Case 2: Node data > Y → ignore right subtree
        else if (root.data > Y) {
            printInRange(root.left, X, Y);
        }
        // Case 3: Node data < X → ignore left subtree
        else {
            printInRange(root.right, X, Y);
        }
    }

    // 🔹 Main method
    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        // Build BST
        for (int val : values) {
            root = insert(root, val);
        }

        System.out.print("Inorder Traversal: ");
        inorder(root);
        System.out.println();

        System.out.print("Nodes in Range [6, 10]: ");
        printInRange(root, 6, 10);
        System.out.println();
    }
}
