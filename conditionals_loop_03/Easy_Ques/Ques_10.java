package conditionals_loop_03.Easy_Ques;

import java.util.*;

// Perimeter Of Parallelogram

public class Ques_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the parallel and non parallel side of parallelogram ");
        double parSide = sc.nextDouble(), nonParSide = sc.nextDouble();

        System.out.println("Perimeter of parallelogram is " + (2*(parSide+nonParSide)));

        sc.close();
    }
}
