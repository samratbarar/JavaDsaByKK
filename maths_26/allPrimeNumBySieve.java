package maths_26;

import java.util.Scanner;

public class allPrimeNumBySieve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of n");
        boolean[] primes = new boolean[sc.nextInt() + 1];

        for (int i = 2; i < primes.length; i++) {
            primes[i] = true;
        }

        for (int i = 2; i * i < primes.length; i++) {
            if (primes[i]) {
                for (int j = i * i; j < primes.length; j += i) {
                    primes[j] = false;
                }
            }
        }

        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
