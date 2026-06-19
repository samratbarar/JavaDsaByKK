package conditionals_loop_03.Easy_Ques;

import java.util.*;

// Area Of Equilateral Triangle.

public class Ques_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side of equilateral triangle ");
        double side = sc.nextDouble();

        System.out.println("Area of equilateral triangle is " + ((Math.sqrt(3)*side*side)/4));

        sc.close();
    }
}