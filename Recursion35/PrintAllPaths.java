package Recursion35;

import java.util.Scanner;

public class PrintAllPaths {
    static void printPaths(boolean[][] maze, int row, int col, String path) {
        if (row  == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(path);
            return;
        }

        if (maze[row][col]) {
            return;
        }
        
        // Mark current cell as visited
        maze[row][col] = true;

        // Explore all possible directions

        if (row < maze.length - 1) {
            printPaths(maze, row + 1, col, path + "D");
        }

        if (col < maze[0].length - 1) {
            printPaths(maze, row, col + 1, path + "R");         
        }

        if (row > 0) {
            printPaths(maze, row - 1, col, path + "U");         
        }

        if (col > 0) {
            printPaths(maze, row, col - 1, path + "L");        
        }

        // Backtrack
        maze[row][col] = false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Dimensions of maze");
        int rows = sc.nextInt(), cols = sc.nextInt();

        boolean[][] maze = new boolean[rows][cols];

        printPaths(maze, 0, 0, "");
 
        sc.close();
    }
}
