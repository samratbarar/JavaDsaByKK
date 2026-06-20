package conditionals_loop_03.Medium_Ques;

import java.util.*;

// Calculate Distance Between Two Points

public class Ques_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the x and y coordinates of both points (pair (x,y) of each point)");
        double x1 = sc.nextDouble(), y1 = sc.nextDouble(), x2 = sc.nextDouble(), y2 = sc.nextDouble();

        System.out.println("The distance between two points is " + ((Math.sqrt(Math.pow((y2-y1), 2) + Math.pow((x2-x1), 2)))));

        sc.close();
    }
}
