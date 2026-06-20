package conditionals_loop_03.Medium_Ques;

import java.util.*;

// Compound Interest Java Program

public class Ques_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principal amount, interest rate(in decimal form), number of times amount compounded and time (in years) ");
        double prin = sc.nextDouble(), rate = sc.nextDouble(), n = sc.nextDouble(), time = sc.nextDouble();

        System.out.println("The compound interest is " + (prin*Math.pow((1+(rate/n)), n*time)-prin));

        sc.close();
    }
}
