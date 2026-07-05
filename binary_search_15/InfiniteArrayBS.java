package binary_search_15;

import java.util.*;

// Find the postion of an element of infinite length sorted array

public class InfiniteArrayBS {
    public static void inputArray(int[] arr, Scanner sc) {
        System.out.println("Enter the elements of sorted array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static int binarySearch(int[] arr, int key) {
        if (arr.length == 0) {
            return -1;
        }

        int start = 0, end = Math.min(1, arr.length - 1);
        while (end < arr.length && arr[end] < key) {
            int newStart = end + 1;
            end = Math.min(end + (end - start + 1) * 2, arr.length - 1);
            start = newStart;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of sorted array");
        int[] arr = new int[sc.nextInt()];

        inputArray(arr, sc);

        System.out.println("Enter the key to be search");
        int idx = binarySearch(arr, sc.nextInt());

        if (idx != -1) {
            System.out.println("Enter index of key is " + idx);
        } else {
            System.out.println("Key is not found");
        }

        sc.close();
    }
}
