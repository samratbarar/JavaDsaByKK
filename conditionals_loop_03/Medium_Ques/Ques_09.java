package conditionals_loop_03.Medium_Ques;

import java.util.*;

// Calculate Batting Average

public class Ques_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total runs and dismissals of the player");
        int runs = sc.nextInt(), dismissals = sc.nextInt();

        if (dismissals == 0) {
            System.out.println("Cannot find batting average at 0 dismissals");
            sc.close();
            return;
        }

        System.out.println("The batting average is " + ((double)runs/dismissals));

        sc.close();
    }
}