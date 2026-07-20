package Recursion32;

import java.util.*;

public class SubsetsByLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of array");
        int[] arr = new int[sc.nextInt()];

        System.out.println("Enter the elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());

        for (int num : arr) {     
            int length = subsets.size();
            for (int j = 0; j < length; j++) {
                ArrayList<Integer> subset = new ArrayList<>(subsets.get(j));
                subset.add(num);
                subsets.add(subset);
            }
        }

        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }

        sc.close();
    }
}
