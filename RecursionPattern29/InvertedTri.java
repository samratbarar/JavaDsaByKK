package RecursionPattern29;

import java.util.*;

public class InvertedTri {
    static void printInvertedTri(int row, int cols) {
        if (row == 0) {
            return;
        }

        if (cols < row) {
            System.out.print("*");
            printInvertedTri(row, cols + 1);
        } else {
            System.out.println();
            printInvertedTri(row - 1, 0);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        printInvertedTri(sc.nextInt(), 0);

        sc.close();
    }
}
