package cycle_sort_20;

import java.util.*;

public class CycleSort {
    public static void inputArray(int[] arr, Scanner sc) {
        System.out.println("Enter the elements of the array");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void sort(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correct = arr[i] - 1;
            
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
            
            // my implementation 
            // if (arr[i] == (i + 1)) {
            //     i++;
            // } else {
            //     int idx = arr[i] - 1;
            //     int temp = arr[i];
            //     arr[i] = arr[idx];
            //     arr[idx] = temp;
            // }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of array");
        int[] arr = new int[sc.nextInt()];

        inputArray(arr, sc);

        sort(arr);

        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}