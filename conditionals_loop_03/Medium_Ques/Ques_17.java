package conditionals_loop_03.Medium_Ques;

import java.util.*;

// Find if a number is palindrome or not

public class Ques_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");
        int num = sc.nextInt();

        int temp = num;
        int rev = 0;
        while (temp > 0) {
            rev = rev*10 + temp%10;
            temp /= 10;
        } 

        if (rev == num) {
            System.out.println("Given number is palindrome number");
        } else {
            System.out.println("Given number is not palindrome number");
        }

        sc.close();
    }
}
