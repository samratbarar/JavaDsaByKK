package bitwise_oper_25;

import java.util.*;

// Find nth magic number

public class FindMagicNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        int magicNum = 0, base = 5;

        while (n > 0) {
            if ((n & 1) == 1) {
                magicNum += base;
            }
            
            base *= 5;
            n >>= 1;
        }

        System.out.println("The magic number is " + magicNum);

        sc.close();
    }
}
