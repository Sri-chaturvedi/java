/*
=====================================================================================
📘 PROGRAM NAME  : Sudoku Solver using Backtracking
📂 PACKAGE       : SudukuSolution
💡 TOPIC         : Backtracking Algorithm in Java

📅 DESCRIPTION   : 
   This program solves a 9×9 Sudoku puzzle using Recursion and Backtracking.
   It systematically tries to fill empty cells with digits (1–9) ensuring that 
   no number is repeated in any row, column, or 3×3 subgrid.

=====================================================================================
🎯 QUESTION:
Solve a given 9×9 Sudoku board such that:
1️⃣ Every row contains digits 1–9 without repetition.
2️⃣ Every column contains digits 1–9 without repetition.
3️⃣ Every 3×3 subgrid contains digits 1–9 without repetition.

Input cells with '.' represent empty spaces.

=====================================================================================
🧠 DRY RUN (Concept):
Start at cell (0,0)
→ If filled → move to next cell.
→ If empty:
     - Try numbers 1–9
     - If valid → place it → move forward recursively
     - If invalid → backtrack (reset to '.')
Continue until the board is completely filled.

=====================================================================================
⚙️ ALGORITHM / LOGIC FLOW:
1️⃣ Traverse the Sudoku board cell by cell.
2️⃣ If cell already contains a number, skip it.
3️⃣ If empty:
     - Try placing digits 1–9.
     - Use `isSafe()` to check if it’s valid:
         → No repetition in the row.
         → No repetition in the column.
         → No repetition in the 3×3 subgrid.
4️⃣ If valid → place the digit and recurse to the next cell.
5️⃣ If no valid digit → backtrack (undo placement).
6️⃣ Continue until the board is completely solved.

=====================================================================================
📊 TIME COMPLEXITY:
O(9^(N*N)) in the worst case (since each cell can take 9 possibilities).

💾 SPACE COMPLEXITY:
O(N*N) → For recursion stack and Sudoku board.

=====================================================================================
💡 KEY POINTS:
✔ Based on Recursion + Backtracking  
✔ Similar logic as N-Queens or Permutations  
✔ Efficient pruning using `isSafe()` validation  
✔ Teaches constraint satisfaction and recursive search  

=====================================================================================
*/

package SudukuSolution;

public class solution2 {

    // 🔹 Check if it's safe to place a number at board[row][col]
    public boolean isSafe(char[][] board, int row, int col, int number) {
        // Loop through the entire board to check the row and column
        for (int i = 0; i < board.length; i++) { 
            // Check if number already exists in same column or row
            if (board[i][col] == (char) (number + '0') || board[row][i] == (char) (number + '0')) {
                return false;  // ❌ Not safe to place
            }
        }

        // Determine the starting row and column for the current 3×3 grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        // Check within the 3×3 subgrid for duplicates
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == (char) (number + '0')) {
                    return false; // ❌ Not safe within subgrid
                }
            }
        }

        return true; // ✅ Safe position
    }

    // 🔹 Recursive function to solve Sudoku using Backtracking
    public boolean helper(char[][] board, int row, int col) {
        // Base Case → If reached end of board, solution is found
        if (row == board.length) {
            return true; 
        }

        int nrow = 0; // Next row
        int ncol = 0; // Next column

        // Move to next column or next row
        if (col != board.length - 1) {
            nrow = row;        // Stay in same row
            ncol = col + 1;    // Move to next column
        } else {
            nrow = row + 1;    // Move to next row
            ncol = 0;          // Reset to first column
        }

        // If current cell is prefilled, skip it
        if (board[row][col] != '.') {
            return helper(board, nrow, ncol);
        } else {
            // Try placing numbers from 1–9
            for (int i = 1; i <= 9; i++) {
                if (isSafe(board, row, col, i)) {               // ✅ Safe placement
                    board[row][col] = (char) (i + '0');         // Place digit
                    if (helper(board, nrow, ncol)) {            // Recurse for next cells
                        return true;
                    }
                    board[row][col] = '.';                      // 🔙 Backtrack if not successful
                }
            }
        }
        return false; // ❌ No valid number fits here
    }

    // 🔹 Entry point to solve Sudoku
    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }

    // 🔹 Driver Code
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

        solution2 solver = new solution2();
        solver.solveSudoku(board);

        System.out.println("\n✅ Solved Sudoku:\n");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
