package conditionals_loop_03.Easy_Ques;

import java.util.*;

// Take integer inputs till the user enters 0 and print the largest number from all.

public class Ques_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0, max = Integer.MIN_VALUE;
        do {
            num = sc.nextInt();
            if (num != 0 && num > max) {
                max = num; 
            }
        } while(num != 0);

        System.out.println("The largest number is " + max);

        sc.close();
    }
}
