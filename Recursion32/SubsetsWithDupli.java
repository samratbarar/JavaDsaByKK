package Recursion32;

import java.util.*;

public class SubsetsWithDupli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of array");
        int[] arr = new int[sc.nextInt()];

        System.out.println("Enter the elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());
        int start = 0, end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = 0;

            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end;
            }

            end = subsets.size();
            for (int j = start; j < end; j++) {
                ArrayList<Integer> subset = new ArrayList<>(subsets.get(j));
                subset.add(arr[i]);
                subsets.add(subset);
            }
        }

        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }

        sc.close();
    }
}
