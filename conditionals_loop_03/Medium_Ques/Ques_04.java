package conditionals_loop_03.Medium_Ques;

import java.util.*;

// Calculate Discount Of Product

public class Ques_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the retail price and off percentage of product ");
        double price = sc.nextDouble(), off = sc.nextDouble();

        System.out.println("The discount on product is " + (price*off)/100);

        sc.close();
    }
}