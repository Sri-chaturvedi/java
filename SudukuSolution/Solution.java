// package SudukuSolution;

// public class Solution {
// public boolean isSafe(char[][] board, int row, int col, int number){
//     //row & column
//     for(int i =0; i<board.length; i++){
//         if (board[i][col] == (char)(number + '0')) {
//             return false;
//         }
//         if (board[row][i] == (char)(number + '0')) {
//             return false;
//         }
//     }

//     //grid
//     int sr = (row/3) *3;
//     int sc = (col/3)*3;

//     for(int i=sr; i<sr+3; i++){
//         for(int j=sc; j<sc+3; j++){
//             if (board[i][j]  == (char)(number + '0')){
//                 return false;
//             }
//         }
//     }
//     return true;
// }

//     public boolean helper (char [][] board, int row, int col){
//         if (row == board.length) {
//             return true;
//         }


//         int nrow = 0;
//         int ncol = 0;
//         if (col != board.length-1) {
//             nrow = row;
//             ncol = col+1;
//         }else{
//             nrow = row+1;
//             ncol = 0;
//         }

//         if (board[row][col] != '.') {
//             if (helper(board, nrow, ncol)) {
//                 return true;
//             }
//         }else{
//             for(int i = 1; i<=9; i++){
//                 if (isSafe(board,row,col,i)) {
//                     board[row][col] = (char)(i+'0');
//                     if (helper(board, nrow, ncol)) {
//                         return true;
//                     }
//                 }else{
//                     board[row][col] = '.';
//                 }
//             }
//         }
//         return false;
//     }

//     public void soleveSudoku(char[][] board){
//         helper(board, 0, 0);
//     }
// }


//** */==>> With main function


// package SudukuSolution;

// public class Solution {

//     // Check if placing number is valid (row, column, 3x3 grid)
//     public boolean isSafe(char[][] board, int row, int col, int number){
//         // Check row and column
//         for(int i = 0; i < board.length; i++){
//             if (board[i][col] == (char)(number + '0') || board[row][i] == (char)(number + '0')) {
//                 return false;
//             }
//         }

//         // Check 3x3 grid
//         int sr = (row / 3) * 3;
//         int sc = (col / 3) * 3;

//         for(int i = sr; i < sr + 3; i++){
//             for(int j = sc; j < sc + 3; j++){
//                 if (board[i][j] == (char)(number + '0')){
//                     return false;
//                 }
//             }
//         }

//         return true;
//     }

//     // Recursive backtracking function
//     public boolean helper(char[][] board, int row, int col){
//         if (row == board.length) {
//             return true; // Reached end of board
//         }

//         int nrow = 0;
//         int ncol = 0;

//         // Move to next cell
//         if (col != board.length - 1) {
//             nrow = row;
//             ncol = col + 1;
//         } else {
//             nrow = row + 1;
//             ncol = 0;
//         }

//         if (board[row][col] != '.') {
//             return helper(board, nrow, ncol); // Already filled, skip
//         } else {
//             for (int i = 1; i <= 9; i++) {
//                 if (isSafe(board, row, col, i)) {
//                     board[row][col] = (char)(i + '0');
//                     if (helper(board, nrow, ncol)) {
//                         return true;
//                     }
//                     board[row][col] = '.'; // Backtrack
//                 }
//             }
//         }

//         return false; // No valid number found
//     }

//     // Entry point to solve Sudoku
//     public void solveSudoku(char[][] board){
//         helper(board, 0, 0);
//     }

//     // MAIN METHOD TO RUN THE SUDOKU SOLVER
//     public static void main(String[] args) {
//         char[][] board = {
//             {'5','3','.','.','7','.','.','.','.'},
//             {'6','.','.','1','9','5','.','.','.'},
//             {'.','9','8','.','.','.','.','6','.'},
//             {'8','.','.','.','6','.','.','.','3'},
//             {'4','.','.','8','.','3','.','.','1'},
//             {'7','.','.','.','2','.','.','.','6'},
//             {'.','6','.','.','.','.','2','8','.'},
//             {'.','.','.','4','1','9','.','.','5'},
//             {'.','.','.','.','8','.','.','7','9'}
//         };

//         Solution solver = new Solution();
//         solver.solveSudoku(board);

//         // Print solved Sudoku board
//         for (int i = 0; i < 9; i++) {
//             for (int j = 0; j < 9; j++) {
//                 System.out.print(board[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }





//** */==>> with comments on this code 

// Define the package name (optional based on your project structure)
package SudukuSolution;

// Define the Solution class
public class Solution {

    // Function to check whether it's safe to place a number at a specific position
    public boolean isSafe(char[][] board, int row, int col, int number){
        // Loop through each row and column
        for(int i = 0; i < board.length; i++){
            // Check if the number already exists in the current column or row
            if (board[i][col] == (char)(number + '0') || board[row][i] == (char)(number + '0')) {
                return false; // If found, it's not safe to place the number
            }
        }

        // Calculate starting row (sr) and starting column (sc) of the 3x3 subgrid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        // Loop through the 3x3 grid to check for duplicates
        for(int i = sr; i < sr + 3; i++){
            for(int j = sc; j < sc + 3; j++){
                // If number already exists in the 3x3 grid, return false
                if (board[i][j] == (char)(number + '0')){
                    return false;
                }
            }
        }

        // If no conflicts, it's safe to place the number
        return true;
    }

    // Recursive function to solve Sudoku using backtracking
    public boolean helper(char[][] board, int row, int col){
        // If we have reached beyond the last row, Sudoku is solved
        if (row == board.length) {
            return true;
        }

        int nrow = 0; // Next row
        int ncol = 0; // Next column

        // Move to the next cell in the row
        if (col != board.length - 1) {
            nrow = row;        // stay on the same row
            ncol = col + 1;    // move to next column
        } else {
            // Move to the first column of the next row
            nrow = row + 1;
            ncol = 0;
        }

        // If the current cell is already filled, skip to the next cell
        if (board[row][col] != '.') {
            return helper(board, nrow, ncol);
        } else {
            // Try placing digits 1 to 9
            for (int i = 1; i <= 9; i++) {
                // Check if placing i is safe
                if (isSafe(board, row, col, i)) {
                    // Place the digit (converted to char) on the board
                    board[row][col] = (char)(i + '0');

                    // Recurse to solve rest of the board
                    if (helper(board, nrow, ncol)) {
                        return true; // If successful, return true
                    }

                    // If it doesn't lead to solution, backtrack
                    board[row][col] = '.';
                }
            }
        }

        // If no valid digit can be placed, return false
        return false;
    }

    // Public method to start solving Sudoku
    public void solveSudoku(char[][] board){
        // Start solving from top-left corner (0,0)
        helper(board, 0, 0);
    }

    // Main function to test the Sudoku solver
    public static void main(String[] args) {
        // Define a sample Sudoku puzzle ('.' means empty cell)
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

        // Create an instance of the solver
        Solution solver = new Solution();

        // Call the solver method to solve the puzzle
        solver.solveSudoku(board);

        // Print the solved Sudoku board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " "); // print each cell
            }
            System.out.println(); // print new line after each row
        }
    }
}
