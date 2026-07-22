package Recursion35;

import java.util.*;

public class CountingMazePaths {
    static int countPaths(int rows, int cols) {
        if (rows == 1 && cols == 1) {
            return 1;
        }

        if (rows == 1) {
            return countPaths(rows, cols - 1);
        }

        if (cols == 1) {
            return countPaths(rows - 1, cols);           
        }

        return (countPaths(rows - 1, cols) + countPaths(rows, cols - 1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Dimensions of maze");
        int count = countPaths(sc.nextInt(), sc.nextInt());

        System.out.println("The number of paths is " + count);

        sc.close();
    }
}