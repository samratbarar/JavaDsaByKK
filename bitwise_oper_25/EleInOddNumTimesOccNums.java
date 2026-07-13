package bitwise_oper_25;

import java.util.Scanner;

// Find the single element in array in which every number is occuring thrice 

public class EleInOddNumTimesOccNums {
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
        int[] bitsSum = new int[32];

        for (int i = 0; i < 32; i++) {
            int bit = 0;
            for (int j = 0; j < arr.length; j++) {
                bit += (arr[j] >> i) & 1;
            }

            bitsSum[i] = bit % 3;
        }

        int ans = 0;
        for (int i = 0; i < bitsSum.length; i++) {
            if (bitsSum[i] == 1) {
                ans |= (1 << i);
            }
        }

        System.out.println("Single element is " + (ans));

        sc.close();
    }
}
