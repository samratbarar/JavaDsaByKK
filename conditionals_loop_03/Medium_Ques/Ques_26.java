package conditionals_loop_03.Medium_Ques;

import java.util.*;

// Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

public class Ques_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumN = 0, sumEP = 0, sumOP = 0;

        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            if (num < 0) {
                sumN += num;
            } else {
                if (num % 2 == 0) {
                    sumEP += num;
                } else {
                    sumOP += num;
                }              
            }
        }

        System.out.println("The sum of negative, postive eevn and odd numbers are " + sumN + ", " + sumEP + " and " + sumOP);

        sc.close();
    }
}
