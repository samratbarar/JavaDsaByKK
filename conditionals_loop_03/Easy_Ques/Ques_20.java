package conditionals_loop_03.Easy_Ques;

import java.util.*;

// Total Surface Area Of Cube

public class Ques_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side of cube ");
        double side = sc.nextDouble();
        
        System.out.println("Total surface area is " + (6*side*side));

        sc.close();
    }
}
