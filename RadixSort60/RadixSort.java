package RadixSort60;

import java.util.Arrays;

public class RadixSort {
    public static void countSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];
        
        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        } 

        for (int i = 1; i <= 9; i++) {
            count[i] += count[i - 1]; 
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        for (int i = 0; i < output.length; i++) {
            arr[i] = output[i];
        }
    }

    public static void radixSort(int[] arr) {
        int len = arr.length;

        if (len < 2) {
            return;
        }

        int max = Arrays.stream(arr).max().getAsInt();

        for (int exp = 1; (max/exp) > 0; exp *= 10) {
            countSort(arr, exp);
        }
    }

    public static void main(String[] args) {
        int[] arr = {29, 83, 471, 36, 91, 8};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
