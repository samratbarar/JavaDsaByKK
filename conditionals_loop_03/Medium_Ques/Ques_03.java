package conditionals_loop_03.Medium_Ques;

import java.util.*;

// Calculate Average Of N Numbers

public class Ques_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of N which how many you want to enter");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("Enter valid value of N");
            sc.close();
            return;
        }

        double sum = 0;
        System.out.println("Enter the numbers");
        for (int i = 0; i < N; i++) {
            sum += sc.nextDouble();
        }

        System.out.println("The Average of given numbers is " + (sum/N));

        sc.close();
    }
}