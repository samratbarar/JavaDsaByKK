package conditionals_loop_03.Easy_Ques;

import java.util.*;

// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

public class Ques_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0, sum = 0;
        do {
            num = sc.nextInt();
            if (num != 0) {
                sum += num; 
            }
        } while(num != 0);

        System.out.println("The sum is " + sum);

        sc.close();
    }
}
