package first_java_02;

import java.util.*;

// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

public class Ques_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principal amount(in rupees), time(in years) and rate(in %) ");
        double prin = sc.nextDouble(), time = sc.nextDouble(), rate = sc.nextDouble();
        
        System.out.println("The simple interest is " + (prin * time * rate) / 100);

        sc.close();
    }
}