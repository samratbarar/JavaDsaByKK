package binary_search_15;

import java.util.*;

public class BSRotatedArrWithDuli {
    public static void inputArray(int[] arr, Scanner sc) {
        System.out.println("Enter the elements of the array");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static int findPivotIdx(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (mid > start && arr[mid] < arr[mid - 1]) {
                return (mid - 1);
            }

            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }

                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }

                start++;
                end--;
            } else if (arr[mid] > arr[start] || (arr[mid] == arr[start] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static int search(int[] nums, int target) {
        if (nums.length == 0) {
            System.out.println("Empty array");
            return -1;
        }

        int pivotIdx = findPivotIdx(nums);

        if (pivotIdx == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        if (nums[pivotIdx] == target) {
            return pivotIdx;
        }

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivotIdx);
        } else {
            return binarySearch(nums, target, pivotIdx + 1, nums.length - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of array");
        int[] arr = new int[sc.nextInt()];

        inputArray(arr, sc);

        System.out.println("Enter the key to be search");
        int idx = search(arr, sc.nextInt());

        if (idx != -1) {
            System.out.println("The index of key is " + idx);
        } else {
            System.out.println("Key is not found");
        }

        sc.close();
    }
}
