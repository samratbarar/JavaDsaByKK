package conditionals_loop_03.Easy_Ques;

import java.util.*;

// Perimeter Of Circle

public class Ques_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of circle");
        double rad = sc.nextDouble();

        System.out.println("Perimeter of circle is " + (2*Math.PI*rad));

        sc.close();
    }
}
