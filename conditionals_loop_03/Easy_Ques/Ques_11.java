package conditionals_loop_03.Easy_Ques;

import java.util.*;

// Perimeter Of Rectangle

public class Ques_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length and width of rectangle ");
        double len = sc.nextDouble(), wid = sc.nextDouble();

        System.out.println("Perimeter of rectangle is " + (2*(len+wid)));

        sc.close();
    }
}
