package conditionals_loop_03.Medium_Ques;

import java.util.*;

// Calculate Commission Percentage

public class Ques_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total amount and commission amount");
        int amt = sc.nextInt(), commAmt = sc.nextInt();

        System.out.println("The commission percentage is " + (((double)commAmt/amt)*100) + "%");

        sc.close();
    }
}
