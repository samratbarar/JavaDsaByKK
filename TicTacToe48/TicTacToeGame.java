package TicTacToe48;

import java.util.*;

public class TicTacToeGame {
    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " | ");
            }

            System.out.println();
        }
    }

    public static boolean haveWon(char[][] board, char player) {
        // check rows
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }

        // check columns
        for (int i = 0; i < board.length; i++) {
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }

        // check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }

        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] board = new char[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }

        char player = 'X';
        boolean gameOver = false;
        int moves = 0;

        while (!gameOver) {
            printBoard(board);

            System.out.println("Player : " + player + " Enter the row and column");
            int row = sc.nextInt();
            int col = sc.nextInt();

            if (row < 0 || row >= 3 || col < 0 || col >= 3) {
                System.out.println("Invalid position, try again");
                continue;
            }

            if (board[row][col] == ' ') {
                board[row][col] = player;
                moves++;
                gameOver = haveWon(board, player);

                if (gameOver) {
                    System.out.println("Player : " + player + " has won");
                } else if (moves == 9) {
                    System.out.println("Match draw");
                    gameOver = true;
                } else {
                    player = (player == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Invalid input, try again");
            }
        }

        printBoard(board);

        sc.close();
    }
}
