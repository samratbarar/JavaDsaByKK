package conditionals_loop_03.Easy_Ques;

import java.util.*;

// Perimeter Of Equilateral Triangle

public class Ques_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side of equilateral triangle ");
        double side = sc.nextDouble();

        System.out.println("Perimeter of equilateral triangle is " + (3*side));

        sc.close();
    }
}
