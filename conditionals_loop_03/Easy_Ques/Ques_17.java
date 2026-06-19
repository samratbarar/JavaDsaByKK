package conditionals_loop_03.Easy_Ques;

import java.util.*;

// Volume Of Sphere

public class Ques_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of sphere ");
        double rad = sc.nextDouble();

        System.out.println("The volume of sphere is " + (4*Math.PI*rad*rad*rad)/3);

        sc.close();
    }
}
