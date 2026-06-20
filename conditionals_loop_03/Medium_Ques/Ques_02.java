package conditionals_loop_03.Medium_Ques;

import java.util.*;

// Calculate Electricity Bill

public class Ques_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your previous and current meter readings : ");
        float prevRead = sc.nextFloat(), currRead = sc.nextFloat();

        System.out.println("Enter fixed charges on electricity of your area : ");
        int fixCharge = sc.nextInt();

        System.out.println("Enter tax(in %) on electricity in your area : ");
        float tax = sc.nextFloat();

        float units = currRead - prevRead;
        if (units < 0) {
            System.out.println("Readings are invalid");
            sc.close();
            return;
        }

        float bill = 0;
        if (units <= 100) {
            bill = units*3;
        } else if (units <= 200) {
            bill = 100*3 + (units-100)*5;
        } else {
            bill = 100*3 + 100*5 + (units-200)*7;
        }

        System.out.println("Your bill is " + (bill + fixCharge + bill*tax/100));

        sc.close();
    }
}
