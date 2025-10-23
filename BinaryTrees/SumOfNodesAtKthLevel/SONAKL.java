/*
=====================================================================================
📘 PROGRAM NAME  : Sum of Nodes at K-th Level
📂 PACKAGE       : BinaryTrees.SumOfNodesAtKthLevel
💡 TOPIC         : Binary Tree | Level Order Traversal (BFS)
📅 DESCRIPTION   :
   This program calculates the sum of all node values present at a specific 
   level (K-th level) in a binary tree. The root is considered level 0.

=====================================================================================
🎯 OBJECTIVE:
Given a binary tree and an integer K, find the sum of all nodes at level K.

Example Input Tree:
            1
           / \
          2   3
         / \   \
        4   5   6

For K = 2 → Nodes = [4, 5, 6]

✅ Output: 15

=====================================================================================
⚙️ LOGIC / BFS FLOW:

1️⃣ Use a queue to perform Level Order Traversal (Breadth-First Search)
2️⃣ Add a `null` marker to track level boundaries.
3️⃣ Maintain a `level` counter:
    - When encountering `null`, increment `level`.
4️⃣ When `level == K`, add the current node’s data to `sum`.
5️⃣ Continue until the entire tree is traversed.

=====================================================================================
📊 TIME COMPLEXITY  : O(n) → Every node is visited once
📊 SPACE COMPLEXITY : O(n) → Queue stores nodes level by level
=====================================================================================
*/

package BinaryTrees.SumOfNodesAtKthLevel;

import java.util.LinkedList;
import java.util.Queue;

public class SONAKL {

    // 🔹 Node structure for the binary tree
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // 🔹 Utility class to build a binary tree from an array representation
    static class BinaryTree {
        static int idx = -1;

        /**
         * Builds a binary tree using preorder traversal.
         * -1 in the array represents a null node.
         */
        public static Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    /**
     * Calculates the sum of all nodes present at the K-th level of the binary tree.
     *
     * @param root The root node of the binary tree
     * @param k    The target level (0-indexed)
     * @return     The sum of node values at level K
     */
    public static int sumOfNodesAtKthLevel(Node root, int k) {
        if (root == null) {
            return 0;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null); // Level marker

        int level = 0;
        int sum = 0;

        // 🔹 Level Order Traversal (BFS)
        while (!queue.isEmpty()) {
            Node curr = queue.remove();

            if (curr == null) {
                level++;

                // End traversal if all levels are processed
                if (queue.isEmpty()) {
                    break;
                }

                // Mark the end of the next level
                queue.add(null);
            } else {
                // Add node’s data if it belongs to the K-th level
                if (level == k) {
                    sum += curr.data;
                }

                // Add child nodes to the queue
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
        }

        return sum;
    }

    // 🔹 Main Method
    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = BinaryTree.buildTree(nodes);

        int k = 2; // Target level
        int result = sumOfNodesAtKthLevel(root, k);

        System.out.println("✅ Sum of nodes at level " + k + " = " + result);
    }
}
