package Recursion33;

import java.util.*;

public class Permutations {
    public static void permu(String str, String subStr) {
        if (str.isEmpty()) {
            System.out.println(subStr + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            permu(str.substring(0, i) + str.substring(i + 1), subStr + str.charAt(i));
        }
    }

    public static void permu2(String str, String subStr) {
        if (str.isEmpty()) {
            System.out.println(subStr + " ");
            return;
        }

        char ch = str.charAt(0);

        for (int i = 0; i <= subStr.length(); i++) {
            permu2(str.substring(1), subStr.substring(0, i) + ch + subStr.substring(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        permu(sc.nextLine(), "");

        sc.close();
    }
}