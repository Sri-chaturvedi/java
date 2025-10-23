/*
=====================================================================================
📘 PROGRAM NAME  : Level Order Traversal of Binary Tree (BFS)
📂 PACKAGE       : BinaryTrees.Traversal.LevelOrderTraversal
💡 TOPIC         : Tree Traversal using Queue (Breadth-First Search)
📅 DESCRIPTION   :
   This program builds a Binary Tree from a preorder array (where `-1` represents
   a null node) and performs a **Level Order Traversal** — also known as
   **Breadth-First Search (BFS)**.

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
1️⃣ Build a Binary Tree recursively  
2️⃣ Perform **Level Order Traversal** using a Queue  
3️⃣ Print nodes level by level
=====================================================================================
⚙️ LOGIC / ALGORITHM:
- Use a Queue for BFS traversal
- Add root and a `null` marker (indicating end of a level)
- While queue is not empty:
    ➤ Pop one node at a time  
    ➤ Print its data  
    ➤ Push its left & right children  
    ➤ When null is encountered → print new line and enqueue another null
=====================================================================================
📊 TIME COMPLEXITY : O(n)   (visits each node once)
📊 SPACE COMPLEXITY : O(n)  (queue holds nodes of each level)
=====================================================================================
*/

package BinaryTrees.Traversal.LevelOrderTraversal;

import java.util.LinkedList;
import java.util.Queue;

public class LevelorderTraversalTree {

    // 🔹 Node class for Binary Tree
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

    // 🔹 Binary Tree builder class
    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int[] nodes) {
            idx++;

            // Base case: -1 means no node (null)
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);  // build left subtree
            newNode.right = buildTree(nodes); // build right subtree

            return newNode;
        }
    }

    // 🔹 Level Order Traversal → BFS using Queue
    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null); // level separator

        while (!q.isEmpty()) {
            Node currNode = q.remove();

            if (currNode == null) {
                System.out.println(); // new line after each level

                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null); // add marker for next level
                }
            } else {
                System.out.print(currNode.data + " ");
                
                // enqueue children
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    // 🔹 Main Function
    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println("✅ Level Order Traversal (BFS) of Binary Tree:");
        levelOrder(root);
    }
}
