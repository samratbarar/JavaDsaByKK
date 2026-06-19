package first_java_02;

import java.util.*;

// To find Armstrong Number between two given number.

public class Ques_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the lower number and higher one");
        int lower = sc.nextInt(), higher = sc.nextInt();

        if (lower < 0 || higher < 0 || lower > higher) {
            System.out.println("Enter valid range");
            sc.close();
            return;
        } 

        for (int i = lower; i <= higher; i++) {
            int checker = i;
            int count = 0;

            while (checker > 0) {
                count++;
                checker /= 10;           
            }

            checker = i;
            int sum = 0;

            while (checker > 0) {
                sum += (int)Math.pow(checker%10, count);
                checker /= 10;           
            }

            if (sum == i) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
