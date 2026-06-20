package conditionals_loop_03.Medium_Ques;

import java.util.*;

// Sum Of A Digits Of Number

public class Ques_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");
        int num = sc.nextInt();
        num = Math.abs(num);

        int sum = 0;
        while (num > 0) {
            sum += num%10;
            num /= 10;
        } 

        System.out.println("The sum of digits of given number is " + sum);

        sc.close();
    }
}
