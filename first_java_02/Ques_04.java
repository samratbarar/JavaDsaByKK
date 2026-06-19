package first_java_02;

import java.util.*;

// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

public class Ques_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the operator ");
        char oper = sc.next().charAt(0);

        System.out.println("Enter the numbers ");
        int num1 = sc.nextInt(), num2 = sc.nextInt();

        if (oper == '+') {
            System.out.println("The sum is " + (num1+num2));            
        } else if (oper == '-') {
            System.out.println("The Difference is " + (num1-num2));
        } else if (oper == '*') {
            System.out.println("The product is " + (num1*num2));
        } else if (oper == '/') {
            if (num2 == 0) {
               System.out.println("Invalid number input as divide by zero is undefined in mathematics"); 
            } else {
                System.out.println("The division is " + ((double)num1/num2));
            }
        } else if (oper == '%') {
            System.out.println("The modulus/remainder is " + (num1%num2));            
        } else {
            System.out.println("The operation is not avaiable");
        }

        sc.close();
    }
}