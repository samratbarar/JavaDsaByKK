package conditionals_loop_03.Easy_Ques;

import java.util.Scanner;

// Volume Of Cylinder

public class Ques_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius and height of cylinder ");
        double rad = sc.nextDouble(), height = sc.nextDouble();

        System.out.println("The volume of cylinder is " + (Math.PI*rad*rad*height));

        sc.close();
    }
}
