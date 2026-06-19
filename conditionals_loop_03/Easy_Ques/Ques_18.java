package conditionals_loop_03.Easy_Ques;

import java.util.*;

// Volume Of Pyramid

public class Ques_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base length and width and height of pyramid ");
        double baseLen = sc.nextDouble(), baseWidth = sc.nextDouble(), height = sc.nextDouble();

        System.out.println("The volume of pyramid is " + (baseLen*baseWidth*height)/3);

        sc.close();
    }
}
