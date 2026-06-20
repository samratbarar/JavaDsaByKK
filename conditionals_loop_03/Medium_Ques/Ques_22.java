package conditionals_loop_03.Medium_Ques;

import java.util.*;

// Perfect Number In Java

public class Ques_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ");

        int num = sc.nextInt(), sum = 0;

        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        if (num > 0 && num == sum) {
            System.out.println("Given number is perfect number ");
        } else {
            System.out.println("Given number is not perfect number ");
        }

        sc.close();
    }
}
