package bitwise_oper_25;

import java.util.*;

// An Array contains every element twice and only one single element. You have to find single one

public class SingleEleInArr {
    public static void inputArray(int[] arr, Scanner sc) {
        System.out.println("Enter the elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of array");
        int[] arr = new int[sc.nextInt()];

        inputArray(arr, sc);

        int singleEle = arr[0];

        for (int i = 1; i < arr.length; i++) {
            singleEle ^= arr[i];
        }

        System.out.println("Single element is " + singleEle);

        sc.close();
    }
}