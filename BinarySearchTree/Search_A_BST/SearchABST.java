/*
=====================================================================================
📘 PROGRAM NAME  : Search in a Binary Search Tree (BST)
📂 PACKAGE       : BinarySearchTree.Search_A_BST
💡 TOPIC         : Binary Search Tree | Recursion | Search Operation
📅 DESCRIPTION   :
   This program demonstrates how to **search for a specific key** in a 
   Binary Search Tree (BST).  
   It also includes the logic to build a BST using recursive insertion 
   and display it using inorder traversal (which prints elements in sorted order).

=====================================================================================
🎯 OBJECTIVE:
To build a Binary Search Tree and search for a key efficiently using recursion.

Example Input:
Values: [5, 7, 2, 4, 6, 11, 13, 17]
Search Key: 13

Constructed BST:
            5
           / \
          2   7
           \  / \
            4 6  11
                    \
                     13
                       \
                        17

✅ Output:
Inorder Traversal: 2 4 5 6 7 11 13 17  
Search Result: Found

=====================================================================================
⚙️ LOGIC / FLOW:

1️⃣ Insert(root, val):
   - If root is null → create a new node with value.
   - If val < root.data → insert into left subtree.
   - Else → insert into right subtree.

2️⃣ Inorder(root):
   - Traverse left subtree.
   - Visit (print) the root node.
   - Traverse right subtree.

3️⃣ Search(root, key):
   - If root is null → return false (key not found).
   - If root.data == key → return true.
   - If key < root.data → search in left subtree.
   - Else → search in right subtree.

=====================================================================================
📊 TIME COMPLEXITY  : 
   🔸 Average Case → O(log n)
   🔸 Worst Case   → O(n) (for skewed tree)

📊 SPACE COMPLEXITY : O(h) → due to recursion stack, where h = height of the BST
=====================================================================================
*/

package BinarySearchTree.Search_A_BST;

public class SearchABST {

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
            return new Node(val);
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    // 🔹 Inorder Traversal → Left → Root → Right
    public static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // 🔹 Search for a key in the BST using recursion
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false; // Base case: not found
        }

        if (root.data == key) {
            return true; // Key found
        } else if (key < root.data) {
            return search(root.left, key); // Search in left subtree
        } else {
            return search(root.right, key); // Search in right subtree
        }
    }

    // 🔹 Main Method
    public static void main(String[] args) {
        int[] values = {5, 7, 2, 4, 6, 11, 13, 17};
        Node root = null;

        // Build the BST
        for (int val : values) {
            root = insert(root, val);
        }

        // Display BST (Inorder Traversal → Sorted Order)
        System.out.print("✅ Inorder Traversal (Sorted Order): ");
        inorder(root);
        System.out.println();

        // Search for a given key
        int key = 13;
        System.out.println("🔍 Searching for key: " + key);
        if (search(root, key)) {
            System.out.println("✅ Result: Found");
        } else {
            System.out.println("❌ Result: Not Found");
        }
    }
}
