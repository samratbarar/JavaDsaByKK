package patterns_22;

import java.util.Scanner;

/*
Program to print below pattern
    4 4 4 4 4 4 4  
    4 3 3 3 3 3 4   
    4 3 2 2 2 3 4   
    4 3 2 1 2 3 4   
    4 3 2 2 2 3 4   
    4 3 3 3 3 3 4   
    4 4 4 4 4 4 4
*/

public class Pattern31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        int range = 2 * n;

        for (int i = 1; i < range; i++) {
            for (int j = 1; j < range; j++) {
                // print statement nhi soch paya khud se but try kiya
                System.out.print((n+1) - (int)Math.min(Math.min(i, j), Math.min(range - i, range - j)) + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
