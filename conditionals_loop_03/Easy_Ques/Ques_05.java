package conditionals_loop_03.Easy_Ques;

import java.util.*;

// Area Of Parallelogram

public class Ques_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base and height of parallelogram ");
        double base = sc.nextDouble(), height = sc.nextDouble();

        System.out.println("Area of parallelogram is " + (base * height));

        sc.close();
    }
}