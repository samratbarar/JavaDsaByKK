package bitwise_oper_25;

import java.util.*;

public class NoOfDigitsOfBaseBNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base and decimal form of number");
        int b = sc.nextInt(), num = sc.nextInt();

        if (b < 2 || num <= 0) {
            System.out.println("Invalid input!");
        } else {
            int digits = (int) (Math.log(num) / Math.log(b)) + 1;
            System.out.println("The number of digits is " + digits);
        }

        sc.close();
    }
}
