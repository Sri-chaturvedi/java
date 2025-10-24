/*
=====================================================================================
📘 PROGRAM NAME  : Build a Binary Search Tree (BST)
📂 PACKAGE       : BinarySearchTree.Build_A_BST
💡 TOPIC         : Binary Search Tree | Recursion | Inorder Traversal
📅 DESCRIPTION   :
   This program builds a Binary Search Tree (BST) by inserting nodes one by one 
   from an array of integer values. It then performs an inorder traversal 
   to display the BST elements in sorted order.

=====================================================================================
🎯 OBJECTIVE:
To construct a BST and demonstrate how inorder traversal retrieves 
values in ascending order.

Example Input:
Values: [5, 3, 1, 7, 9, 2, 6]

Constructed BST:
            5
           / \
          3   7
         / \   \
        1   4   9
         \
          2

✅ Output (Inorder Traversal): 1 2 3 5 6 7 9

=====================================================================================
⚙️ LOGIC / FLOW:

1️⃣ Insert(root, val):
   - If root is null → create a new node with val.
   - If val < root → recursively insert into left subtree.
   - If val > root → recursively insert into right subtree.

2️⃣ Inorder(root):
   - Traverse the left subtree.
   - Visit (print) the current node.
   - Traverse the right subtree.

3️⃣ Main:
   - Insert all elements from the array into the BST.
   - Perform inorder traversal to display sorted order.

=====================================================================================
📊 TIME COMPLEXITY  : 
   - Average Case: O(log n) for each insertion → O(n log n) total
   - Worst Case: O(n²) (for skewed BST)

📊 SPACE COMPLEXITY : O(h) → due to recursion stack (h = height of the tree)
=====================================================================================
*/

package BinarySearchTree.Build_A_BST;

public class BuildABST {

    // 🔹 Node structure for the Binary Search Tree
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // 🔹 Insert a new value into the BST recursively
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val); // Base case: create new node
        }

        if (val < root.data) {
            root.left = insert(root.left, val); // Go left
        } else {
            root.right = insert(root.right, val); // Go right
        }

        return root; // Return the (possibly updated) root
    }

    // 🔹 Inorder Traversal → Left → Root → Right
    public static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // 🔹 Main Method
    public static void main(String[] args) {
        int[] values = {5, 3, 1, 7, 9, 2, 6};
        Node root = null;

        // Insert values into the BST
        for (int val : values) {
            root = insert(root, val);
        }

        // Display BST in sorted order (Inorder Traversal)
        System.out.print("✅ Inorder Traversal (Sorted Order): ");
        inorder(root);
        System.out.println();
    }
}
