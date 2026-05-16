public class sudokusolver {

    // Size of the grid
    private static final int GRID_SIZE = 9;

    public static void main(String[] args) {
        // 0 represents an empty cell
        int[][] board = {
            {7, 0, 2, 0, 5, 0, 6, 0, 0},
            {0, 0, 0, 0, 0, 3, 0, 0, 0},
            {1, 0, 0, 0, 0, 9, 5, 0, 0},
            {8, 0, 0, 0, 0, 0, 0, 9, 0},
            {0, 4, 3, 0, 0, 0, 7, 5, 0},
            {0, 9, 0, 0, 0, 0, 0, 0, 8},
            {0, 0, 9, 7, 0, 0, 0, 0, 5},
            {0, 0, 0, 2, 0, 0, 0, 0, 0},
            {0, 0, 7, 0, 4, 0, 2, 0, 3}
        };

        System.out.println("Original Board:");
        printBoard(board);

        if (solveBoard(board)) {
            System.out.println("\nSolved Board:");
            printBoard(board);
        } else {
            System.out.println("\nUnsolvable board!");
        }
    }

    /**
     * The main logic of the backtracking algorithm.
     */
    private static boolean solveBoard(int[][] board) {
        
        // Loop through every cell to find an empty one
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {
                
                // We found an empty cell
                if (board[row][col] == 0) {
                    
                    // Try numbers 1 through 9
                    for (int numberToTry = 1; numberToTry <= GRID_SIZE; numberToTry++) {
                        
                        if (isValidPlacement(board, numberToTry, row, col)) {
                            // Place the number
                            board[row][col] = numberToTry;
                            
                            // Recursively call solveBoard to fill the rest
                            if (solveBoard(board)) {
                                return true;
                            }
                            
                            // If we return false, it means this number didn't lead to a solution.
                            // Reset (Backtrack) and try the next number.
                            board[row][col] = 0;
                        }
                    }
                    // If we try 1-9 and nothing works, this branch is dead. Return false.
                    return false;
                }
            }
        }
        // If we exit the loops without returning false, the board is full and valid.
        return true;
    }

    /**
     * Checks if a number can be placed at board[row][col].
     */
    private static boolean isValidPlacement(int[][] board, int number, int row, int col) {
        return !isNumberInRow(board, number, row) &&
               !isNumberInColumn(board, number, col) &&
               !isNumberInBox(board, number, row, col);
    }

    private static boolean isNumberInRow(int[][] board, int number, int row) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[row][i] == number) {
                return true;
            }
        }
        return false;
    }

    private static boolean isNumberInColumn(int[][] board, int number, int col) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[i][col] == number) {
                return true;
            }
        }
        return false;
    }

    private static boolean isNumberInBox(int[][] board, int number, int row, int col) {
        // Calculate the top-left corner of the 3x3 subgrid
        int localBoxRow = row - row % 3;
        int localBoxCol = col - col % 3;

        for (int i = localBoxRow; i < localBoxRow + 3; i++) {
            for (int j = localBoxCol; j < localBoxCol + 3; j++) {
                if (board[i][j] == number) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void printBoard(int[][] board) {
        for (int row = 0; row < GRID_SIZE; row++) {
            if (row % 3 == 0 && row != 0) {
                System.out.println("-----------");
            }
            for (int col = 0; col < GRID_SIZE; col++) {
                if (col % 3 == 0 && col != 0) {
                    System.out.print("|");
                }
                System.out.print(board[row][col]);
            }
            System.out.println();
        }
    }
}