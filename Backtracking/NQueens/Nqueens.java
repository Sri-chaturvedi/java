// package Backtracking.NQueens;

// public class Nqueens {

//     // Function to print the board configuration
//     public static void printBoard(char[][] board) {
//         for (int i = 0; i < board.length; i++) {
//             for (int j = 0; j < board.length; j++) {
//                 System.out.print(board[i][j] + " ");
//             }
//             System.out.println();
//         }
//         System.out.println("------------------");
//     }

//     // Function to check if it's safe to place a queen at board[row][col]
//     public static boolean isSafe(char[][] board, int row, int col) {
//         int n = board.length;

//         // Check vertically up
//         for (int i = row - 1; i >= 0; i--) {
//             if (board[i][col] == 'Q') return false;
//         }

//         // Check upper left diagonal
//         for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
//             if (board[i][j] == 'Q') return false;
//         }

//         // Check upper right diagonal
//         for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
//             if (board[i][j] == 'Q') return false;
//         }

//         // If all checks pass, it's safe
//         return true;
//     }

//     // Recursive function to solve the N-Queens puzzle
//     public static void solveNQueens(char[][] board, int row) {
//         int n = board.length;

//         // Base case: If all queens are placed
//         if (row == n) {
//             printBoard(board);  // Print one valid board
//             return;
//         }

//         // Try placing a queen in each column of the current row
//         for (int col = 0; col < n; col++) {
//             if (isSafe(board, row, col)) {
//                 board[row][col] = 'Q'; // Place queen
//                 solveNQueens(board, row + 1); // Recurse to next row
//                 board[row][col] = '.'; // Backtrack: Remove queen
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int n = 4; // Change N here (like 4, 5, 8, etc.)
//         char[][] board = new char[n][n];

//         // Initialize the board with dots (.)
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 board[i][j] = '.';
//             }
//         }

//         // Start solving from the 0th row
//         solveNQueens(board, 0);
//     }
// }

//** */==>> in diffrent way

// package Backtracking.NQueens;

// import java.util.ArrayList;
// import java.util.List;

// public class Nqueens {
//     public boolean isSafe(int row, int col, char[][] board){
//         //Horizontail
//         for(int j=0; j<board.length; j++){
//             if (board[row][j] == 'Q') {
//                 return false;
//             }
//         }

//         //vertical
//         for(int i=0; i<board[0].length;i++){
//             if (board[i][col] == 'Q') {
//                 return false;
//             }
//         }

//         //Upper left
//         int r = row;
//         for(int c = col; c>=0 && r>=0; c--, r--){
//             if (board[r][c]=='Q') {
//                 return false;
//             }
//         }

//         //Upper right
//          r = row;
//         for(int c=col; c<board.length && r>= 0; r--, c++){
//             if (board[r][c] == 'Q') {
//                 return false;
//             }
//         }
//         //lower left
//         r = row;
//         for(int c=col; c>=0 && r<board.length; r++, c--){
//             if (board[r][c] == 'Q') {
//                 return false;
//             }
//         }

//         //Lower right
//         for(int c=col; c<board.length && r<board.length; c++, r++){
//             if (board[r][c] == 'Q') {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public void saveBoard(char[][] board,List<List<String>> allBoards){
//         String row = "";
//         List<String> newBoard = new ArrayList<>();

//         for(int i =0; i<board.length;i++){
//             row="";
//             for(int j = 0; j<board[0].length; j++){
//                 if (board[i][j] == 'Q') {
//                     row += 'Q';
//                 }else{
//                     row+=".";
//                 }
//             }
//             newBoard.add(row);
//         }

//         allBoards.add(newBoard);
//     }

//     public void helper(char[][] board,List<List<String>> allBoards, int col){
//         if (col == board.length) {
//             saveBoard(board, allBoards);
//             return;
//         }
//         for(int row = 0; row<board.length; row++){
//             if (isSafe(row,col,board)) {
//                 board[row][col] = 'Q';
//                 helper(board, allBoards, col+1);
//                 board[row][col] ='.';
//             }
//         }
//     }
//     public List<List<String>> solveNQueens(int n){
//         List<List<String>> allBoards = new ArrayList<>();
//         char [][] board = new char[n][n];

//         helper(board, allBoards, 0);
//         return allBoards;
//     }

// }



//** */ ==>> With main function


package Backtracking.NQueens;

import java.util.ArrayList;
import java.util.List;

public class Nqueens {

    // Check if it's safe to place a queen at board[row][col]
    public boolean isSafe(int row, int col, char[][] board){
        // Check horizontal (left to right in current row)
        for(int j = 0; j < board.length; j++){
            if (board[row][j] == 'Q') return false;
        }

        // Check vertical (top to bottom in current column)
        for(int i = 0; i < board[0].length; i++){
            if (board[i][col] == 'Q') return false;
        }

        // Check upper-left diagonal
        int r = row;
        for(int c = col; c >= 0 && r >= 0; c--, r--){
            if (board[r][c] == 'Q') return false;
        }

        // Check upper-right diagonal
        r = row;
        for(int c = col; c < board.length && r >= 0; c++, r--){
            if (board[r][c] == 'Q') return false;
        }

        // Check lower-left diagonal
        r = row;
        for(int c = col; c >= 0 && r < board.length; c--, r++){
            if (board[r][c] == 'Q') return false;
        }

        // Check lower-right diagonal
        r = row;
        for(int c = col; c < board.length && r < board.length; c++, r++){
            if (board[r][c] == 'Q') return false;
        }

        return true; // All checks passed
    }

    // Save the current board configuration into a list of strings
    public void saveBoard(char[][] board, List<List<String>> allBoards){
        List<String> newBoard = new ArrayList<>();

        for(int i = 0; i < board.length; i++){
            StringBuilder row = new StringBuilder();
            for(int j = 0; j < board[0].length; j++){
                row.append(board[i][j] == 'Q' ? 'Q' : '.');
            }
            newBoard.add(row.toString());
        }

        allBoards.add(newBoard);
    }

    // Backtracking helper function
    public void helper(char[][] board, List<List<String>> allBoards, int col){
        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }

        for(int row = 0; row < board.length; row++){
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';            // Place queen
                helper(board, allBoards, col + 1); // Move to next column
                board[row][col] = '.';             // Backtrack
            }
        }
    }

    // Main solve function called from main()
    public List<List<String>> solveNQueens(int n){
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        // Initialize board with '.'
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }

        helper(board, allBoards, 0);
        return allBoards;
    }

    // MAIN FUNCTION to run the code
    public static void main(String[] args) {
        int n = 4; // You can change N here

        Nqueens nq = new Nqueens();
        List<List<String>> solutions = nq.solveNQueens(n);

        // Print all solutions
        int count = 1;
        for (List<String> board : solutions) {
            System.out.println("Solution " + count + ":");
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println("------------------------");
            count++;
        }

        System.out.println("Total Solutions for " + n + "-Queens: " + solutions.size());
    }
}
