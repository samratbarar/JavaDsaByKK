package Recursion35;

import java.util.Arrays;
import java.util.Scanner;

public class PrintMatrixAndPath {
    static void printPaths(int[][] maze, int row, int col, String path, int count) {
        if (row  == maze.length - 1 && col == maze[0].length - 1) {
            maze[row][col] = count;

            for (int[] arr : maze) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
            System.out.println(path);
            System.out.println();

            maze[row][col] = 0;
            return;
        }

        if (maze[row][col] != 0) {
            return;
        }
        
        // Mark current cell as visited
        maze[row][col] = count;

        // Explore all possible directions

        if (row < maze.length - 1) {
            printPaths(maze, row + 1, col, path + "D", count + 1);
        }

        if (col < maze[0].length - 1) {
            printPaths(maze, row, col + 1, path + "R", count + 1);         
        }

        if (row > 0) {
            printPaths(maze, row - 1, col, path + "U", count + 1);         
        }

        if (col > 0) {
            printPaths(maze, row, col - 1, path + "L", count + 1);        
        }

        // Backtrack
        maze[row][col] = 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Dimensions of maze");
        int rows = sc.nextInt(), cols = sc.nextInt();

        int[][] maze = new int[rows][cols];

        printPaths(maze, 0, 0, "", 1);
 
        sc.close();
    }
}
