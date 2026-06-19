package conditionals_loop_03.Easy_Ques;

import java.util.*;

// Subtract the Product and Sum of Digits of an Integer

public class Ques_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");
        int num = sc.nextInt(), product = 1, sum = 0;

        if (num < 0) {
            num *= -1;
        }

        if (num == 0) {
            System.out.println("The required result is 0");
            sc.close();
            return;
        }

        while (num > 0) {
            product *= num%10;
            sum += num%10;
            num /= 10;
        }

        System.out.println("The required result is " + (product - sum));

        sc.close();
    }
}
