package first_java_02;

import java.util.*;

// Input currency in rupees and output in USD.

public class Ques_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter currency in rupees : ");
        System.out.println("The USD currency is " + (sc.nextDouble()*0.011));

        sc.close();
    }   
}