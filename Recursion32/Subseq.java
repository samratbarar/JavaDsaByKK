package Recursion32;

import java.util.*;

public class Subseq {
    public static void subseq(String str, String subStr) {
        if (str.isEmpty()) {
            System.out.println(subStr + " ");
            return;
        }

        subseq(str.substring(1), subStr + str.charAt(0));
        subseq(str.substring(1), subStr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        subseq(sc.nextLine(), "");

        sc.close();
    }
}