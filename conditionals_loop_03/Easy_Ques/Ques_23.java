package conditionals_loop_03.Easy_Ques;

import java.util.*;

// Input a number and print all the factors of that number (use loops).

public class Ques_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");
        int num = sc.nextInt();

        for (int i = 1; i*i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");

                if (i != num/i) {
                    System.out.print(num/i + " ");
                }
            }
        }

        // for (int i = 1; i <= num/2; i++) {
        //     if (num % i == 0) {
        //         System.out.print(i +  " ");
        //     }
        // }

       // System.out.print(num);
        sc.close();
    }
}
