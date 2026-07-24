package Recursion36;

import java.util.*;

public class SudokuSolver {
    static boolean solver(int[][] board, int row, int col) {
        if (row == board.length) {
            for (int[] boardRow : board) {
                System.out.println(Arrays.toString(boardRow));
            }
            System.out.println();
            return true;
        }
        
        if (col == board.length) {
            return solver(board, row + 1, 0);
        }

        if (board[row][col] == 0) {
            for (int k = 1; k <= 9; k++) {
                if (isSafe(board, k, row, col)) {
                    board[row][col] = k;

                    if (solver(board, row, col + 1)) {
                        return true;
                    }
                    
                    board[row][col] = 0;
                }
            }
        } else {
            return solver(board, row, col + 1);
        }

        return false;
    }

    private static boolean isSafe(int[][] board, int value, int row, int col) {
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == value) {
                return false;
            }
        }

        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == value) {
                return false;
            }
        }

        int gridRowStart = row - (row % 3), gridColStart = col - (col % 3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[gridRowStart + i][gridColStart + j] == value) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the board");
        int[][] board = new int[9][9];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        solver(board, 0, 0);

        sc.close();
    }
}
