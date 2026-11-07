package CountSort59;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountSort {
    public static void countSort(int[] arr) {
        if (arr.length <= 1) {
            return; 
        }

        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        int[] count = new int[max + 1];

        for (int num : arr) {
            count[num]++;
        }

        int idx = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                arr[idx++] = i;
                count[i]--;
            }
        }
    }

    public static void countSortHash(int[] arr) {
        if (arr.length <= 1) {
            return; 
        }

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int idx = 0;
        for (int i = min; i <= max; i++) {
            int count = countMap.getOrDefault(i, 0);
            for (int j = 0; j < count; j++) {
                arr[idx++] = i;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 2, 4, 6, 7, 8};
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    } 
}
