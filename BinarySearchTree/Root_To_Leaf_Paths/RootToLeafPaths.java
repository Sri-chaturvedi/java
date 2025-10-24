/*
=====================================================================================
📘 PROGRAM NAME  : Print Root-to-Leaf Paths in BST
📂 PACKAGE       : BinarySearchTree.Root_To_Leaf_Paths
💡 TOPIC         : Binary Search Tree | Recursion | Root-to-Leaf Path
📅 DESCRIPTION   :
   This program prints all root-to-leaf paths in a Binary Search Tree (BST). 
   A root-to-leaf path is a sequence of nodes starting from the root node and 
   ending at a leaf node.

=====================================================================================
🎯 OBJECTIVE:
Print all paths from the root to each leaf node using recursion.

Example Input:
BST Inorder Traversal: 1 3 4 5 6 8 10 11 14

✅ Output:
8->5->3->1->
8->5->3->4->
8->5->6->
8->10->11->
8->10->14->

=====================================================================================
⚙️ LOGIC / RECURSION FLOW:

1️⃣ Base Case:
   - If current node is null → return

2️⃣ Process Current Node:
   - Add node's data to the current path

3️⃣ Leaf Check:
   - If node is leaf → print the path

4️⃣ Recursive Case:
   - Recurse left and right

5️⃣ Backtracking:
   - Remove the current node from path after returning from recursion

=====================================================================================
📊 TIME COMPLEXITY  : O(n) → visit each node once
📊 SPACE COMPLEXITY : O(h) → recursion stack + path storage, h = height of tree
=====================================================================================
*/

package BinarySearchTree.Root_To_Leaf_Paths;

import java.util.ArrayList;

public class RootToLeafPaths {

    // 🔹 Node structure for BST
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // 🔹 Insert value into BST
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

    // 🔹 Print a single path
    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->>");
        }
        System.out.println();
    }

    // 🔹 Print all root-to-leaf paths
    public static void printRootToLeaf(Node root, ArrayList<Integer> path) {
        if (root == null) return;

        // Add current node to path
        path.add(root.data);

        // Leaf node → print path
        if (root.left == null && root.right == null) {
            printPath(path);
        } else {
            // Recurse left and right
            printRootToLeaf(root.left, path);
            printRootToLeaf(root.right, path);
        }

        // Backtrack → remove current node
        path.remove(path.size() - 1);
    }

    // 🔹 Main Method
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

        System.out.println("Root-to-Leaf Paths:");
        printRootToLeaf(root, new ArrayList<>());
    }
}
