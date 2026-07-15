package maths_26;

import java.util.*;

public class SquareRoot {
    public static int binarySearch(int num) {
        if (num < 0) {
            return -1;
        }

        int start = 0, end = num;
        int mid = start + (end - start) / 2;

        while (start <= end) {
            long square = (long)mid * mid;

            if (square == num) {
                return mid;
            }

            if (square < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

            mid = start + (end - start) / 2;
        }

        return end;
    }

    public static double squareRoot(int num) {
        if (num < 0) {
            return -1;
        }

        double sqrt = binarySearch(num);

        if (sqrt == -1) {
            return -1;
        }

        double inc = 0.1;
        for (int i = 0; i < 3; i++) {
            while (sqrt * sqrt <= num) {
                sqrt += inc;
            }

            sqrt -= inc;
            inc /= 10;
        }

        return sqrt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        double sqrt = squareRoot(sc.nextInt());

        if (sqrt != -1) {
            System.out.printf("The square root is %.3f%n", sqrt);
        } else {
            System.out.println("Negative numbers are not allowed");
        }

        sc.close();
    }
}
