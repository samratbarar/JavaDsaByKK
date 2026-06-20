package conditionals_loop_03.Medium_Ques;

import java.util.*;

// Future Investment Value

public class Ques_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principal amount, interest rate(in decimal form), number of times amount compounded and time (in years) ");
        double prin = sc.nextDouble(), rate = sc.nextDouble(), n = sc.nextDouble(), time = sc.nextDouble();

        System.out.println("The Future investment value is " + (prin*Math.pow((1+(rate/n)), n*time)));

        sc.close();
    }
}
