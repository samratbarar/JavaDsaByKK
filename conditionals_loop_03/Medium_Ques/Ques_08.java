package conditionals_loop_03.Medium_Ques;

import java.util.*;

// Calculate Depreciation of Value

public class Ques_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the original value, Depreciation Rate(in %) and time(in years) ");
        double ogValue = sc.nextDouble(), depRate = sc.nextDouble(), time = sc.nextDouble();

        System.out.println("The Depreciation Amount is " + (ogValue*depRate*time)/100);

        sc.close();
    }
}