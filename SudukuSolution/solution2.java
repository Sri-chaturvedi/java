package SudukuSolution;

public class solution2 {

public boolean isSafe(char[][] board, int row, int col, int number){
    for(int i =0; i< board.length; i++){ // Loop from 0 to last of the board
        if (board[i][col] == (char)(number + '0') || board[row][i] == (char)(number + '0')) { // Ckeck if there is any number on any column or on any row
            return false;  //if there is a number return false
        }
    }

    //new row for staring row and starting colmun
    int  sr = (row/3)*3;
    int  sc = (col/3)*3;

    //ron loop for 3*3 grid to check there is any number on grid or not 
    for(int i= sr; i< sr +3; i++){
        for(int j = sc; j< sc +3; j++){
            if (board[i][j] == (char)(number + '0')) {
                return false; // if there is a number return false
            }
        }
    }
    return true; // if all number place on right place return true
}

    // Recursive function to solve Sudoku using backtracking
    public boolean helper(char[][] board, int row, int col) {
        // If we have reached beyond the last row, Sudoku is solved
        if (row == board.length) {
            return true; //Reached end of board
        }
        int nrow = 0; //Next row
        int ncol = 0; //Next column

        //Move to the next cell in the row
        if (col != board.length - 1) {
            nrow = row;     // Stay on the same row
            col = col + 1;  //Move to next column
        }else{
            //Move to the first column of next row
            nrow = row + 1;
            col = 0;
        }

        //If the current cell is already filled, skip to the next cell
        if (board[row][col] != '.') {
           return helper(board, nrow, ncol);  //Already filled, skip
        }else{
            //Try placing digit 1 to 9
            for(int i = 1; i<=9; i++){                  // numbers from 1 to 9
                if (isSafe(board, row, col, i)) {       // check if it's safe to place i here
                    board[row][col] = (char) (i+ '0');  // place i in character form{place the digit (convert to char) on board}
                    if (helper(board, nrow, ncol)) {    // Recurse to solve rest of the board
                        return true;                    // if successful, return true
                    }
                    board[row][col] = '.';              // backtrack: reset if it doesn't lead to solution
                }
            }
        }
        return false; // If no valid digit can be placed, return false

    }

    // Entry point to solve suduko
    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }

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

        for(int i = 0; i< 9 ; i++){
            for(int j=0; j<9; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
