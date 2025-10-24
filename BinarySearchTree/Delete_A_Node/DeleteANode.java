/*
=====================================================================================
📘 PROGRAM NAME  : Delete a Node in Binary Search Tree (BST)
📂 PACKAGE       : BinarySearchTree.Delete_A_Node
💡 TOPIC         : Binary Search Tree | Deletion Operation | Recursion
📅 DESCRIPTION   :
   This program demonstrates how to delete a node from a Binary Search Tree (BST)
   while maintaining the BST property. Deletion can occur in three main cases:
   1️⃣ Node is a leaf (no children)
   2️⃣ Node has one child
   3️⃣ Node has two children (replace with inorder successor)

=====================================================================================
🎯 OBJECTIVE:
Efficiently delete a specific node (key) from a BST while keeping the structure valid.

Example Input:
BST Inorder before deletion: 1 3 4 5 6 8 10 11 14
Delete key: 6

✅ Output:
BST Inorder after deletion : 1 3 4 5 8 10 11 14

=====================================================================================
⚙️ LOGIC / RECURSION FLOW:

1️⃣ Search for the node to delete.
2️⃣ Handle 3 deletion cases:
   - Case 1: Leaf Node → directly remove it.
   - Case 2: One Child → replace node with its child.
   - Case 3: Two Children → 
       • Find inorder successor (smallest node in right subtree)
       • Replace current node’s data with successor’s data
       • Recursively delete successor node.

=====================================================================================
📊 TIME COMPLEXITY  : O(h) → h = height of BST (O(log n) for balanced tree)
📊 SPACE COMPLEXITY : O(h) → recursion stack
=====================================================================================
*/

package BinarySearchTree.Delete_A_Node;

public class DeleteANode {

    // 🔹 Node structure for BST
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // 🔹 Insert a value into BST
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    // 🔹 Inorder traversal (Left → Root → Right)
    public static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // 🔹 Delete a node in BST
    public static Node deleteNode(Node root, int key) {
        if (root == null) {
            return null;
        }

        if (root.data > key) {
            root.left = deleteNode(root.left, key);
        } else if (root.data < key) {
            root.right = deleteNode(root.right, key);
        } else {
            // Node found — handle deletion cases

            // Case 1: No child (leaf)
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: One child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            // Case 3: Two children → find inorder successor
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = deleteNode(root.right, IS.data);
        }

        return root;
    }

    // 🔹 Find inorder successor (smallest value in right subtree)
    public static Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // 🔹 Main method
    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        // Build BST
        for (int val : values) {
            root = insert(root, val);
        }

        System.out.print("Inorder before deletion: ");
        inorder(root);
        System.out.println();

        // Delete node 6
        root = deleteNode(root, 6);

        System.out.print("Inorder after deleting 6: ");
        inorder(root);
        System.out.println();
    }
}
