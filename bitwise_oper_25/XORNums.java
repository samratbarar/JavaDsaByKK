package bitwise_oper_25;

import java.util.*;

public class XORNums {
    public static int xorNums(int n) {
        switch (n % 4) {
            case 0 -> {return n;}
            case 1 -> {return 1;}
            case 2 -> {return (n + 1);}
            case 3 -> {return 0;}
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number upto which you want XOR of numbers");
        int xor = xorNums(sc.nextInt());
        
        if (xor != -1) {
            System.out.println("The XOR of all numbers till n is " + xor);
        }

        System.out.println("Enter the starting point of numbers whose XOR is required");
        int xorInRange = xor ^ xorNums(sc.nextInt() - 1);

        if (xor != -1) {
            System.out.println("The XOR of all numbers between starting point and n is " + xorInRange);
        }

        sc.close();
    }
}