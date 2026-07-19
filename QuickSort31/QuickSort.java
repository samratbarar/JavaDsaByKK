package QuickSort31;

import java.util.*;

public class QuickSort {
    static void sort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int start = low, end = high, mid = start + (end - start) / 2;
        int pivot = arr[mid];

        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }

            while (arr[end] > pivot) {
                end--;                
            }

            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }

        sort(arr, low, end);
        sort(arr, start, high);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of array");
        int[] arr = new int[sc.nextInt()];

        System.out.println("Enter the elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}
