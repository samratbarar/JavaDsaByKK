package conditionals_loop_03.Medium_Ques;

import java.util.*;

// Sum Of N Numbers

public class Ques_13 {
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

        System.out.println("The sum of given numbers is " + sum);

        sc.close();
    }
}
