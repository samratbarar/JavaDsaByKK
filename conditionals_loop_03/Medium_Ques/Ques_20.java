package conditionals_loop_03.Medium_Ques;

import java.util.*;

// LCM Of Two Numbers

public class Ques_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the two numbers");
        long num1 = sc.nextLong(), num2 = sc.nextLong(), n1 = num1, n2 = num2;

        while (n2 != 0) {
            long temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }

        long gcd = n1;
        System.out.println("The LCM is " + (num1/gcd)*num2);

        sc.close();
    }
}
