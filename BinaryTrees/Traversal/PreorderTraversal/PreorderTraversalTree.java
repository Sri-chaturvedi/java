/*
=====================================================================================
📘 PROGRAM NAME  : Preorder Traversal of Binary Tree
📂 PACKAGE       : BinaryTrees.Traversal.PreorderTraversal
💡 TOPIC         : Tree Traversal using Recursion (Root → Left → Right)
📅 DESCRIPTION   :
   This program builds a Binary Tree from its preorder array representation 
   (with -1 representing null) and performs a **Preorder Traversal** to print all nodes.

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
1️⃣ Build a binary tree recursively from a preorder array
2️⃣ Print the preorder traversal (Root → Left → Right)
=====================================================================================
⚙️ LOGIC / ALGORITHM:
- Each array element represents a node in preorder order.
- `-1` means the node is null.
- Recursively:
  - Create a new node
  - Build its left subtree
  - Build its right subtree
=====================================================================================
📊 TIME COMPLEXITY: O(n)
📊 SPACE COMPLEXITY: O(h)  (h = height of tree, due to recursion stack)
=====================================================================================
*/

package BinaryTrees.Traversal.PreorderTraversal;

public class PreorderTraversalTree {

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

    // 🔹 BinaryTree class with buildTree() method
    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null; // null node encountered
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    // 🔹 Preorder Traversal: Root → Left → Right
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " "); // print root
        preorder(root.left);               // left subtree
        preorder(root.right);              // right subtree
    }

    // 🔹 Main method
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println("✅ Preorder Traversal of Binary Tree:");
        preorder(root);
        System.out.println("\nTraversal Complete!");
    }
}
