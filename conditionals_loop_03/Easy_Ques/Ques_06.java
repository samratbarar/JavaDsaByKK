package conditionals_loop_03.Easy_Ques;

import java.util.*;

// Area Of Rhombus

public class Ques_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the diagonals of rhombus ");

        System.out.println("Area of rhombus is " + (sc.nextDouble() * sc.nextDouble())/2);

        sc.close();
    }
}