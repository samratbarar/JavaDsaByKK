package conditionals_loop_03.Easy_Ques;

import java.util.*;

// Volume Of Prism

public class Ques_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base area and height of prism ");
        double baseArea = sc.nextDouble(), height = sc.nextDouble();

        System.out.println("Volume of prism is " + (baseArea*height));

        sc.close();
    }
}
