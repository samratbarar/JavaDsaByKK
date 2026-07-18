package MergeSort30;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortUsingTempArr {
    static void merge(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start + 1];
        int idx1 = start, idx2 = mid + 1, mixIdx = 0;

        while (idx1 <= mid && idx2 <= end) {
            if (arr[idx1] < arr[idx2]) {
                mix[mixIdx++] = arr[idx1++];
            } else {
                mix[mixIdx++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            mix[mixIdx++] = arr[idx1++];
        }

        while (idx2 <= end) {
            mix[mixIdx++] = arr[idx2++];
        }

        for (int i = 0, j = start; i < mixIdx; i++, j++) {
            arr[j] = mix[i];
        }
    }
    
    static void sort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;

        sort(arr, start, mid);
        sort(arr, mid + 1, end);

        merge(arr, start, mid, end);
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
