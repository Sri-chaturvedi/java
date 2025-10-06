/*
=====================================================================================
📘 PROGRAM NAME  : N-Queens Problem using Backtracking
📂 PACKAGE       : Backtracking.NQueens
💡 TOPIC         : Backtracking Algorithm in Java
📅 DESCRIPTION   : 
   The N-Queens problem is a classic recursion and backtracking example.
   Objective: Place N queens on an N×N chessboard such that no two queens
   threaten each other (no shared row, column, or diagonal).

=====================================================================================
🎯 PROBLEM STATEMENT:
Place N queens on an N×N chessboard and print all valid board configurations.

Example:
Input: n = 4
Output:
Solution 1:
.Q..
...Q
Q...
..Q.
------------------------
Solution 2:
..Q.
Q...
...Q
.Q..
------------------------
Total Solutions for 4-Queens: 2

=====================================================================================
🧠 DRY RUN (for n = 4):
Start → column 0
- Try row 0 → safe → place Q
  → Move to column 1
    - Row 1 ❌ (conflict)
    - Row 2 ✅ → place Q
      → Column 2 → ...
Eventually, all valid solutions are generated and saved.

=====================================================================================
⚙️ ALGORITHM / LOGIC FLOW:
1️⃣ Start from the first column (col = 0)
2️⃣ Try placing a queen in each row of the current column.
3️⃣ For each placement:
    - Check safety (no other queens attack it)
    - If safe → place the queen → recurse to next column
4️⃣ Base Case: All queens placed → save/print board configuration
5️⃣ If no valid row → backtrack (remove queen and try next row)
=====================================================================================
📊 TIME COMPLEXITY:
O(N!) → Each queen can potentially be placed in N rows recursively.

💾 SPACE COMPLEXITY:
O(N^2) → For board matrix and recursion stack.

=====================================================================================
💡 KEY POINTS:
✔ Uses Backtracking → Try → Recurse → Undo
✔ Base Case → All queens successfully placed
✔ Works for any N (4, 5, 8, etc.)
✔ Excellent for learning recursion and backtracking concepts
✔ Board stored as char[][] with 'Q' for queens and '.' for empty cells
=====================================================================================
*/

package Backtracking.NQueens;

import java.util.ArrayList;
import java.util.List;

public class Nqueens {

    // 🔹 Check if a queen can be safely placed at board[row][col]
    public boolean isSafe(int row, int col, char[][] board) {
        // Check horizontal row
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q') return false;
        }

        // Check vertical column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q') return false;
        }

        // Check upper-left diagonal
        int r = row;
        for (int c = col; c >= 0 && r >= 0; c--, r--) {
            if (board[r][c] == 'Q') return false;
        }

        // Check upper-right diagonal
        r = row;
        for (int c = col; c < board.length && r >= 0; c++, r--) {
            if (board[r][c] == 'Q') return false;
        }

        // Check lower-left diagonal
        r = row;
        for (int c = col; c >= 0 && r < board.length; c--, r++) {
            if (board[r][c] == 'Q') return false;
        }

        // Check lower-right diagonal
        r = row;
        for (int c = col; c < board.length && r < board.length; c++, r++) {
            if (board[r][c] == 'Q') return false;
        }

        return true; // ✅ Safe position
    }

    // 🔹 Save the current board configuration into allBoards
    public void saveBoard(char[][] board, List<List<String>> allBoards) {
        List<String> newBoard = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < board[0].length; j++) {
                row.append(board[i][j] == 'Q' ? 'Q' : '.'); // 'Q' for queen, '.' for empty
            }
            newBoard.add(row.toString());
        }
        allBoards.add(newBoard); // Add this configuration to the list of solutions
    }

    // 🔹 Backtracking helper function to place queens
    public void helper(char[][] board, List<List<String>> allBoards, int col) {
        // Base case: all queens placed
        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }

        // Try placing queen in each row of current column
        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';          // Place queen
                helper(board, allBoards, col + 1); // Recurse for next column
                board[row][col] = '.';          // Backtrack
            }
        }
    }

    // 🔹 Main solver function
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        // Initialize board with empty cells
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = '.';

        helper(board, allBoards, 0); // Start from first column
        return allBoards;
    }

    // 🟢 MAIN FUNCTION — Entry point
    public static void main(String[] args) {
        int n = 6; // Change N here

        Nqueens nq = new Nqueens();
        List<List<String>> solutions = nq.solveNQueens(n);

        int count = 1;
        for (List<String> board : solutions) {
            System.out.println("Solution " + count + ":");
            for (String row : board) System.out.println(row);
            System.out.println("------------------------");
            count++;
        }

        System.out.println("✅ Total Solutions for " + n + "-Queens: " + solutions.size());
    }
}
