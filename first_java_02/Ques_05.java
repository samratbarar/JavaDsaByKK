package first_java_02;

import java.util.*;

// Take 2 numbers as input and print the largest number.

public class Ques_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers : ");
        int num1 = sc.nextInt(), num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is greater");           
        } else if (num1 == num2) {
            System.out.println("Both numbers are equal ");
        } else {
            System.out.println(num2 + " is greater");
        }

        sc.close();
    }
}
