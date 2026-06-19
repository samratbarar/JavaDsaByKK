package conditionals_loop_03.Easy_Ques;

import java.util.*;

// Volume Of Cone Java Program

public class Ques_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius and height of cone ");
        double rad = sc.nextDouble(), height = sc.nextDouble();

        System.out.println("The volume of cone is " + ((Math.PI*rad*rad*height)/3));

        sc.close();
    }
}