package conditionals_loop_03.Easy_Ques;

import java.util.*;

// Area Of Triangle

public class Ques_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sides of triangle ");
        double s1 = sc.nextDouble(), s2 = sc.nextDouble(), s3 = sc.nextDouble();

        double semi = (s1+s2+s3)/2;

        System.out.println("Area of triangle is " + (Math.sqrt(semi*(semi-s1)*(semi-s2)*(semi-s3))));

        sc.close();
    }
}