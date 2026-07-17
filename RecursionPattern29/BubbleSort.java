package RecursionPattern29;

import java.util.*;

public class BubbleSort {
    static void sort(int[] arr, int i, int j, boolean isSorted) {
        if (i == 0) {
            return;
        }

        if (j < i) {
            if (arr[j] > arr[j + 1]) {
                isSorted = false;
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
            sort(arr, i, j + 1, isSorted);
        } else if (isSorted) {
            return;
        } else {
            sort(arr, i - 1, 0, true);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of array");
        int[] arr = new int[sc.nextInt()];

        System.out.println("Enter the elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sort(arr, arr.length - 1, 0, true);

        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}