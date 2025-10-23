/*
=====================================================================================
📘 PROGRAM NAME  : Postorder Traversal of Binary Tree
📂 PACKAGE       : BinaryTrees.Traversal.PostorderTraversal
💡 TOPIC         : Tree Traversal using Recursion (Left → Right → Root)
📅 DESCRIPTION   :
   This program builds a Binary Tree from a preorder array (where `-1` represents
   a null node) and performs a **Postorder Traversal** — visiting nodes in the
   order: **Left Subtree → Right Subtree → Root Node**.

   Example Input Array:
   {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}

   Represents the tree:
                1
              /   \
             2     3
            / \     \
           4   5     6
=====================================================================================
🎯 FUNCTIONALITY:
1️⃣ Build a Binary Tree recursively using preorder data  
2️⃣ Perform **Postorder Traversal** → Left Subtree → Right Subtree → Root
=====================================================================================
⚙️ LOGIC / ALGORITHM:
- Base Case → if root == null → return  
- Recursively:
   ➤ Visit Left Subtree  
   ➤ Visit Right Subtree  
   ➤ Print Root
=====================================================================================
📊 TIME COMPLEXITY : O(n)      (each node is visited once)
📊 SPACE COMPLEXITY : O(h)     (h = height of the tree due to recursion stack)
=====================================================================================
*/

package BinaryTrees.Traversal.PostorderTraversal;

public class PostorderTraversalTree {

    // 🔹 Node class representing each element of the tree
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // 🔹 Binary Tree builder from preorder array
    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);  // build left subtree
            newNode.right = buildTree(nodes); // build right subtree

            return newNode;
        }
    }

    // 🔹 Postorder Traversal → Left → Right → Root
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // 🔹 Main Function
    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println("✅ Postorder Traversal of Binary Tree:");
        postorder(root);
        System.out.println("\nTraversal Complete!");
    }
}
