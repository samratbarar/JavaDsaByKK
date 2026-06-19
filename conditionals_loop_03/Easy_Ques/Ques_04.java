package conditionals_loop_03.Easy_Ques;

import java.util.*;

// Area Of Isosceles Triangle

public class Ques_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base and height of isosceles triangle ");
        double base = sc.nextDouble(), height = sc.nextDouble();

        System.out.println("Area of isosceles triangle is " + ((base*height)/2));

        sc.close();
    }
}