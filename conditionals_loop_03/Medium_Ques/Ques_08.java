package conditionals_loop_03.Medium_Ques;

import java.util.*;

// Calculate Depreciation of Value

public class Ques_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the original value, Depreciation Rate(in %) and time(in years) ");
        double ogValue = sc.nextInt(), depRate = sc.nextInt(), time = sc.nextInt();

        System.out.println("The Depreciation Amount is " + (ogValue*depRate*time)/100);

        sc.close();
    }
}