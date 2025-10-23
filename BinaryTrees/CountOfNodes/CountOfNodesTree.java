/*
=====================================================================================
📘 PROGRAM NAME  : Count Total Nodes in a Binary Tree
📂 PACKAGE       : BinaryTrees.CountOfNodes
💡 TOPIC         : Recursion in Binary Trees
✍️ AUTHOR        : Shree Chaturvedi
📅 DESCRIPTION   :
   This program builds a Binary Tree using preorder input 
   (where `-1` represents a null node) and calculates 
   the **total number of nodes** in the tree using recursion.

   Example Input Array:
   {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}

   Represents the tree:
                1
              /   \
             2     3
            / \     \
           4   5     6
=====================================================================================
🎯 OBJECTIVE:
Find the **total count of nodes** in the Binary Tree.

🧠 FORMULA:
Total Nodes = 1 (root) + Count of Left Subtree + Count of Right Subtree
=====================================================================================
⚙️ LOGIC / ALGORITHM:
1️⃣ If the tree (root) is null → return 0  
2️⃣ Recursively count nodes in left and right subtrees  
3️⃣ Return `1 + leftCount + rightCount`
=====================================================================================
📊 TIME COMPLEXITY : O(n)   → each node is visited once
📊 SPACE COMPLEXITY : O(h)  → recursion stack (where h = height of tree)
=====================================================================================
*/

package BinaryTrees.CountOfNodes;

public class CountOfNodesTree {

    // 🔹 Node class representing each tree element
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

    // 🔹 Binary Tree builder using Preorder traversal array
    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int[] nodes) {
            idx++;

            // Base Case: -1 represents a null node
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);   // build left subtree
            newNode.right = buildTree(nodes);  // build right subtree

            return newNode;
        }
    }

    // 🔹 Recursive function to count total nodes in the Binary Tree
    public static int countOfNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int leftCount = countOfNodes(root.left);
        int rightCount = countOfNodes(root.right);

        return leftCount + rightCount + 1; // 1 (for current node)
    }

    // 🔹 Main function
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println("✅ Total Number of Nodes in the Tree: " + countOfNodes(root));
    }
}
