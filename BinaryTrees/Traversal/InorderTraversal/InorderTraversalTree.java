/*
=====================================================================================
📘 PROGRAM NAME  : Inorder Traversal of Binary Tree
📂 PACKAGE       : BinaryTrees.Traversal.InorderTraversal
💡 TOPIC         : Tree Traversal using Recursion (Left → Root → Right)
📅 DESCRIPTION   :
   This program constructs a Binary Tree from a preorder array representation 
   (where -1 represents null nodes) and performs an **Inorder Traversal** 
   to print all nodes in sorted hierarchical order (Left → Root → Right).

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
1️⃣ Build a binary tree recursively using preorder data  
2️⃣ Perform **Inorder Traversal** → Left Subtree → Root → Right Subtree
=====================================================================================
⚙️ LOGIC / ALGORITHM:
- Base Case → if root == null → return  
- Recursively:
   ➤ Traverse Left Subtree  
   ➤ Print Root  
   ➤ Traverse Right Subtree
=====================================================================================
📊 TIME COMPLEXITY : O(n)      (each node is visited once)
📊 SPACE COMPLEXITY : O(h)     (h = height of the tree due to recursion stack)
=====================================================================================
*/

package BinaryTrees.Traversal.InorderTraversal;

public class InorderTraversalTree {

    // 🔹 Node class
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

    // 🔹 Inorder Traversal → Left → Root → Right
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // 🔹 Main function
    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println("✅ Inorder Traversal of Binary Tree:");
        inorder(root);
        System.out.println("\nTraversal Complete!");
    }
}
