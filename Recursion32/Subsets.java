package Recursion32;

import java.util.*;

public class Subsets {
    public static void subsets(String str, String subStr) {
        if (str.isEmpty()) {
            System.out.println(subStr + " ");
            return;
        }

        subsets(str.substring(1), subStr + str.charAt(0));
        subsets(str.substring(1), subStr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        subsets(sc.nextLine(), "");

        sc.close();
    }
}