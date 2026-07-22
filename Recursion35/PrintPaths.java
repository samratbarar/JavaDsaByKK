package Recursion35;

import java.util.Scanner;

public class PrintPaths {
    static void printPaths(int rows, int cols, String path) {
        if (rows == 1 && cols == 1) {
            System.out.println(path);
            return;
        }

        if (rows == 1) {
            printPaths(rows, cols - 1, path + "R");
            return;
        }

        if (cols == 1) {
            printPaths(rows - 1, cols, path + "D");    
            return;       
        }

        printPaths(rows - 1, cols, path + "D");
        printPaths(rows, cols - 1, path + "R");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Dimensions of maze");
        printPaths(sc.nextInt(), sc.nextInt(), "");
 
        sc.close();
    }
}
