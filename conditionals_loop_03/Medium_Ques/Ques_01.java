package conditionals_loop_03.Medium_Ques;

import java.util.*;

// Factorial Program In Java

public class Ques_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("The factorial is not defined for negative numbers ");  
            sc.close();
            return;          
        }

        int fact = 1;

        for (int i = 2; i <= num; i++) {
            fact *= i;
        }

        System.out.println("The factorial of given number is " + fact);

        sc.close();
    }
}