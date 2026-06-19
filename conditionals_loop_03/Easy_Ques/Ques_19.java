package conditionals_loop_03.Easy_Ques;

import java.util.*;

// Curved Surface Area Of Cylinder

public class Ques_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius and height of cylinder ");
        double rad = sc.nextDouble(), height = sc.nextDouble();

        System.out.println("Curved surface area is " + (2*Math.PI*rad*height));

        sc.close();
    }
}
