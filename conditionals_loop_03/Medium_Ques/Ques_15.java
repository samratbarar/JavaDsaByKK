package conditionals_loop_03.Medium_Ques;

import java.util.*;

// Find Ncr & Npr

public class Ques_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n and r");
        int n = sc.nextInt(), r = sc.nextInt();

        if (n < r) {
            System.out.println("Invalid inputs");  
            sc.close();
            return;          
        }

        int npr = 1, rFact = 1;
        for (int i = 2; i <= n; i++) {
            if (i > n-r && i <= n) {
                npr *= i;
            }

            if (i <= r) {
                rFact *= i;                
            }
        }

        System.out.println("The Ncr and Npr are " + ((double)npr/rFact) + " and " + npr);

        /* best
        if (r > n - r) {
            r = n - r;
        }

        long nPr = 1;
        long nCr = 1;

        for (int i = 0; i < r; i++) {
            nPr *= (n - i);              // nPr = n * (n-1) * ...
            nCr = nCr * (n - i) / (i + 1); // nCr built step-by-step
        }

        System.out.println("NPR = " + nPr);
        System.out.println("NCR = " + nCr);
        */

        sc.close();
    }
}
