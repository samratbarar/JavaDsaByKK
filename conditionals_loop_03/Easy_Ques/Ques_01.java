package conditionals_loop_03.Easy_Ques;

import java.util.*;

// Area Of Circle Java Program

public class Ques_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of circle");
        double rad = sc.nextDouble();

        System.out.println("Area of circle is " + (Math.PI*rad*rad));

        sc.close();
    }
}
