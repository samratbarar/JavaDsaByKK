package first_java_02;

import java.util.*;

// To find out whether the given String is Palindrome or not.

public class Ques_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)) {
                System.out.println("Given string is not palindrome");
                sc.close();
                return;
            }
        }

        System.out.println("Given string is palindrome");

        sc.close();
    }
}