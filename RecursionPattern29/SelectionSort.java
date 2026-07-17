package RecursionPattern29;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    static void sort(int[] arr, int i, int j, int larEleIdx) {
        if (i == 0) {
            return;
        }

        if (j <= i) {
            if (arr[j] > arr[larEleIdx]) {
                larEleIdx = j;
            }
            sort(arr, i, j + 1, larEleIdx);
        } else {
            int temp = arr[i];
            arr[i] = arr[larEleIdx];
            arr[larEleIdx] = temp;
            sort(arr, i - 1, 1, 0);
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

        sort(arr, arr.length - 1, 1, 0);

        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}
