package maths_26;

import java.util.*;

public class SqRootByNewton {
    public static double squareRoot(int num) {
        if (num < 0) {
            return -1;
        }

        if (num == 0) {
            return 0;
        }

        double x = num;
        double root = (x + (num / x)) / 2.0;
        double error = Math.abs(root - x);;
 
        while (error > 1e-6) {
            x = root;
            root = (x + (num / x)) / 2;
            error = Math.abs(root - x);
        }

        return root;
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
