package Recursion32;

import java.util.*;

public class RemoveAllA {
    static String remover(String str) {
        if (str.isEmpty()) {
            return "";
        }

        if (str.charAt(0) == 'a' || str.charAt(0) == 'A') {
            return remover(str.substring(1));
        }

        return str.charAt(0) + remover(str.substring(1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");
        System.out.println(remover(sc.nextLine()));

        sc.close();
    }
}

/*
package Recursion32;

import java.util.*;

public class RemoveAllA {
    static StringBuilder remover(StringBuilder str, int count) {
        if (count >= str.length()) {
            return str;
        }

        if (str.charAt(count) == 'a' || str.charAt(count) == 'A') {
            str.deleteCharAt(count);
            return remover(str, count);
        }

        return remover(str, count + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");
        System.out.println(remover(new StringBuilder(sc.nextLine()), 0));

        sc.close();
    }
}
*/
