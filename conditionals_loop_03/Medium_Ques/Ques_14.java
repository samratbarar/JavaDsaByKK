package conditionals_loop_03.Medium_Ques;

import java.util.*;

// Armstrong Number In Java

public class Ques_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt(), temp = num, count = 0;

        while(temp > 0) {
            count++;
            temp /= 10;
        }

        temp = num;
        int sum = 0;

        while (temp > 0) {
            sum += Math.pow(temp%10, count);
            temp /= 10;
        }

        if (sum == num) {
            System.out.println("Given number is armstrong number ");
        } else {
            System.out.println("Given number is not armstrong number ");
        }

        sc.close();
    }
}
