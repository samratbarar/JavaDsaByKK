package Recursion32;

import java.util.*;

public class Subseq {
    public static void subseq(String str, int idx, String subStr) {
        if (idx == str.length()) {
            System.out.println(subStr + " ");
            return;
        }

        subseq(str, idx + 1, subStr + str.charAt(idx));
        subseq(str, idx + 1, subStr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        subseq(sc.nextLine(), 0, "");

        sc.close();
    }
}