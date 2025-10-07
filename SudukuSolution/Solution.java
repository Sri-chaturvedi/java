/*
=====================================================================================
📘 PROGRAM NAME  : Sudoku Solver using Backtracking
📂 PACKAGE       : SudukuSolution
💡 TOPIC         : Backtracking Algorithm in Java

📅 DESCRIPTION   : 
   This program solves a given 9×9 Sudoku puzzle using recursion and backtracking.
   The Sudoku puzzle consists of digits 1–9 placed in a 9×9 grid such that:
   - Each row contains all digits from 1 to 9 exactly once.
   - Each column contains all digits from 1 to 9 exactly once.
   - Each 3×3 sub-grid (box) contains all digits from 1 to 9 exactly once.

   The program recursively tries valid numbers in each empty cell ('.'), 
   backtracks when conflicts occur, and continues until the board is solved.
=====================================================================================

🎯 QUESTION:
Given a 9×9 Sudoku board, fill all empty cells ('.') with digits (1–9) 
such that the board becomes a valid Sudoku solution.

Example Input:
5 3 . . 7 . . . .
6 . . 1 9 5 . . .
. 9 8 . . . . 6 .
8 . . . 6 . . . 3
4 . . 8 . 3 . . 1
7 . . . 2 . . . 6
. 6 . . . . 2 8 .
. . . 4 1 9 . . 5
. . . . 8 . . 7 9

Example Output:
5 3 4 6 7 8 9 1 2
6 7 2 1 9 5 3 4 8
1 9 8 3 4 2 5 6 7
8 5 9 7 6 1 4 2 3
4 2 6 8 5 3 7 9 1
7 1 3 9 2 4 8 5 6
9 6 1 5 3 7 2 8 4
2 8 7 4 1 9 6 3 5
3 4 5 2 8 6 1 7 9
=====================================================================================

⚙️ ALGORITHM / LOGIC FLOW:
1️⃣ Traverse the Sudoku board cell by cell.
2️⃣ For every empty cell ('.'):
    - Try placing digits 1–9.
    - Check if placing that number is safe:
         ✔ No repetition in the same row.
         ✔ No repetition in the same column.
         ✔ No repetition in the corresponding 3×3 grid.
3️⃣ If safe, place the number and move to the next cell.
4️⃣ If a conflict arises later, backtrack and try the next possible number.
5️⃣ Continue until all cells are filled correctly.
=====================================================================================

📊 TIME COMPLEXITY:
O(9^(n×n)) → In the worst case, every empty cell tries digits 1–9 recursively.

💾 SPACE COMPLEXITY:
O(n×n) → For the recursion stack and board storage.

=====================================================================================

💡 KEY POINTS:
✔ Uses Recursion + Backtracking  
✔ Checks safety before placing any number  
✔ Automatically backtracks when an invalid configuration occurs  
✔ Works for any valid 9×9 Sudoku puzzle  
✔ Base case → When all cells are filled successfully  
=====================================================================================
*/

package SudukuSolution;

public class Solution {

    // 🔹 Function to check if it's safe to place a number in board[row][col]
    public boolean isSafe(char[][] board, int row, int col, int number) {
        // Check row and column for duplicates
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char)(number + '0') || board[row][i] == (char)(number + '0')) {
                return false; // ❌ Number already exists
            }
        }

        // Check the 3×3 grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == (char)(number + '0')) {
                    return false; // ❌ Found in sub-grid
                }
            }
        }

        return true; // ✅ Safe position
    }

    // 🔹 Recursive helper function (core backtracking logic)
    public boolean helper(char[][] board, int row, int col) {
        // Base Case: If we've reached the end of the board
        if (row == board.length) {
            return true;
        }

        int nrow = 0;
        int ncol = 0;

        // Move to next cell
        if (col != board.length - 1) {
            nrow = row;
            ncol = col + 1;
        } else {
            nrow = row + 1;
            ncol = 0;
        }

        // Skip already filled cells
        if (board[row][col] != '.') {
            return helper(board, nrow, ncol);
        } else {
            // Try placing digits 1 to 9
            for (int i = 1; i <= 9; i++) {
                if (isSafe(board, row, col, i)) {
                    board[row][col] = (char)(i + '0'); // Place number
                    if (helper(board, nrow, ncol)) {
                        return true; // ✅ Solved
                    }
                    board[row][col] = '.'; // 🔁 Backtrack
                }
            }
        }

        return false; // ❌ No valid number found
    }

    // 🔹 Entry method to solve Sudoku
    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }

    // 🔹 MAIN FUNCTION — runs the solver and displays result
    public static void main(String[] args) {
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        Solution solver = new Solution();
        solver.solveSudoku(board);

        System.out.println("✅ Solved Sudoku Board:\n");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
