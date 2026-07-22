package Recursion35;

import java.util.*;

public class CountingMazePaths {
    static int countPaths(int rows, int cols, int row, int col) {
        if (row == rows && col == cols) {
            return 1;
        }

        if (row == rows) {
            return countPaths(rows, cols, row, col + 1);
        }

        if (col == cols) {
            return countPaths(rows, cols, row + 1, col);           
        }

        return (countPaths(rows, cols, row + 1, col) + countPaths(rows, cols, row, col + 1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Dimensions of maze");
        int count = countPaths(sc.nextInt(), sc.nextInt(), 1, 1);

        System.out.println("The number of paths is " + count);

        sc.close();
    }
}
