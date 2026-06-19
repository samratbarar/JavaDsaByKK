package first_java_02;

import java.util.*;

// Write a program to print whether a number is even or odd, also take input from the user.

public class Ques_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        if (sc.nextInt() % 2 == 0) {
            System.out.println("Given number is even number");            
        } else {
            System.out.println("Given number is Odd");
        }

        sc.close();
    }
}