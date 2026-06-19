package conditionals_loop_03.Easy_Ques;

import java.util.*;

// Area Of Rectangle program

public class Ques_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length and width of rectangle ");
        double len = sc.nextDouble(), wid = sc.nextDouble();

        System.out.println("Area of rectangle is " + (len*wid));

        sc.close();
    }
}