package binary_search_15;

import java.util.Arrays;
import java.util.Scanner;

public class BSInSorted2DArr {
    public static void inputArray(int[][] arr, Scanner sc) {
        System.out.println("Enter the elements of the array");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the " + (i + 1) + " row of array");

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static int[] BSRowWise(int[][] arr, int target, int row, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[row][mid] == target) {
                return new int[] {row, mid};
            }

            if (arr[row][mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return new int[] {-1, -1};
    }

    public static int[] BSColumnWise(int[][] arr, int target, int col, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid][col] == target) {
                return new int[] {mid, col};
            }

            if (arr[mid][col] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return new int[] {-1, -1};
    }

    public static int[] search(int[][] arr, int target) {
        if (arr.length == 0) {
            System.out.println("Empty array");
            return new int[] { -1, -1 };
        }

        if (arr.length == 1) {
            return BSRowWise(arr, target, 0, 0, arr[0].length - 1);
        }

        if (arr[0].length == 1) {
            return BSColumnWise(arr, target, 0, 0, arr.length - 1);
        }

        if (arr[0].length == 2) {
            int[] idx = BSColumnWise(arr, target, 0, 0, arr.length - 1);

            if (idx[0] == -1 && idx[1] == -1) {
                idx = BSColumnWise(arr, target, 1, 0, arr.length - 1);
            }

            return idx;
        }

        int rowStart = 0, rowEnd = arr.length - 1;
        int column = (arr[0].length) / 2;

        while (rowEnd > rowStart && (rowEnd - rowStart) != 1) {
            int rowMid = rowStart + (rowEnd - rowStart) / 2;

            if (arr[rowMid][column] == target) {
                return new int[] { rowMid, column };
            }

            if (arr[rowMid][column] < target) {
                rowStart = rowMid;
            } else {
                rowEnd = rowMid;
            }
        }

        if (arr[rowStart][column] == target) {
            return new int[] { rowStart, column };
        }

        if (arr[rowEnd][column] == target) {
            return new int[] { rowEnd, column };
        }

        if (target <= arr[rowStart][column - 1]) {
            return BSRowWise(arr, target, rowStart, 0, column - 1);
        } else if (target <= arr[rowStart][arr[0].length - 1]) {
            return BSRowWise(arr, target, rowStart, column + 1, arr[0].length - 1);
        } else if (target <= arr[rowEnd][column - 1]) {
            return BSRowWise(arr, target, rowEnd, 0, column - 1);
        } else {
            return BSRowWise(arr, target, rowEnd, column + 1, arr[0].length - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of array");
        int[][] arr = new int[sc.nextInt()][sc.nextInt()];

        inputArray(arr, sc);

        System.out.println("Enter the key to be search");
        int[] idx = search(arr, sc.nextInt());

        if (idx[0] != -1 && idx[1] != -1) {
            System.out.println("The index of key is " + Arrays.toString(idx));
        } else {
            System.out.println("Key is not found");
        }

        sc.close();
    }
}
