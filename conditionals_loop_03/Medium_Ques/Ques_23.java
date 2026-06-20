package conditionals_loop_03.Medium_Ques;

import java.util.*;

// Check Leap Year Or Not

public class Ques_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year");
        short year = sc.nextShort();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Given year is leap year");
        } else {
            System.out.println("Given year is not leap year");
        }
    }
}
