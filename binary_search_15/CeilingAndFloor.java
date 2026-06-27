package binary_search_15;

import java.util.*;

// Ceiling of number is the smallest element in array which is greater or equal to the number
// Floor of number is the greatest element in array which is smaller or equal to the number

public class CeilingAndFloor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of sorted array");
        int[] arr = new int[sc.nextInt()];

        System.out.println("Enter the elements of the sorted array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target number");
        int target = sc.nextInt();

        int start = 0, end = arr.length - 1;
        boolean isAscen = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                System.out.println("The Ceiling and floor of number is " + arr[mid]);
                sc.close();
                return;
            }

            if (isAscen) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        if (isAscen) {
            if (start < arr.length && end >= 0) {
                System.out.println("The Ceiling and floor of number are " + arr[start] + " and " + arr[end]);
            } else if (start < arr.length) {
                System.out.println("The Ceiling of number is " + arr[start]);
            } else {
                System.out.println("The Floor of number is " + arr[end]);
            }
        } else {
            if (end < arr.length && start >= 0) {
                System.out.println("The Ceiling and floor of number are " + arr[end] + " and " + arr[start]);
            } else if (end < arr.length) {
                System.out.println("The Ceiling of number is " + arr[end]);
            } else {
                System.out.println("The Floor of number is " + arr[start]);
            }
        }

        sc.close();
    }
}