package conditionals_loop_03.Medium_Ques;

import java.util.*;

// Calculate CGPA Java Program

public class Ques_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total grade points and total number of subjects");
        double gradePts = sc.nextDouble();
        int num = sc.nextInt();

        System.out.println("The CGPA is " + (gradePts/num));

        sc.close();
    }
}
