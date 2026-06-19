package first_java_02;

import java.util.*;

// Take name as input and print a greeting message for that particular name.

public class Ques_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name ");
        System.out.println("Hello, " + sc.nextLine() + ", Good morning");

        sc.close();
    }
}
