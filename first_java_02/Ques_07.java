package first_java_02;

import java.util.*;

// To calculate Fibonacci Series up to n numbers.

public class Ques_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the limit value i.e. value of n and first, second terms");
        int n = sc.nextInt(), t1 = sc.nextInt(), t2 = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(t1 + " ");
            int next = t1 + t2;
            t1 = t2;
            t2 = next;
        }

        sc.close();
    }
}