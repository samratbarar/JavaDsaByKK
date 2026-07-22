package Recursion34;

import java.util.*;

public class DiceCom {
    static void com(int diceNum, String com) {
        if (diceNum == 0) {
            System.out.println(com);
            return;
        }

        if (diceNum < 0) {
            return;
        }

        for (int i = 1; i <= 6 && i <= diceNum; i++) {
            if ((diceNum - i) >= 0) {
                com(diceNum - i, com + i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dice number");
        com(sc.nextInt(), "");

        sc.close();
    }
}